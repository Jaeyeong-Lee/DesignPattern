package _Command_P238;

public class LampOffCommand implements Command{

	private Lamp theLamp;
	
	public LampOffCommand(Lamp theLamp) {
		// TODO Auto-generated constructor stub
		this.theLamp = theLamp;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theLamp.turnOff();
		
	}

}
