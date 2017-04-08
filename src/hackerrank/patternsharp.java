package hackerrank;

import java.util.Scanner;

public class patternsharp {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		for(int i = 0; i < size; i++){
			for(int j = 1; j < size - i; j++){
				System.out.print(" ");
			}
			for(int k = size - i - 1; k < size; k++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
