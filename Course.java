public class Course {
  private int credits;
  private String name;
  private int semester;
  
	public Course(String name, int credits, int semester) {
		this.name = name;
		this.credits = credits;
		this.semester = semester;
	}

  public String getName() { return name; }
  public int getCredits() { return credits; }
  public int getSemester() { return semester; }
}