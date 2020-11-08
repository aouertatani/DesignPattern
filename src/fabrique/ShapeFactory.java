package fabrique;

public class ShapeFactory {

	// Cloner l'objet
	public Shape getShape(String type) throws ShapeTypeNotFound {
		Shape s = new Shape();
		if ("Circle" == type) {
			s = new Circle();
		} else if ("Square" == type) {
			s = new Square();
		} else if ("Rectangle" == type) {
			s = new Rectangle();
		} else {
			throw new ShapeTypeNotFound("Le type de Shape est introuvable");
		}

		return s;
	}

}
