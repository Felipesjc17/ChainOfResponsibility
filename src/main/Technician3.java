package main;

public class Technician3 extends Technician {

	public Technician3() {
		super();
	}

	@Override
	public boolean resolvedProblems(Problems problem) {
		if (problem == Problems.CONFIGURATIONS || problem == Problems.HARDWARE || problem == Problems.NETWORK) {
			System.out.println("T�cnico 3 resolveu o problema");
		} else {
			System.out.println("Nenhum T�cnico pode resolver esse problema");
		}
		return true; 
	}
}
