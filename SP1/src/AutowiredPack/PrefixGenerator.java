package AutowiredPack;

import org.springframework.beans.factory.annotation.Value;

public class PrefixGenerator {
	
	@Value("FY")
	private String prefix;

	
	public PrefixGenerator(){
		super();
	}
	public PrefixGenerator(String prefix) {
		super();
		this.prefix = prefix;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	

}
