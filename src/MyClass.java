import java.util.Random;

public class MyClass {
    String name;
    int age;
    int[] score;

    public MyClass(String name, int age, int[] score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public int studentScore() {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = random.nextInt(1, 10);
            sum += score[i];
        }
        return sum;

    }

    public void studentNam() {
        if (age > 0) {
        System.out.println("Student name: " + name + "\n" + "Age: " + age);
        }else{
            System.out.println("Wrong student");
        }
    }
}
