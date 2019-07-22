package springPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args)
	{
      ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        Message msg1=(Message) context.getBean("msgBean");
       // System.out.println(msg1.getStr());
       //msg1.displayInfo();
       msg1.setStr("right");
        //System.out.println(msg1.getStr());
        
        Message msg2=(Message) context.getBean("msgBean");
        msg2.setStr("wrong");
        System.out.println(msg1.getStr());
        System.out.println(msg2.getStr());
		
		
		ApplicationContext context1=new ClassPathXmlApplicationContext("Beans.xml");
        Product prod=(Product) context1.getBean("prodBean");
        
        System.out.println("The product code "+prod.getCode()+" of product name "  +prod.getName()+ " whose price is " +prod.getPrice());
        
        Product prod1=(Product) context1.getBean("newBean");
        prod1.setPrice(25);
        System.out.println("The product code "+prod1.getCode()+" of product name "  +prod1.getName()+ " whose updated price is " +prod1.getPrice());
		
	}
}

