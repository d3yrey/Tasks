package practice.course;

public class OnlineCourse extends Course{
    String platform;
    String duration;

    public OnlineCourse(String name, String instructor, int credits, String platform, String duration) {
        super(name, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    @Override
    void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println(" Duration: " + duration);
    }
    boolean isEligibleForCertificate(int attendancePercentage){
        return attendancePercentage >= 75;
    }
}
