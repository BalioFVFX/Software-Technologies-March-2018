package AverageGrades;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class AverageGrades {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] studentData = scanner.nextLine().split(" ");
            double[] grades = convertGrades(studentData);
            Student student = new Student(studentData[0], grades);
            if(student.getAverageGrade() >= 5.00){
                students.add(student);
            }
        }

        students.sort(Comparator.comparing(Student::getName)
                .thenComparing(Collections.reverseOrder(Comparator.comparing(Student::getAverageGrade))));

        for (Student student : students) {
            System.out.printf(student.getName() + " -> %.2f%n", student.getAverageGrade());
        }
        }
        public static double[] convertGrades(String[] data){

            String gradesStr = "";

            for (int i = 1; i < data.length; i++) {
                gradesStr += data[i] + " ";
            }

            double[] grades = Arrays.stream(gradesStr.split(" ")).mapToDouble(Double::parseDouble).toArray();

            return grades;
        }
    }

class Student{

    private String name;
    private double grades[];
    private double averageGrade;

    public String getName(){
        return this.name;
    }
    public double getAverageGrade(){
        return this.averageGrade;
    }

    Student(String name, double[] grades){
        this.name = name;
        this.grades = grades;
        this.averageGrade = this.averageGrade = Arrays.stream(grades).average().getAsDouble();;
    }
}