 package review;

import java.util.HashMap;

public class UseCar {

	public static void main(String[] args) {
		String[]a=args[0].split(",");
		String []b=args[1].split(",");
		int c=Integer.parseInt(b[0]);
		int d=Integer.parseInt(b[1]);
		int e=Integer.parseInt(b[2]);
		
		Car c1=new Car(a[0]);
		Car c2=new Car(a[1]);
		Car c3=new Car(a[2]);
		HashMap<Integer,Car>h= new HashMap<>(); 
		h.put(c,c1);
		h.put(d, c2);
		h.put(e, c3);
	//	for(Car values:h.values()) {
		//	System.out.println(values);
	//	}
		h.forEach((x,y)->System.out.println(y));;

	}

}
