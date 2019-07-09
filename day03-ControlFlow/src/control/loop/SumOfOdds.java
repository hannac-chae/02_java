package control.loop;

public class SumOfOdds {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while (num <= 100) {
			if (num % 2 == 1) {
				sum += num;
			}
			num++;
		}
		
		System.out.printf("0 ~ 100 사이 홀수의 합 : %d%n", sum);
	}

}
