package practice.course;

public class Course {
    String name;
    String instructor;
    int credits;

    public Course(String name, String instructor, int credits) {
        this.name = name;
        this.instructor = instructor;
        this.credits = credits;
    }
    void displayCourseInfo(){
        System.out.println("Course Name: " + name);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", "Dr. Smith", 4, "Udemy", "8 weeks");
        onlineCourse.displayCourseInfo();
        System.out.println("Eligible for Certificate: " + onlineCourse.isEligibleForCertificate(80));
    }
}
