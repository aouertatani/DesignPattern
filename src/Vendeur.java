public class Vendeur {
	int age;
	String nom;
	static Vendeur instance = null;

	public Vendeur() {
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public static Vendeur getInstance() {
		if (instance == null) {
			instance = new Vendeur();
		}
		return instance;

	}

	public static void main(String[] args) {
		Vendeur vendeur1 = getInstance();
		Vendeur vendeur2 = getInstance();

		System.out.println(vendeur1);
		System.out.println(vendeur2);
	}

}
