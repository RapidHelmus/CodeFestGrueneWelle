package gruen;

import gruen.animation.GUI;
import gruen.simulation.Simulation;
import gruen.timing.Timing;

public class GrueneWelle {

	
	private GUI gui;
	
	private Simulation simulation;
	
	private Timing timing;
	
	public GrueneWelle(){
		simulation = new Simulation();
		gui = new  GUI();
		timing = new Timing(simulation,gui);
	}
	/*
	 * Update
	 */
	public static void main(String[] args) {
		new GrueneWelle();
	}

}
