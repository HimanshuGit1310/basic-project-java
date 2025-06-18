public class Main {
    public static void main(String[] args) {

        Student[] students = {new Student("Rahul",98,47,54),
                new Student("Rohit",98,87,96) ,
                new Student("Virat",89,75,69) ,
                new Student("Shubhman",98,75,68),
                new Student("Hardik",98,75,46)
        };

        Student topStudent = students[0];
        for (Student student : students) {
            int total = student.getTotalmarks();
            double average = student.getAverage();
            System.out.println("Name: " + student.name);
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);
            System.out.println();

            if (average > topStudent.getAverage()){
                topStudent = student;
            }
        }

        System.out.println("Student with Highest Average:");
        System.out.println("Name: " + topStudent.name);
        System.out.println("Average: " + topStudent.getAverage());

    }
}