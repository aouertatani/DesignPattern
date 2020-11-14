package abstractFactory;

public abstract class FurnitureFactory {
	
	public static FurnitureFactory getFactory(String type)
	{
		if (type.equals("0")) {
		return new ArtDecoFurnitureFactory();	
		}
		else if (type.equals("1")) {
		return new VictorianFurnitureFactory();
		}
		else {
			return new ModernFurnitureFactory();
		}
		
	}
	
	public abstract Chair CreateChair();
	public abstract CoffeeTable CreateCoffeeTable();
	public abstract Sofa CreateSofa();
	
}
