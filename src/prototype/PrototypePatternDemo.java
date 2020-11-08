package prototype;

public class PrototypePatternDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ShapeCache sh = new ShapeCache();
		Shape s= sh.getShape("Square");
		Shape s1= sh.getShape("Rectangle");
		Shape c= sh.getShape("Circle");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(c);
	}
}
