package main;

public class CallCenter {

	public static void main(String[] args) {

		Technician tec = new Technician1();
		Technician tec2 = new Technician2();
		tec.nextTechnician(tec2);
		tec2.nextTechnician(new Technician3());
		
		tec.process(Problems.NETWORK);
	}

}
