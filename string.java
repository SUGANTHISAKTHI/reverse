package string;
import java.util.Scanner;
public class string {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String r=s.next();
		String reverse=new StringBuffer(r).reverse().toString();
		System.out.println(""+reverse);;
		
	}

}
