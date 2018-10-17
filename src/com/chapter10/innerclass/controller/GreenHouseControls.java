package com.chapter10.innerclass.controller;

public class GreenHouseControls extends Controller {
	
	
	public static void main(String[] args){
		GreenHouseControls ghc = new GreenHouseControls();
		ghc.addEvent(ghc.new Bell(900));
		Event[] eventList = {
			ghc.new LightOn(200),
			ghc.new LightOff(400),
			ghc.new WaterOn(600),
			ghc.new WaterOff(800),
			ghc.new ThermostatDay(1400),
			ghc.new ThermostatNight(100)
		};
		ghc.addEvent(ghc.new Restart(2000,eventList));
		
		if (args.length == 1){
			ghc.addEvent(new GreenHouseControls.Terminate(new Integer(args[0])));
		}
		ghc.run();
		
	}

	private boolean light = false;
	
	public class LightOn extends Event {

		public LightOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			light = true;
			
		}
		@Override
		public String toString(){
			return "Light is on";
		}
	}
	
	public class LightOff extends Event {

		public LightOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			light = false;
		}
		@Override
		public String toString(){
			return "Light is off";
		}
	}
	private boolean water = false;
	
	public class WaterOn extends Event{

		public WaterOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			water = true;
		}
		@Override
		public String toString(){
			return "Water is On";
		}
	}
	
	public class WaterOff extends Event{

		public WaterOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			water = false;
		}
		@Override
		public String toString(){
			return "Water is Off";
		}
	}
	
	private String thermostat = "Day";
	public class ThermostatNight extends Event{

		public ThermostatNight(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			thermostat = "Night";
		}
		
		@Override
		public String toString(){
			return "thermostat on night setting";
		}
	}
	
	public class ThermostatDay extends Event{

		public ThermostatDay(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			thermostat = "Day";
		}
		
		@Override
		public String toString(){
			return "thermostat on day setting";
		}
	}
	
	public class Bell extends Event{

		public Bell(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			addEvent(new Bell(delayTime));
		}
		@Override
		public String toString(){
			return "Bing!";
		}
	}
	
	public class Restart extends Event{
		private Event[] eventList;
		

		public Restart(long delayTime, Event[] eventList) {
			super(delayTime);
			this.eventList = eventList;
			for(Event e: eventList){
				addEvent(e);
			}
		}

		@Override
		public void action() {
			for(Event e: eventList){
				e.start();
				addEvent(e);
			}
		}
		
		@Override
		public String toString(){
			return "Restarting system";
		}
	}
	
	public static class Terminate extends Event{

		public Terminate(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			System.exit(0);
		}
		@Override
		public String toString(){
			return "Terminating";
		}
	}
}
