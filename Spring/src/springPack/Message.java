package springPack;

public class Message {
private String str;
public Message(){}
public Message(String str)
{
	super();
	this.str=str;
}

public String getStr() {
	return str;
}

public void setStr(String str) {
	this.str = str;
}
/*public void displayInfo(){  
    System.out.println(str);  
}  */

public void init(){
	System.out.println("Initiallizing spring bean");
}
public void destroy(){
	System.out.println("Destroying the spring bean");
}
}
