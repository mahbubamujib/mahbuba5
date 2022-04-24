package polymorphism;

public class Testclass {
//public static void main(String[] args) {
//	Blueclass b=new Blueclass();
//	b.cat();
//	 b=new Greenclass();
//	 b.cat();
//	 b=new Yellowclass();
//	 b.cat();
//	 
//}
	
//public static void main(String[] args) {
//	Shape s= new Shape();
//	Rectangle r=new Rectangle(10,20);
//	Triangle t= new Triangle(20,30);
//	System.out.println(s.area());
//	System.out.println(r.area());
//	System.out.println(t.area());
//	
//}

public static void main(String[] args) {
	

	Shape [] s=new Shape[3];
	s[0]=new Shape();
	  s[1]=new Rectangle(10,20);
	s[2]=new Triangle(20,30);
	for(int i=0;i<3;i++) {
		System.out.println(s[i].area()); 
	}
	
}

}

	



	
	
	
	
	
	
	
	



