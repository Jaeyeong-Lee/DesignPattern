package _State_P223;

public class OFF implements State {
	
	private static OFF off = new OFF();
	private OFF(){ }
	
	public static OFF getInstance() {
		return off;
	}
	
	@Override
	public void on_button_pushed(Light light) {
		// TODO Auto-generated method stub
		
		light.setState(ON.getInstance());
		System.out.println("Light On!");
	}

	@Override
	public void off_button_pushed(Light light) {
		// TODO Auto-generated method stub
		
		System.out.println("No response.");
	}

}
