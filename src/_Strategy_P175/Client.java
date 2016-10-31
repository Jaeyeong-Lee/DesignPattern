package _Strategy_P175;

// Context
public class Client {

	public static void main(String[] args) {
		
		// Abstract class can reference role.
		Robot taekwonV 	= new TaekwonV("TaekwonV");
		Robot atom 		= new Atom("Atom");
		
		taekwonV.setMovingStrategy(new WalkingStrategy());
		taekwonV.setAttackStrategy(new MissileStrategy());
//		taekwonV.setAttackStrategy(new PunchStrategy());
		
		atom.setMovingStrategy(new FlyingStrategy());
		atom.setAttackStrategy(new PunchStrategy());
		
		System.out.println("My name is "+ taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();
		
		System.out.println();
		
		System.out.println("My name is "+ atom.getName());
		atom.move();
		atom.attack();
	}

}
