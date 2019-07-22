package AnnoPack;
import java.sql.*;
import org.springframework.jdbc.core.RowMapper;

public class SequenceRowMapper implements RowMapper<Sequence> {
	

		
		public Sequence mapRow(ResultSet rs,int rownum) throws SQLException{
			Sequence sp=new Sequence(rs.getString(1),rs.getInt(2),rs.getString(3));
			return sp;
		
		}


}
