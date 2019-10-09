import java.util.*;
class Split2{

	public static String[] mySplit(String str, String delimiter){
		int len=str.length();
		
		ArrayList<String> arr=new ArrayList<String>();
	
		int pos=0;
		String sub="";
		
		for(int i=0;i<len;i++){
			for(int j=i+1;j<=len;j++){
				sub=str.substring(i,j);
			if(sub.equals(delimiter)){
				sub=str.substring(pos,i);
				//System.out.println(sub+"@");
				arr.add(sub);
				pos=pos+sub.length()+delimiter.length();		
			}
		}
	}
		arr.add(str.substring(pos,len));
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
	String arr[]=Split2.mySplit(str,delimiter);
	System.out.println("Split array:");
	for(String val:arr){
		System.out.println(val);
	}
	
	
	}
}