package teststuff;

public class Organic<E> {

	void react(E e) { }
	
	/**
	 * @param args
	 */
	static void main(String[] args) {
		// TODO Auto-generated method stub

		// Organic<? extends Organic> compound = new Aliphatic<Organic>(); // doesn't work becaues the declaration is generic
		// Organic<Organic> compound = new Aliphatic<Organic>(); // does work
		 Organic<? super Hexane> compound = new Aliphatic<Organic>(); // doesn't work becaues the declaration is generic		
		
//		compound.react(new Organic());
//		compound.react(new Aliphatic());
		compound.react(new Hexane());
		compound.react(new HexaneChild());
	}

}

class Aliphatic<F> extends Organic<F> {}
class Hexane<G> extends Aliphatic<G> {}
class HexaneChild<F> extends Hexane<F> {}
