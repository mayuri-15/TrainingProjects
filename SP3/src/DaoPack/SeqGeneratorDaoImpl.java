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
	public void displayRecord(String s) {
		// TODO Auto-generated method stub
		Object [] para={s};
		SeqGenerator sp=jdt.queryForObject("select * from SequenceGen where prefix=?",para,new SequenceRowMapper());
		System.out.println("Prefix: "+sp.getPrefix()+"\nInitial: "+sp.getInitial()+"\nSuffix: "+sp.getSuffix());
		String pre2=sp.getPrefix();
		int h2=sp.getInitial();
		String suf2=sp.getSuffix();
		SeqGenerator seq=new SeqGenerator(pre2,h2,suf2);
		 for(int i=0;i<10;i++)
	        {
	                        System.out.println(seq.getSequence());
	        }
		
	}


	public int insertObj(SeqGenerator sg) {
		
		Object []param={sg.getPrefix(), sg.getInitial(), sg.getSuffix()};
		
		int n=jdt.update("insert into SequenceGen values(?,?,?)", param);
		
		return n;
	}


	


	

}
