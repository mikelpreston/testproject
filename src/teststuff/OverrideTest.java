package teststuff;

public class OverrideTest {

}


class Over {
   protected int doIt(long x) { return 3; }
 }

class Under extends Over {
	protected int doIt(long x) { return 3; }
 }
