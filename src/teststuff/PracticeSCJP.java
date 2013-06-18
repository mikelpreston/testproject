package teststuff;
import java.util.ArrayList;
import java.util.List;


public class PracticeSCJP {

	static final int[] a = new int[] {1,2};
	static final int[] b ={1,2};
	
	private int c = 2;
	
	public static void main(String...args)
	{
		takeList(new ArrayList<String>());
		
//		 foo;
		
		new PracticeSCJP().new InnerClass().innerMethod();
	}
	
	public static void takeList( List<? extends String> list)
	{
//		list.add(new Object());
		SerialisedAnimal.Doggy doggy = new SerialisedAnimal.Doggy();
		
		Runnable r = new Runnable() { 
			public void run() { /** do something */ } 
			};
		r.run();
		
		Thread.currentThread().interrupt();
	}
	
	public class InnerClass
	{
		public void innerMethod()
		{
			int myint = PracticeSCJP.this.c;
		}
		
	}
}
