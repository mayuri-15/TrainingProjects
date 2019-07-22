package sequencePack;

public class SeqGenerator {
	private String prefix;
	private String suffix;
	private int initial;
	public int counter;

	public SeqGenerator(){
		super();
	}
	public SeqGenerator(String prefix, String suffix, int initial) {
		super();
		this.prefix = prefix;
		this.suffix = suffix;
				this.initial = initial;
	}
	public String getPrefix() {
	       return prefix;
	}
	public void setPrefix(String prefix) {
	       this.prefix = prefix;
	}
	public String getSuffix() {
	       return suffix;
	}
	public void setSuffix(String suffix) {
	       this.suffix = suffix;
	}
	public int getInitial() {
	       return initial;
	}
	public void setInitial(int initial) {
	       this.initial = initial;
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
