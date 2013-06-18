package teststuff;
import java.applet.Applet;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Random test class for arrays
 * @author MCMikey
 *
 */
public class Eggs {
	public static void main(String[] args) {
		int[][] basket1 = new int[2][];
		basket1[0] = new int[3];
		basket1[0] = new int[] {1,2};

		int[][] basket2 = new int[2][];
		basket2[0] = new int[] {1,2,3};
		basket2[0][1] = 7;
		System.out.println(basket1[0][1] + " " + basket2[0][1]);
		
		int[] basket3 = {1,2};
		
		int[][] basket4 = {{1,0},{3,4}};
		
		int[][] basket5 = new int[2][2];
		
		basket5[0] = new int[] {2,3,4,5};
		
		System.out.println(basket5[0][3]);
//		// Question 12 exam 1
//		List list = new ArrayList();
//		
//		//a
//		for(Object o ; list)
//		{
//			
//		}
//		//b
//		for(Object o : list.iterator())
//		{
//			
//		}
//		//c
//		for(Object o : getCollection())
//		{
//			
//		}
//		//d
//		for(Iterator i ; list.iterator() ; i.hasNext() )
//		{
//			
//		}
//		//e
//		for(Iterator i = list.iterator(); i.hasNext(); ) 
//		{
//			
//		}
		
	}

	private static List getCollection() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public class Base
	{
		public void methodA() throws EOFException
		{
			
		}
	}
	
	public class SubClass extends Base
	{
		public void methodA()
		{
			
		}		
	}
}
