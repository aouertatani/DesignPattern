package abstractFactory;

public class ArtDecoFurnitureFactory extends FurnitureFactory {

	@Override
	public Chair CreateChair() {
		// TODO Auto-generated method stub
		return new ArtDecoChair();
	}

	@Override
	public CoffeeTable CreateCoffeeTable() {
		// TODO Auto-generated method stub
		return new ArtDecoCoffeeTable();
	}

	@Override
	public Sofa CreateSofa() {
		// TODO Auto-generated method stub
		return new ArtDecoSofa();
	}
	
	

}
