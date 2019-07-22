package springPack;

public class Supplier {
	
	private String sname;
	private long mobile;
	private String sadd;

	
	public Supplier(){};
	
	public Supplier(String sname,  long Mobile, String sadd)
	{
		this.sname=sname;
		this.mobile=mobile;
		this.sadd=sadd;
		
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	
	
	

}
