package prototype;

import java.util.HashMap;

public class ShapeCache {

	private HashMap<String, Shape> shapeMap;

	public ShapeCache() {
		super();
		this.shapeMap = new HashMap<String, Shape>();
		loadCache();
	}
	
	//Cloner l'objet
	public Shape getShape(String type) throws CloneNotSupportedException {
		Shape s = shapeMap.get(type);
		return s.clone();
	}

	public void loadCache() {
		//Remplir HashMap
		shapeMap.put(Circle.class.getSimpleName(),new Circle());
		shapeMap.put(Rectangle.class.getSimpleName(),new Rectangle());
		shapeMap.put("Square",new Square());
		
	}

}
