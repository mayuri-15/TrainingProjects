public class BusinessClass {
      EmployeeDao dao;

	public BusinessClass() {
		super();
	}

	public BusinessClass(EmployeeDao dao) {
		super();
		this.dao = dao;
	}
      
    public void insertRow(){
    	
    	Employee e1=new Employee("John",26,"Manager");
    	int n=dao.insertObj(e1);
    	
    	if(n > 0){
    		System.out.println("Record Inserted");
    	}
    }
}
