package main;

public class Technician2 extends Technician {

	public Technician2() {
		super();
	}

	@Override
	public boolean resolvedProblems(Problems problem) {
		if(problem == Problems.HARDWARE) {
			System.out.println("T�cnico 2 resolveu o problema de Hardware");
			return true; 
		} else {
			return false;
		}
	}
}
