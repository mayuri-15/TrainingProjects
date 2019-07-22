package AnnoPack;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SequenceMain {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext(JdbcConfiguration.class);
		SequenceDaoImpl sdi = ac.getBean(SequenceDaoImpl.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the prefix of your sequence");
		String s1=sc.nextLine();
		System.out.println("Enter the initial of your sequence");
		int in=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the prefix of your sequence");
		String s2=sc.nextLine();
		Sequence s = new Sequence(s1,in,s2);
		if(sdi.insert(s)>=0){
			System.out.println("Record Inserted");
		sdi.displayRecord(s1);
		}
	}
	
}
