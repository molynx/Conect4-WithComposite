package usantatecla.connect4.models;

import java.util.ArrayList;
import java.util.List;

public class Registry {
	
	private List<Memento> mementos;
	private Game game;
	private int firstPrevious;
	
	Registry(Game game) {
		this.game = game;
		this.reset();
	}

	void reset() {
		this.firstPrevious = 0;
		this.mementos = new ArrayList<>();
		this.mementos.add(this.firstPrevious, this.game.createMemento());
	}

	void register() {
		for (int i = 0; i < this.firstPrevious; i++) {
			this.mementos.remove(i);
		}
		this.firstPrevious = 0;
		this.mementos.add(this.firstPrevious, this.game.createMemento());
	}

	void undo() {
		assert this.undoable();

		this.firstPrevious++;
		this.game.setMemento(this.mementos.get(this.firstPrevious));
	}

	void redo() {
		assert this.redoable();

		this.firstPrevious--;
		this.game.setMemento(this.mementos.get(this.firstPrevious));
	}

	boolean undoable() {
		return this.firstPrevious < this.mementos.size() - 1;
	}

	boolean redoable() {
		return this.firstPrevious >= 1;
	}
}
