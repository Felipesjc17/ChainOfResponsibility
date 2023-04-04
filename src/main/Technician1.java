package main;

public class Technician1 extends Technician {

	public Technician1() {
		super();
	}

	@Override
	public boolean resolvedProblems(Problems problem) {
		if(problem == Problems.CONFIGURATIONS) {
			System.out.println("Técnico 1 resolveu o problema de configuração");
			return true;
		} else {
			return false;
		}
	}
}
