package com.chap2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileIO {

	public static void main(String[] args) {
		FileIO io = new FileIO();
		long start, end;
		start = System.currentTimeMillis();
		io.fileIOCopy();
		end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start));
	}
	/**
	 * 파일 복사하기
	 * 
	 * A_File.java 파일을 읽어서
	 * A_File_copy.java 파일을 생성합니다.
	 */
	public void fileIOCopy() {
		
		long startTime, endTime;
		// 시작시간
		startTime = System.currentTimeMillis();
		
				
		File file = new File("D:\\work\\IOEx\\src\\com\\chap1\\A_File.java");
		// 파일의 존재 여부를 확인 후 존재하지 않으면 종료
		if(!file.exists()){
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		try (FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream("A_File_copy.java")) {
				
			int value = 0;
			// 1바이트씩 읽어옵니다.
			// -1 EndOfFile
			int i = 0;
			byte[] byteArr = new byte[100];
			// 바이트 배열에 읽어온 갯수를 반환합니다.
			while((i = fis.read(byteArr)) != -1) {
				// 읽어온 갯수만큼 출력합니다.
				// 마지막 출력시 이 배열의 갯수를 모두 채우지 못하면
				// 이전에 읽어들이 내용이 출력됩니다.
				
				fos.write(byteArr,0,i);
			}
//			while((value = fis.read()) != -1) {
//				// System.out.print((char)value);
//				fos.write(value);
//			}
			
			fos.flush();
		
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime - startTime));

	}
	
	public void fileCopy() {
		// 파일 복사하기
		File file = new File("D:\\work\\IOEx\\src\\10_1_예외클래스.pptx");
		if(!file.exists()) {
			System.out.println("파일이 없습니다.");
			return;
		}
		try (FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream("10_1_예외클래스_copy.pptx")){
			
			int value = 0;
			
			while((value = fis.read()) != -1){
				fos.write(value);
			}
					
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
