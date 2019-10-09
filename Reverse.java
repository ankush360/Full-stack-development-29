class Reverse{
	public static void main(String[] args) {
	java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.println("Enter a String to reverse:");
	String str=scan.nextLine();
	//System.out.println(str.substring(str.length()-1,0));
	String rev="";
	int len=str.length();
	for(int i=len-1;i>=0;i--){
		char s=str.charAt(i);
		rev+=String.valueOf(s);
	}
	System.out.println("Reverse of entered string:"+rev);


	}
}