package review;

public class Student {
    String name;
    int[] grades;

    public Student(String name, int[] grades){
        this.name = name;
        this.grades = grades;
    }

    public String getName(){
        return this.name;
    }

    public double calculateAverage(int[] grades){
        int sum = 0;
        for(int i = 0; i<grades.length; i++){
            sum += grades[i];
        }
        return (double) sum / grades.length;
    }

}
