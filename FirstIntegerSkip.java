package review;

public class FirstIntegerSkip {

	public static void main(String[] args) {
		String a= "abc1234cba";
		//char[]b=a.toCharArray();
		int c=0;
		String d="";
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='0'&&a.charAt(i)<='9'&&c==0) {
				c=1;
			}
			else {
				d=a.charAt(i)+d;	
			}
		}
		System.out.println(d);

	}

}
