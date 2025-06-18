public class Student {

    String name;
    int[] marks = new int[3];


    Student(String name, int m1,int m2,int m3){
        this.name = name;
        this.marks[0] = m1;
        this.marks[1] = m2;
        this.marks[2] = m3;
    }
    int getTotalmarks() {
        return marks[0] + marks[1] + marks[2];
    }

    double getAverage() {
        return getTotalmarks() / marks.length;
    }

    }



