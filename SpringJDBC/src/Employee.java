public class Employee {
	private String ename;
	private int age;
	private String post;
	
	public Employee(){
		super();
	}
	public Employee(String ename, int age, String post) {
		super();
		this.ename = ename;
		this.age = age;
		this.post = post;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	

}
