class Palindrome{

public static void main(String[] args) {
	java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.println("Enter a String:");
	String str=scan.nextLine();

	StringBuffer buf=new StringBuffer();
	buf.append(str);
	String rev=(buf.reverse()).toString();
	if(str.equals(rev)){
		System.out.println("Entered string is a palindrome");

	}
	else{
		System.out.println("Entered string is not a palindrome");
	}
}
}