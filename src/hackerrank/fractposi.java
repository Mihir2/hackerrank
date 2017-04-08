package hackerrank;

import java.util.Scanner;

public class fractposi {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		float size = Integer.parseInt(in.nextLine());
		String[] strarr = in.nextLine().split(" ");
		int posi=0,negi=0,zero=0;
		for(int i = 0; i < size; i++){
			int ele = Integer.parseInt(strarr[i]);
			if(ele > 0){
				posi = posi + 1;
			}
			else if(ele < 0){
				negi = negi + 1;
			}
			else if(ele == 0){
				zero = zero + 1;
			}
		}
		System.out.println(posi/size);
		System.out.println(negi/size);
		System.out.println(zero/size);	
	}
}
