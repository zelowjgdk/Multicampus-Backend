package algorithm.ch00;

public class ex02 {
	public static void main(String[] args) {

		// 1) 배열을 만드는 방법1
		// 배열을 만들 때 부터 값을 알고 있는 경우

		int[] ages = { 60, 50, 30, 20, 10 }; // 초기값으로 생성

		// 2) 배열을 만드는 방법2
		// 배열을 만들 때는 값을 모르고 있다가 나중에 넣은 경우

		double[] weight = new double[5]; // 초기값 0으로 초기화
		weight[0] = 77.8;
		weight[1] = 45.5;
		weight[2] = 88.5;
		weight[3] = 99.5;
		weight[4] = 35.5;

		// for 문 2가지
		// 1) c타입

		for (int i = 0; i < weight.length; i++) {
			System.out.print(ages[i] + " " + weight[i] + "/ ");
		}

		// 2) for-each

		for (double d : weight) {
			System.out.println(d);
		}
	}
}
