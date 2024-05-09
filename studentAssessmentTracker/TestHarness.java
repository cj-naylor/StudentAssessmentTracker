import java.util.List;
public class TestHarness {
public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Dion");
        Student student2 = new Student("Richard");
        Student student3 = new Student("Brandon");
        Student student4 = new Student("Amir");
        Student student5 = new Student("Damian");




        // Set grades
        student1.setGradeOne(80);
        student1.setGradeTwo(85);
        student1.setGradeThree(90);

        student2.setGradeOne(70);
        student2.setGradeTwo(75);
        student2.setGradeThree(80);

        student3.setGradeOne(40);
        student3.setGradeTwo(50);
        student3.setGradeThree(70);

        student4.setGradeOne(60);
        student4.setGradeTwo(69);
        student4.setGradeThree(81);
    
        student5.setGradeOne(87);
        student5.setGradeTwo(92);
        student5.setGradeThree(96);

        // Create a classroom and add students
        Classroom classroom = new Classroom();
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        classroom.addStudent(student4);
        classroom.addStudent(student5);


        
        System.out.println("----------------------------------------------------------------");
        System.out.println("Class average: " + classroom.getClassAverage() + "%");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Class growth percentage: " + classroom.getClassGrowthPercent() + "%");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Student with highest growth: " + classroom.getHighestGrowthStudent().getName() + " with a total growth of " + classroom.getHighestGrowthStudent().getGrowthPercentage() + "%");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Student with lowest growth: " + classroom.getLowestGrowthStudent().getName() + " with a total growth of " + classroom.getLowestGrowthStudent().getGrowthPercentage() + "%");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Students organized by growth percentage:");
        System.out.println();
        List<Student> sortedStudents = classroom.organizeByGrowth();
        for (Student student : sortedStudents) {
            System.out.println(student.getName() + ": " + student.getGrowthPercentage());
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Student with highest average score: " + classroom.getHighestAverageStudent().getName() + " " + classroom.getHighestAverageStudent().getStudentAverage() + "%");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Student with lowest average score: " + classroom.getLowestAverageStudent().getName() + " " + classroom.getLowestAverageStudent().getStudentAverage() + "%");
        System.out.println("----------------------------------------------------------------");
    }
}

