package gruen.timing;

import gruen.animation.GUI;
import gruen.simulation.Simulation;

public class Timing {

	private Simulation simulation;
	
	private GUI gui;
	public Timing(Simulation simulation, GUI gui) {
		this.simulation = simulation;
		this.gui = gui;
	}
	
	protected void time(int time){
		simulation.tick(time);
		gui.tick(time);
	}

}
