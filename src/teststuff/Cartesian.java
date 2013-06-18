package teststuff;
import java.util.*;
public class Cartesian {
	public static void main(String[] args) {
		TreeMap<String, Integer> myMap = new TreeMap<String, Integer>();
		myMap.put("ak", 50);  myMap.put("co", 60);
		myMap.put("ca", 70);  myMap.put("ar", 80);
		NavigableMap<String, Integer> myMap2 = myMap.headMap("d", true);
		myMap.put("fl", 90);
		myMap2.put("al", 110);
		System.out.println(myMap.size() + " " + myMap2.size());
	}
}