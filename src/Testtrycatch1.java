
public class Testtrycatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try {
	  int data=786/0;
  }
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");
		
		
	}

}
