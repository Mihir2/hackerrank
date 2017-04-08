package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class between2sets {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        ArrayList<Integer> vals = new ArrayList<Integer>();
        ArrayList<Integer> fin = new ArrayList<Integer>();
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        int minb = Integer.MAX_VALUE;
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
            if(minb > b[b_i]){
            	minb = b[b_i];
            }
        }
        for(int j = minb; j > 0; j--){
        	ArrayList<Integer> every = new ArrayList<Integer>();
        	for(int i = 0; i < m; i++){
        		if(b[i] % j == 0){
        			every.add(1);
            	}
        		else{
        			every.add(0);
        		}
        	}
        	if(!every.contains(0)){
        		vals.add(j);
        	}
        }

        if(vals.size() == 0){System.out.println("0");return;}
        
        for(int i = 0; i < vals.size(); i++){
        	ArrayList<Integer> every = new ArrayList<Integer>();
        	for(int j = 0; j < a.length; j++){
        		if(vals.get(i) % a[j] == 0){
        			every.add(1);
        		}
        		else{
        			every.add(0);
        		}
        	}
        	if(!every.contains(0)){
        		fin.add(vals.get(i));
        	}
        }
        System.out.println(fin.size());
    }
}
