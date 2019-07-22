package DaoPack;
import java.sql.*;
import org.springframework.jdbc.core.RowMapper;

public class SequenceRowMapper implements RowMapper<SeqGenerator> {
	

		
		public SeqGenerator mapRow(ResultSet rs,int rownum) throws SQLException{
			SeqGenerator sp=new SeqGenerator(rs.getString(1),rs.getInt(2),rs.getString(3));
			return sp;
		
		}


}
