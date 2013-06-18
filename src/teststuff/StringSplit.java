package teststuff;



class StringSplit {
	public static void main(String [] args) {
		String s = "x1234 y56 z7 a";
		String [] sa = s.split("\\d");
		int count = 0;
		System.out.println("string: " + s);
		for( String x : sa)
		{
			count++;
			System.out.println("string: " + count + " is :\"" + x + "\"");
		}
		System.out.println("total: " + count);
		
		String s2 = "foobar";
		
		String s3 = s2.substring(1, 4); // both zero indexed, end is eclusive of
		System.out.println(s3);
				
	}
}
