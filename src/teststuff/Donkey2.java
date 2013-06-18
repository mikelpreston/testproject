package teststuff;
import java.util.Scanner;


public class Donkey2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner("One,5,true,3,true,6,7,false");
		scanner.useDelimiter(",");
		while ( scanner.hasNext() )
		{
			if ( scanner.hasNextBoolean() )
			{
				System.out.println(scanner.next());
			}
			
			else
			{
				scanner.nextBoolean();
			}
		}
	}

}
