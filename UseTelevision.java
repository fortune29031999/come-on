package review;

public class UseTelevision {

	public static void main(String[] args) {
		String[]a=args[0].split(",");
		String[]b=args[1].split(",");
		Remote r=new Remote(a[0],Integer.parseInt(a[1]),a[2]);
		Television t=new Television(b[0],Integer.parseInt(b[1]),b[2],r);
		//System.out.println(t);
		System.out.println(t); 
		
	}

}
