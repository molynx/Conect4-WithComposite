package usantatecla.connect4.controllers;

import usantatecla.connect4.controllers.ControllersVisitor;
import usantatecla.connect4.models.Game;
import usantatecla.connect4.models.Session;
import usantatecla.connect4.models.State;

public class StartController extends Controller implements AcceptorController{


    public StartController(Session session) {
		super(session);
	}

	public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
