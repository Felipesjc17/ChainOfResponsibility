package main;

public abstract class Technician {
	
	protected Technician nextTechnician;

	public Technician() {
		super();
	}
	
	public void nextTechnician(Technician technician) {
			this.nextTechnician = technician;
	}
	
	public void process (Problems problem) {
		boolean resolved = resolvedProblems(problem);
		if ( nextTechnician != null && !resolved) {
			nextTechnician.process(problem);
		}
	}
	
	public abstract boolean resolvedProblems(Problems problem);
}
