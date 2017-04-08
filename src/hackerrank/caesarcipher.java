package hackerrank;

import java.util.Scanner;

public class caesarcipher {
	
	public static void main(String args[]){
		//System.out.println((int)'z');//65-90,97-122
		Scanner in = new Scanner(System.in);
		int size = Integer.parseInt(in.nextLine());
		String input = in.nextLine();
		int offset = Integer.parseInt(in.nextLine());
		char[] charInput = input.toCharArray();
		for(int i = 0;i < size; i++){
			if((int)charInput[i] >= 65 && (int)charInput[i] <= 90 ){//For Big letters
				//to do
			}
			else if((int)charInput[i] >= 97 && (int)charInput[i] <= 122){
				//to do
			}
		}
	}
}
