package loopexample;

public class ForExample {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for (i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		int num = 1;
		int total = 0;
		
		while (num <= 10) {
			total += num;
			num++;
		}
		System.out.println(total);
	}

}
