package fabrique;

public class FactoryPatternDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException, ShapeTypeNotFound {
		ShapeFactory sh = new ShapeFactory();
		Shape s= sh.getShape("Square");
		System.out.println(s.getClass().getSimpleName()+"    "+s);

	}
}
