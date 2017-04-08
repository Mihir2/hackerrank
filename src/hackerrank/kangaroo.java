package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int add1 = x1;
        int add2 = x2;
        if(v2 > v1 && x2 > x1){
        	System.out.print("NO");
        	return;
        }
        while(add1 != add2){
        	add1 = add1 + v1;
        	add2 = add2 + v2;
        	if(add2 < add1){
        		System.out.println("NO");
        		return;
        	}
        }
        System.out.println("YES");
    }
}
