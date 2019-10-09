import java.util.*;
class Split{
	int i=0;
	public static String[] mySplit(String str, String delimiter){
		int len=str.length();
		
		ArrayList<String> arr=new ArrayList<String>();
		String s=str.replaceAll(delimiter,"#");
		int pos=0;
		int index=0;
		String sub="";
		int len2=s.length();
		for(int i=0;i<len2;i++){
			if(s.substring(i,i+1).equals("#")){
				sub=s.substring(pos,i);
				
				arr.add(sub);
				pos=pos+sub.length()+1;		
			}
		}
		arr.add(s.substring(pos,len2));
		String splitArr[]=new String[arr.size()];

		for(int i=0;i<arr.size();i++){
			splitArr[i]=arr.get(i);
		}


			

		return splitArr;
	}
	public static void main(String[] args) {
	java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.println("Enter a String:");
	String str=scan.nextLine();
	System.out.println("Enter a delimiter:");
	String delimiter=scan.nextLine();
	String arr[]=Split.mySplit(str,delimiter);
	System.out.println("Split array:");
	for(String val:arr){
		System.out.println(val);
	}
	
	
	}
}