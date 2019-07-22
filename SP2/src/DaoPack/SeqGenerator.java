package DaoPack;

public class SeqGenerator {
	private String prefix;
	private int initial;
	private String suffix;
   int counter;
	
	public SeqGenerator(){
		super();
	}
	public SeqGenerator(String prefix, int initial, String suffix) {
		super();
		this.prefix = prefix;
		this.initial = initial;
		this.suffix = suffix;
		
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public int getInitial() {
		return initial;
	}
	public void setInitial(int initial) {
		this.initial = initial;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public synchronized String getSequence()
	{
	       
	       StringBuffer buffer = new StringBuffer();
	       buffer.append(prefix);
	       buffer.append(initial + counter++);
	       buffer.append(suffix);
	       return buffer.toString();
	}


}
