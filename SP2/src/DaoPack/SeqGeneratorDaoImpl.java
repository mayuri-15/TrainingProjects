package DaoPack;

import org.springframework.jdbc.core.JdbcTemplate;

public class SeqGeneratorDaoImpl implements SeqGeneratorDao{
	JdbcTemplate jdt;


	public SeqGeneratorDaoImpl() {
			super();
		}


	public SeqGeneratorDaoImpl(JdbcTemplate jdt) {
		super();
		this.jdt = jdt;
	}


	public int insertObj(SeqGenerator sg) {
		
		Object []param={sg.getPrefix(), sg.getInitial(), sg.getSuffix()};
		
		int n=jdt.update("insert into SequenceGen values(?,?,?)", param);
		
		return n;
	}


	


	

}
