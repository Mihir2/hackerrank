package hackerrank;
import java.util.Scanner;
public class sumofarr 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		String arr = in.nextLine();
		int inNum = Integer.parseInt(num);
		String[] strArr = arr.split(" ");
		for(int i = 0; i < inNum; i++)
		{
			System.out.println(strArr[i]);
		}
	}
}
