package _State_P223;

public class ON implements State {
	
	private static ON on = new ON();
	private ON() { }
	
	public static ON getInstance() {
		return on;
	}
	
	@Override
	public void on_button_pushed(Light light) {
		// TODO Auto-generated method stub
		
		System.out.println("No response");
	}

	@Override
	public void off_button_pushed(Light light) {
		// TODO Auto-generated method stub

		light.setState(OFF.getInstance());
		System.out.println("Light OFF");
	}

}
