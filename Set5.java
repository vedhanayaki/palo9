package player;
import java.util.Scanner;
public class Set5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the String");
Scanner s=new Scanner(System.in);
String a=s.next();
StringBuffer b=new StringBuffer(a).reverse();
String c=b.toString();
if(a.equalsIgnoreCase(c)){
	System.out.println("String is Palindrome");
}
else{
	System.out.println("String is not a Palindrome");
}
	}

}
