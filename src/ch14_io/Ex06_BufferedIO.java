package ch14_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * FileXXXStream vs. BufferedXXXStream
 */
public class Ex06_BufferedIO {

	public static void main(String[] args) throws Exception {
		// Case 1
		FileInputStream fis = new FileInputStream("c:/Temp/subway1.png");
		FileOutputStream fos = new FileOutputStream("c:/Temp/target1.png");
		
		// Case 2
		FileInputStream fis2 = new FileInputStream("c:/Temp/subway2.png");
		FileOutputStream fos2 = new FileOutputStream("c:/Temp/target2.png");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		// 성능 비교
		long noBufferTime = copy(fis, fos);		// 16.0 초
		System.out.println("버퍼 미사용: " + noBufferTime + " ns");
		long bufferTime = copy(bis, bos);		// 0.08 초
		System.out.println("버퍼 사용: " + bufferTime + " ns");
		
		bis.close(); bos.close(); fis2.close(); fos2.close();
		fis.close(); fos.close();
	}

	static long copy(InputStream is, OutputStream os) throws Exception {
		long startTime = System.nanoTime();
		// 1바이트 단위로 읽고 쓰기
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long endTime = System.nanoTime();
		return endTime - startTime;
	}
}
