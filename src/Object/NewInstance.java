package Object;

public class NewInstance  
{   
	void show()    
	{    
		System.out.println("A new object created.");    
	}
	
	public static void main(String[] args)   
	{   
		try  
			{  
				
				Class cls = Class.forName("NewInstance");   
				  
				NewInstance obj = (NewInstance) cls.newInstance();   
				  
				obj.show();   
			}   

			catch (ClassNotFoundException e)   
			{   
				e.printStackTrace();   
			}   
			catch (InstantiationException e)   
			{   
				e.printStackTrace();   
			}   
			catch (IllegalAccessException e)   
			{   
				e.printStackTrace();   
			}   
	}   
}  
