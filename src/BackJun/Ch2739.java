package BackJun;

import java.util.Scanner;

public class Ch2739 {
	public static void main(String[] args) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		result = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(result + " * " + i + " = " + result*i);
		}
		
	}

}
