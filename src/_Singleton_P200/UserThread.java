package _Singleton_P200;

public class UserThread extends Thread{
	
	// set name.
	public UserThread(String name){
		super(name);
	}
	
	public void run(){
		
		// getPrinter is static method.
		Printer printer = Printer.getPrinter();
		
		// printer.toString() is reference value
		printer.print(Thread.currentThread().getName() + " print using " + printer.toString() + ".");
	}

}
