package test;

public class Athlete {
	private String name;
	private Grade [] grades;
	private int count;

	public Athlete(String name, int count) {
		this.name = name;
		this.count = count;
		this.grades = new Grade [count];
	}
	
	public Athlete(Athlete a) {
		name = a.name;
		count = a.count;
		grades = new Grade [a.grades.length];
		for (int i = 0; i < grades.length; i++) {
			if (a.grades[i] != null)
				this.grades[i] = new Grade(a.grades[i].getApparatus(), a.grades[i].getScore());
		}
		
	}
	public boolean addGrade(String apparatus , double grade) {
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] == null) {
				grades[i] = new Grade (apparatus , grade);
				count ++;
				return true;
			}
		}
		return false;
	}
	public boolean deleteGrade(String apparatus) {
		for (int i = 0; i < grades.length; i++) {
			if (grades[i].getApparatus() == apparatus) {
				grades[i] = null;
				count --;
				return true;
			}
		}
		return false;
		}
	
	
	public double average() {
		double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] != null)
				sum ++;
		}
		if (sum == 0) 
			return -1;
		
		return (sum/count);
	}
	
	public boolean allGradesAbove (double grade) {
		for (int i = 0; i < grades.length; i++) {
			if(grades[i] != null)
				if(grade > grades[i].getScore())
					return false;
		}
		return true;
	}
//	
//	public boolean isBetter (Athlete a) {
//		for (int i = 0; i < grades.length; i++) {
//			if(grades[i] != null) {
//				if(this.)
//			}
//		}
//	}
//	

}
