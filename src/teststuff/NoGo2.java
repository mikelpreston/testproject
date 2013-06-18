package teststuff;

class NoGo2 implements Runnable {
   private static int i;
  public synchronized void run() {
     if (i%10 != 0) { i++; }
     for(int x=0; x<10; x++, i++)
      { if (x == 4) Thread.yield(); }
   }
   public static void main(String [] args) {
    NoGo2 n = new NoGo2();
    for(int x=0; x<101; x++) {
      new Thread(n).start();
      System.out.print(i + " ");
 } } }