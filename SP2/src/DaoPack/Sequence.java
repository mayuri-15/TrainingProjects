package DaoPack;

import java.util.Scanner;

public class Sequence {
	 SeqGeneratorDao dao;
	
		public Sequence() {
			super();
		}

		public Sequence(SeqGeneratorDao dao) {
			super();
			this.dao = dao;
		}
	      
	    public void insertRow(){
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Give the prefix:");
	    	String pre= sc.nextLine();
	    	System.out.println("Give the initial value:");
	    	int h=sc.nextInt();
	    	sc.nextLine();
	    	System.out.println("Give the suffix");
	    	String suf=sc.nextLine();
	    	SeqGenerator sg=new SeqGenerator(pre,h,suf);
	    	int n=dao.insertObj(sg);
	    	
	    	if(n > 0){
	    		System.out.println("Record Inserted");

	    		
	   		 for(int i=0;i<10;i++)
	   	        {
	   	                        System.out.println(sg.getSequence());
	   	        }
	    		
	    	}
	    }

}
