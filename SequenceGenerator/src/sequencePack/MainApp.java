package sequencePack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        SeqGenerator gen=(SeqGenerator)context.getBean("xyz");
        for(int i=0;i<10;i++)
        {
                        System.out.println(gen.getSequence());
        }
        

	}

}
