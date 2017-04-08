package hackerrank;

import java.util.Scanner;

public class maxmin {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        arr[0] = in.nextLong();
        arr[1] = in.nextLong();
        arr[2] = in.nextLong();
        arr[3] = in.nextLong();
        arr[4] = in.nextLong();
        long min = Long.MAX_VALUE;
        long max = 0;
        for(int i = 0; i < 5; i++){
        	long sum = 0;
        	for(int j = 0; j < 5; j++){
        		if(j != i){
        			sum = sum + arr[j];
        		}
        	}
        	if(min > sum)
        	{
        		min = sum;
        	}
        	if(max < sum){
        		max = sum;
        	}
        }
        System.out.print(min + " ");
        System.out.println(max);
    }
}
