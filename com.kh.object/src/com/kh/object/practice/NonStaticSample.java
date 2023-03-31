package com.kh.object.practice;

public class NonStaticSample {
	public void printLottoNumbers() {
		// 1 ~ 45 까지의 임의의 정수 출력
		// 중복을 제거
		
		// 0 <= random < 1
		// 0 <= random < 45 (*45)
		// 1 <= random < 46 (+1)
		// 1 ~ 45
		
		// 6개의 수를 저장할 공간을 생성
		int[] lotto = new int[6];
		
		// i : 0, 1, 2, 3, 4, 5
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			// 중복체크
			// 동일한 숫자가 입력되었는지 체크
			// j=0
			// j=0, 1, 2, 3, 4, 5
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
			
		}
		
		
		// 방을 바꿀때 필요한 저장공간을 생성
		int temp = 0;
		// 순서대로 정렬하기
		for(int i=0; i<lotto.length; i++) {
			// 오름차순/내림차순
			for(int j=i; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					// 방바꾸기
					temp = lotto[i];
					// 작은수가 앞으로 올 수 있도록 자리바꿈
					lotto[i] = lotto[j];
					// 큰 수를 뒤로 이동
					lotto[j] = temp;
							
				}
			}
		}
		
		System.out.println("Lotto Number");
		for(int num : lotto) {
			System.out.print(num + " ");
		}
		System.out.println();
		// int num = (int)Math.random() * 45 + 1;
	}
	
	public void outputChar(int num, char c) {
		// 입력받은 수자만큼 반목문을 실행
		for (int i=0; i<num; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
		
	}
	
	public char alphabette() {
		// 문자코드
		// A ~ Z = 65 ~ 90
		// a ~ z = 97 ~ 122
		// 91 ~ 96번까지 공백이므로 처리필요
		// 임의의 수를 생성
		// 숫자를 추출해서 char타입으로 변환.
		// 65 ~ 122
		// *n을 했을때 랜덤의 범위
		// 0 ~ n-1
		// 0 <= random <1
		// *122+1
		// 1 ~ 122
		// 66 ~ 187
		// (int)(Math.random()*122+1)
		// 122+1 - 65 = 58
		int num = (int)(Math.random()*58 + 65);
		System.out.println((char)num);
		return (char)num;
	}
	
	public String mySubstring(String str, int index1, int index2) {
		// 문자열의 인덱스값을 이용하여 문자열을 추출
		// 시작인덱스는 포함하고 끝인덱스는 불포함
		// 문자열 추출시 이용
		System.out.println(str.substring(index1, index2));
		return str.substring(index1, index2);
	}

}
