package review;

public class Television  { //extends Remote{
	private String brand;
	private int price;
	private String model;
	private Remote remote;

public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Remote getRemote() {
		return remote;
	}
	public void setRemote(Remote remote) {
		this.remote = remote;
	}
	public Television (String brand,int price,String model,Remote remote) {
		//super( brand,price,model);
		this.brand=brand;
		this.price=price;
		this.model=model;
		this.remote=remote;
		
	}
	public String toString() {
		return "Brand="+brand+", price="+price+", model="+model+remote ;//+super.toString();
	}


}
