package abstractFactory;

public class ModernFurnitureFactory extends FurnitureFactory{

	@Override
	public Chair CreateChair() {
		// TODO Auto-generated method stub
		return new ModernChair();
		
	}

	@Override
	public CoffeeTable CreateCoffeeTable() {
		// TODO Auto-generated method stub
		return new ModernCoffeeTable();
	}

	@Override
	public Sofa CreateSofa() {
		// TODO Auto-generated method stub
		return new ModernSofa();
	}

}
