package string_prgs;
import java.util.*;
public class Camel_Count {
	public static void main(String[] args) {
	 Scanner in=new Scanner(System.in);
	 System.out.println("enter string:");
	 String input = in.next();
	 int len=input.length();
	 
	 if(len == 0)
	 {
		 System.out.print(0);
		
	 }
	 int count = 1;
	 for(int i=0;i<len;i++)
	 {
		 char c=input.charAt(i);
		 if('A'<=c && c<='Z' )
			 count++;
		 else if(c == ' ')
			 break;
	 }
System.out.println(count);
	}

}
