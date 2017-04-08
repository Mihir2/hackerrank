package hackerrank;

import java.util.Scanner;

public class gradingStudent {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
    	for(int a0 = 0; a0 < n; a0++){
    		int grade = in.nextInt();
    		if(grade > 37){
    			if(5*(grade/5 + 1) - grade < 3){
    				System.out.println(5*(grade/5 + 1));
    			}
    			else
    			{
    				System.out.println(grade);
    			}
    		}
    		else
    		{
    			System.out.println(grade);
    		}
    	}
	}
}
