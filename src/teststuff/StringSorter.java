package teststuff;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.event.TreeSelectionEvent;


public class StringSorter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = { "foo", "_", "1", "FOO", "BAR", " hmm"," HMM"," 1", "4", "3" };
		
		Arrays.sort(strings);
		
		for ( String s : strings)
		{
			System.out.println("String is " + s);
		}
		
		Set set = new HashSet();
		TreeSet ts = new TreeSet(set);
		
		double d = 1232.345;
		
		System.out.format("|%f|", d);
		
		System.out.format("|%f|", 12342423.2);
		String tosplit = "asd . 45 asdasdf. dsf.";
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(tosplit);
		while ( m.find() )
		{
			System.out.println("found " + m.start());
		}
		
		String[] splitted = tosplit.split("d");
		
		for ( String g : splitted)
		{
			System.out.println(g);
		}
		
		Scanner scan = new Scanner(tosplit);
		scan.useDelimiter(",");
		
		Locale l = Locale.getDefault();
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,l);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(l);
		
		
		String x = scan.findInLine("\\.");
		System.out.println("found x " + x);
	}
	
	interface foo{
		int bar = 0;
	
	}

}
