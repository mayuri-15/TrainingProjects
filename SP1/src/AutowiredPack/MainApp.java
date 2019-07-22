package AutowiredPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(SeqConfig.class);
		SeqGenerator sg=(SeqGenerator) context.getBean(SeqGenerator.class);
		 for(int i=0;i<10;i++)
	        {
	                        System.out.println(sg.getSequence());
	        }
	}

}
