package prototype;

public class Shape implements Cloneable {

	protected String id;

	public String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}
	

	@Override
	protected Shape clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Shape)super.clone();
	}

}
