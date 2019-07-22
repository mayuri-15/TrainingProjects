package AutowiredPack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class SeqConfig {
	
	@Bean
	@Scope("prototype")
	public SeqGenerator getSeqGeneratorBean()
	{
		return new SeqGenerator();
	}
	
	@Bean
	@Scope("prototype")
	public PrefixGenerator getPrefixGeneratorBean(){
		return new PrefixGenerator();
	}

}
