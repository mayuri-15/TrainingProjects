package DaoPack;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {
	public static void main(String [] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		 
		   
		Sequence sgob=(Sequence) ctx.getBean("daoBean1");
		System.out.println("Do you want to store the data or retrieve it? Store or Retrieve?");
		Scanner s=new Scanner(System.in);
		String ans=s.nextLine();
		if(ans.equalsIgnoreCase("Store"))
		{
		boolean bool = true;
		while(bool==true){

			sgob.insertRow();
			System.out.println("Do you want to insert a new Sequence? Yes or no?");
			
			String newSequence = s.nextLine();
			if(newSequence.equalsIgnoreCase("Yes"))
				bool=true;
			else
				bool=false;
				
			
		}
	}
	
	     else 
	   {
		sgob.findRecord();
	   }

}
}
