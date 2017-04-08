package hackerrank;

import java.util.Scanner;

public class timeconv {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String date = in.next();
		char[] datearr = date.toCharArray();
		int[] datearrint = new int[2];
		for(int i = 0; i < 2; i++){
			String str = datearr[i] + "";
			datearrint[i] = Integer.parseInt(str); 
		}
		float time;
		time = 10*(datearrint[0]) + (datearrint[1]);
		if(datearr[8] == 'P'){
			if(time != 12){
				time = time + 12;
			}
			else if(time == 12){
				time = time;
			}
		}
		else if(datearr[8] == 'A'){
			if(time != 12){
				time = time;
			}
			else if(time == 12){
				time = time - 12;
			}
		}
		String hours;
		if((int)time/10 == 0){
			hours = "0"+(int)time;
		}
		else{
			hours = "" + (int)time;
		}
		String result = hours+date.substring(2,8);
		System.out.print(result);
    }
}
