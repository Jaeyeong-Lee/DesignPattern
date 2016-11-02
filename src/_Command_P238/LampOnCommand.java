package _Command_P238;

public class LampOnCommand implements Command{

	private Lamp theLamp;
	
	public LampOnCommand(Lamp theLamp) {
		// TODO Auto-generated constructor stub
		this.theLamp = theLamp;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theLamp.turnOn();
		
	}

}
