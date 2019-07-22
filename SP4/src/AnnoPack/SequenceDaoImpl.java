package AnnoPack;

import org.springframework.jdbc.core.JdbcTemplate;


public class SequenceDaoImpl implements SequenceDao {

	
	JdbcTemplate jdt;
	public SequenceDaoImpl(){
		super();
	}
	public SequenceDaoImpl(JdbcTemplate jdt) {
		super();
		this.jdt = jdt;
	}

	public JdbcTemplate getJdt() {
		return jdt;
	}

	public void setJdt(JdbcTemplate jdt) {
		this.jdt = jdt;
	}

	@Override
	public int insert(Sequence s) {
        Object []param={s.getPrefix(), s.getInitial(), s.getSuffix()};
		
		int n=jdt.update("insert into SequenceGen values(?,?,?)", param);
		
		return n;
	}
	@Override
	public void displayRecord(String s) {
		// TODO Auto-generated method stub
		Object [] para={s};
		Sequence sp=jdt.queryForObject("select * from SequenceGen where prefix=?",para,new SequenceRowMapper());
		System.out.println("Prefix: "+sp.getPrefix()+"\nInitial: "+sp.getInitial()+"\nSuffix: "+sp.getSuffix());
		String pre2=sp.getPrefix();
		int h2=sp.getInitial();
		String suf2=sp.getSuffix();
		Sequence seq=new Sequence(pre2,h2,suf2);
		 for(int i=0;i<10;i++)
	        {
	                        System.out.println(seq.getSequence());
	        }
		
	}
	

}
