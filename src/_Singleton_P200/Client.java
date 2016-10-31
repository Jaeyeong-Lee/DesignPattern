package _Singleton_P200;

public class Client {

	private static final int THREAD_NUM = 5;
	
	public static void main(String args[]){
		
		UserThread[] user = new UserThread[THREAD_NUM];
		
		for(int i = 0; i < THREAD_NUM; i++){
			
			// set Threads name and start them.
			user[i] = new UserThread((i+1) + "-thread");
			user[i].start();
		}
	}
	
}
