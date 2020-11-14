package abstractFactory;

public class VictorianFurnitureFactory extends FurnitureFactory {

	@Override
	public Chair CreateChair() {
		// TODO Auto-generated method stub
		return new VictorianChair();
	}

	@Override
	public CoffeeTable CreateCoffeeTable() {
		// TODO Auto-generated method stub
		return new VictorianCoffeeTable();
	}

	@Override
	public Sofa CreateSofa() {
		// TODO Auto-generated method stub
		return new VictorianSofa();
	}

}
