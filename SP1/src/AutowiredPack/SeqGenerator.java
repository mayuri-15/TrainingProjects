package AutowiredPack;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class SeqGenerator {
	@Value("ABC")
	private String suffix;
	@Value("100")
	private int initial;
	public int counter;
	@Autowired
	private PrefixGenerator prefixGenerator;
	public SeqGenerator(){
		super();
	}
	
	public SeqGenerator(String suffix, int initial, int counter, PrefixGenerator prefixGenerator) {
		super();
		this.suffix = suffix;
		this.initial = initial;
		this.counter = counter;
		this.prefixGenerator = prefixGenerator;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public PrefixGenerator getPrefixGenerator() {
		return prefixGenerator;
	}
	public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
		this.prefixGenerator = prefixGenerator;
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
	       buffer.append(prefixGenerator.getPrefix());
	       buffer.append(initial + counter++);
	       buffer.append(suffix);
	       return buffer.toString();
	}
	

}
