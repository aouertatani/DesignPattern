package prototype;

public class Square extends Shape {
	
	
	private String type;

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}
	
	

	@Override
	protected Shape clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
