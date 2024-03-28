package review;
import java.util.Arrays;

public class arraysprintnonduplicate {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7};
		int[]b= {5,6,7,8};
		int []c= new int [a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					count++;
				}
			
			}
			if(count==0) {
				c[i]=a[i];
			}
			
		}
		for(int i=0;i<b.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					count++;
				}
			
			}
			if(count==0) {
				c[a.length+i]=b[i];
			}
		}
			System.out.println(Arrays.toString(c));
			
		
		
		

	}

}
