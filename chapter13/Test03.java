package chapter13;

class Solid {
}

class Liquid {
}

class Book extends Solid {
}

class Pencil extends Solid {
}

class Note extends Solid {
}

class Water extends Liquid {
}

class Coffee extends Liquid {
}

class Bag<T extends Solid> {
	T thing;
	String owner;

	public Bag(T thing) {
		thing = thing;
	}

	public T getThing() {
		return thing;
	}

	String getOwner() {
		return owner;
	}

	// return item;
	boolean isSameOwner(Bag<?> obj) {
		if (this.owner.equals(obj.getOwner()))
			return true;
		return false;
	}

}

public class Test03 {
	public static void main(String[] args) {
		Bag<Book> bag = new Bag<>(new Book());
		Bag<Pencil> bag1 = new Bag<>(new Pencil());
		// bag = bag1;
		bag.isSameOwner(bag1);
	}

}
