import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    List<Course> courses = new ArrayList<>();
    courses.addAll(List.of(
      new Course("Operating Systems - Theory", 3, 4),
      new Course("Computer Networks - Theory", 3, 5),
      new Course("Theory Of Computation - Theory", 3, 5)
    ));
    
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter your semester: ");
      int semester = Integer.parseInt(sc.nextLine());

      // loop over all courses that are in given semester
      List<Course> filteredCourses = courses
        .stream()
        .filter(c -> c.getSemester() == semester)
        .toList();

      int total = 0;
      for (Course course : filteredCourses) {
        System.out.printf("%s: ", course.getName());
        total += Utils.gradeToCgpa(sc.nextLine());
      }
      
    }
  }
}