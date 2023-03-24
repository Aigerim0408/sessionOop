import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] scores = new int[10];
        MyClass[] student1 = new MyClass[5];
        student1[0] = new MyClass("Aigerim", 29, scores);
        student1[1] = new MyClass("Safiya", 15, scores);
        student1[2] = new MyClass("Nurbek", 0, scores);
        student1[3] = new MyClass("Aidar", 18, scores);
        student1[4] = new MyClass("Kudaiberdi", 29, scores);
        for (MyClass myClass : student1) {
            myClass.studentNam();
            System.out.println("Student score: " + myClass.studentScore());
        }
    }
}
