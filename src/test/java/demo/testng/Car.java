package demo.testng;

public class Car {

	public String turn_on_headlights(String onOrOff) {
		if(onOrOff.equals("on")) {
			return "headlights are on";
		}else  {
			return "headlights are off";
		}
		
		
	}
	
	public String turn_on_radio(String onOrOff) {
		if(onOrOff.equals("on")) {
			return "radio is on";
		}else  {
			return "radio is off";
		}
		
	}
	
}
