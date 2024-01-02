package algorithm.정리문제;

import java.util.Scanner;

public class 정리문제_String {

	/*
	 * 전화번호 입력 >> 011- 245-1234
	 * 
	 * 1)양쪽 공백을 제거하시오. 2)-을 기준으로 분리해내세요.(String[]) 3)첫번째 문자열이 011이면 sk, 019이면 LG,
	 * 나머지이면 Apple 4)두번째 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰 5) 전체 전화번호의 길이가 10글자 이상이면 유효한
	 * 전화번호 아니면 유효하지 않은 전화번호
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 입력 >> ");
		String phoneNumber = sc.nextLine();

		// 1) 양쪽 공백 제거
		phoneNumber = phoneNumber.trim();

		// 2) -을 기준으로 분리
		String[] parts = phoneNumber.split("-");

		// 3) 첫번째 문자열에 따라 브랜드 결정
		String brand;
		if (parts[0].equals("011")) {
			brand = "SK";
		} else if (parts[0].equals("019")) {
			brand = "LG";
		} else {
			brand = "Apple";
		}

		// 4) 두번째 문자열의 길이에 따라 폰 종류 결정
		String phoneType = (parts[1].length() >= 4) ? "최신폰" : "올드폰";

		// 5) 전체 전화번호의 길이를 확인하여 유효성 검사
		String validity = (phoneNumber.length() >= 10) ? "유효한 전화번호" : "유효하지 않은 전화번호";

		// 결과 출력
		System.out.println("브랜드: " + brand);
		System.out.println("폰 종류: " + phoneType);
		System.out.println("전화번호 유효성: " + validity);

		sc.close();
	}

}
