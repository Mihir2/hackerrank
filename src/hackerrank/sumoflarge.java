package hackerrank;

import java.util.Scanner;

public class sumoflarge {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int size = Integer.parseInt(in.nextLine());
		String[] strArr = in.nextLine().split(" ");
		long result = 0;
		for(int i = 0; i< size; i++){
			result += Integer.parseInt(strArr[i]);
		}
		System.out.println(result);
	}
}
