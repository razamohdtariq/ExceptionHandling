
public class DemoMultiCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a[]=new int[5];
			a[5]=4500/0;
		}
		
		catch(ArithmeticException e)
		{
		System.out.println("My first task is completed");	
		}
		
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("My second task is completed");
		}
		catch(Exception e)
		{
			System.out.println("common task is completed");
		}
		
		System.out.println("rest of the code");
	}

}
