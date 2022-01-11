package curs7;

public class Qualification extends Teacher {
	
	public Qualification(String course, int experienceYears, String schedule) {
		super(course, experienceYears, schedule);
	}

	
	public void verify() {
		if (getExperienceYears() >= 3 && getCourse() == "Java" && getSchedule() == "Afternoon") {
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
		}
	}

	
	public static void main(String[] args) {

		Qualification qualification = new Qualification("Java", 3, "Afternoon");
		qualification.verify();
		
		Qualification qualification2 = new Qualification("Java", 1, "Noon");
		qualification2.verify();
	
	}
}
 