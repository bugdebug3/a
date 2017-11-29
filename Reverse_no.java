import java.util.*;
class Reverse_no
{
	public static void main(String [] args)
	{
		int no,rev;
		Scanner s = new Scanner(System.in);
		no = s.nextInt();
		rev=(no%10)*100+(no%100-(no%10))+(no-(no%100))/100;
		System.out.println("Reversed is "+rev);
		
		
	}
}
