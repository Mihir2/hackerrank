package hackerrank;

import java.util.Scanner;

public class diagDiff {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int size = Integer.parseInt(in.nextLine());
		int[][] mat = new int[size][size];
		int diag1 = 0;
		int diag2 = 0;
		
		for(int i = 0; i < size; i++){
			String row = in.nextLine();
			String[] rowarr = row.split(" ");
			for(int j = 0; j < size; j++){
				mat[i][j] = Integer.parseInt(rowarr[j]);
			}
		}
		for(int i = 0,j = size - 1 ; i < size; i++,j--){
			diag1 += mat[i][j];
		}
		for(int i = 0,j = 0 ; i < size; i++,j++){
			diag2 += mat[i][j];
		}
		System.out.println(absolute(diag1,diag2));
	}

	private static int absolute(int diag1, int diag2) {
		if(diag1>diag2)
			return diag1 - diag2;
		else if (diag1<diag2)
			return diag2 - diag1;
		else
			return 0;
	}
}
