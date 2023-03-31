package com.kh.object;

import com.kh.object.practice.NonStaticSample;

public class ApplicationNonstaticSample {

	public static void main(String[] args) {
		NonStaticSample sample = new NonStaticSample();
		
		sample.printLottoNumbers();
		// char 하나의 글자를 입력합니다.
		// '' 홑따옴표 안에 입력
		// 하나의 문자를 꼭 입력해야 합니다.
		
		sample.outputChar(5, 'a');
		
		sample.alphabette();
		
		//             0 123 45
		String str = "안녕하세요. 반갑습니다.";
		// 특정 문자열을 추출하는 방법
		// code123456
		// System.out.println(str.substring(0, 6));
		
		sample.mySubstring(str, 0, 2);
		System.out.println("원본 : " + str);
	}

}
