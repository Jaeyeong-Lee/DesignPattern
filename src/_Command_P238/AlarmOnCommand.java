package _Command_P238;

public class AlarmOnCommand implements Command {
	
	private Alarm theAlarm;
	
	public AlarmOnCommand(Alarm theAlarm) {
		// TODO Auto-generated constructor stub
		
		this.theAlarm = theAlarm;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		theAlarm.start();
	}

}
