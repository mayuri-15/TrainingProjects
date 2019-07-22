package DaoPack;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {
	public static void main(String [] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		 
		   
		Sequence sgob=(Sequence) ctx.getBean("daoBean1");
		boolean bool = true;
		while(bool==true){

			sgob.insertRow();
			System.out.println("Do you want to insert a new Sequence? Yes or no?");
			Scanner s=new Scanner(System.in);
			String newSequence = s.nextLine();
			if(newSequence.equalsIgnoreCase("Yes"))
				bool=true;
			else
				bool=false;
				
			
		}
	}

}
