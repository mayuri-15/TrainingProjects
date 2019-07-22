import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {
	
	

    JdbcTemplate jdt;


public EmployeeDaoImpl() {
		super();
	}


public EmployeeDaoImpl(JdbcTemplate jdt) {
	super();
	this.jdt = jdt;
}


public int insertObj(Employee e) {
	
	Object []param={e.getEname(), e.getAge(), e.getPost()};
	
	int n=jdt.update("insert into newTable(ename,age,post) values(?,?,?)", param);
	System.out.println(n);
	return n;
}

}
