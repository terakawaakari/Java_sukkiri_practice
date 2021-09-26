package chapter2.practice;

import java.util.Optional;

public class StrongBox<E> {
	private KeyType type;
	private E i;

	public StrongBox(KeyType type) {
		this.type = type;
	}

	public void put(E i) {
		this.i = i;
	}

	public E getItem() {
		return this.i;
	}

	int cnt = 0;
	public Optional<KeyType> getType() {
		int min = 0;
		KeyType r;
		switch (this.type) {
			case PADLOCK :
				min = 1024;
				break;
			case BUTTON :
				min = 10000;
				break;
			case DIAL :
				min = 30000;
				break;
			case FINGER :
				min = 1000000;
				break;
		}
		cnt++;

		if (cnt < min) {
			r = null;
		} else {
			r = this.type;
		}

		return Optional.ofNullable(r);
	}
}
