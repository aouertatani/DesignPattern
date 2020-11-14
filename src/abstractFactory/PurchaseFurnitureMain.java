package abstractFactory;

public class PurchaseFurnitureMain {

	public static void main(String[] args) {
		
		FurnitureFactory factory= FurnitureFactory.getFactory("1");
		
        Chair chair=factory.CreateChair();
        
        chair.ShowChair();
		
	}

}
