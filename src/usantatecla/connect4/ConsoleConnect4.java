package usantatecla.connect4;

import usantatecla.connect4.views.console.ConsoleView;

class ConsoleConnect4 extends Connect4 {

	@Override
	protected ConsoleView createView(){
		return new ConsoleView();
	}

	public static void main(String[] args) {
		new ConsoleConnect4().play();
	}

}
