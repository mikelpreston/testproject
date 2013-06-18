package teststuff;



 class Marjoram {
  public static void main(String [] args) {
  Marjoram g = new Marjoram();
     Alpha b = g.go(1);
  }
   <A extends Alpha> Alpha go(int i) {
    if (i == 1) return new Alpha();
    else return new Beta();
   }
 }
 class Alpha { }
 class Beta extends Alpha { }
