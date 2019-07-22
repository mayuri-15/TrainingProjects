package springPack;

public class NewProduct {
	private int pcode;
	private String pname;
	private double price;
	private Supplier sob;
	public NewProduct(){
		super();
	}
	
	public NewProduct(int pcode, String pname, double price, Supplier sob) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
		this.sob = sob;
	}
	public Supplier getSob(){
		return sob;
	}
	public void setSob(Supplier sob){
		this.sob= sob;
	}
	
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
