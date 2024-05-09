import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Student> students;

    public Classroom() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double getClassAverage() {
        double total = 0;
        for (Student student : students) {
            total += student.getStudentAverage();
        }
        return total / students.size();
    }

    public double getClassGrowthPercent() {
        double totalGrowth = 0;
        for (Student student : students) {
            totalGrowth += student.getGrowthPercentage();
        }
        totalGrowth = totalGrowth / students.size();
        totalGrowth = Math.round(totalGrowth * 100.0) / 100.0;
        return totalGrowth;
    }

    public Student getHighestGrowthStudent() {
        if (students.isEmpty()) {
            return null;
        }
    
        Student highestGrowthStudent = students.get(0);
        double highestGrowth = highestGrowthStudent.getGrowthPercentage();
    
        for (Student student : students) {
            double growth = student.getGrowthPercentage();
            if (growth > highestGrowth) {
                highestGrowth = growth;
                highestGrowthStudent = student;
            }
        }
    
        return highestGrowthStudent;
    }
    

    public Student getLowestGrowthStudent() {
        if (students.isEmpty()) {
            return null;
        }
    
        Student lowestGrowthStudent = students.get(0);
        double lowestGrowth = lowestGrowthStudent.getGrowthPercentage();
    
        for (Student student : students) {
            double growth = student.getGrowthPercentage();
            if (growth < lowestGrowth) {
                lowestGrowth = growth;
                lowestGrowthStudent = student;
            }
        }
    
        return lowestGrowthStudent;
    }
    
    public List<Student> organizeByGrowth() {
        List<Student> sortedStudents = new ArrayList<>(students);
    
        for (int i = 0; i < sortedStudents.size() - 1; i++) {
            for (int j = 0; j < sortedStudents.size() - i - 1; j++) {
                Student currentStudent = sortedStudents.get(j);
                Student nextStudent = sortedStudents.get(j + 1);
                if (currentStudent.getGrowthPercentage() > nextStudent.getGrowthPercentage()) {
                    sortedStudents.set(j, nextStudent);
                    sortedStudents.set(j + 1, currentStudent);
                }
            }
        }
    
        return sortedStudents;
    }

    public Student getHighestAverageStudent() {
        if (students.isEmpty()) {
            return null;
        }
    
        Student highestAverageStudent = students.get(0);
        double highestAverage = highestAverageStudent.getStudentAverage();
    
        for (Student student : students) {
            double average = student.getStudentAverage();
            if (average > highestAverage) {
                highestAverage = average;
                highestAverageStudent = student;
            }
        }
    
        return highestAverageStudent;
    }
    
    public Student getLowestAverageStudent() {
        if (students.isEmpty()) {
            return null;
        }
    
        Student lowestAverageStudent = students.get(0);
        double lowestAverage = lowestAverageStudent.getStudentAverage();
    
        for (Student student : students) {
            double average = student.getStudentAverage();
            if (average < lowestAverage) {
                lowestAverage = average;
                lowestAverageStudent = student;
            }
        }
    
        return lowestAverageStudent;
    }

    
    
    
}


