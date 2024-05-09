public class Student {
    private String name;
    private double gradeOne;
    private double gradeTwo;
    private double gradeThree;

    public Student(String name) {
        this.name = name;
    }

    public void setGradeOne(double gradeOne) {
        this.gradeOne = gradeOne;
    }

    public void setGradeTwo(double gradeTwo) {
        this.gradeTwo = gradeTwo;
    }

    public void setGradeThree(double gradeThree) {
        this.gradeThree = gradeThree;
    }

    public String getName() {
        return name;
    }

    public double getGradeOne() {
        return gradeOne;
    }

    public double getGradeTwo() {
        return gradeTwo;
    }

    public double getGradeThree() {
        return gradeThree;
    }

    public double getGrowthPercentage() {
        double growth = (gradeThree - gradeOne) / gradeOne * 100;
        growth = Math.round(growth * 100.0) / 100.0;
        return growth;
    }

    public double getStudentAverage() {
        double av = (gradeOne + gradeTwo + gradeThree) / 3;
        av = Math.round(av * 100.0) / 100.0;
        return av;
    }
}
