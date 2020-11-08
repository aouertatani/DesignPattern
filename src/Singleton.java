
public class Singleton {

	private static Singleton instance = null;

	private Singleton() {
	}

	public synchronized static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public static void main(String[] args) {
	 Singleton a1= getInstance();
	 Singleton a2= getInstance();
	 
	 System.out.println(a1);
	 System.out.println(a2);
	}
	

}
