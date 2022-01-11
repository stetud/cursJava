package curs7;

public class Teacher {
	
	private String course;
	private int experienceYears;
	private String schedule;

	public Teacher(String course, int experienceYears, String schedule) {
		this.course = course;
		this.experienceYears = experienceYears;
		this.schedule = schedule;
	}

	public int getExperienceYears() {
		return experienceYears;
	}
	
	public String getCourse() {
		return course;
	}
	
	public String getSchedule() {
		return schedule;
	}
}
