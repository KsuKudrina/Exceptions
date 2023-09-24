package Sem_2;

public class Lesson {

    public static void main(String[] args) {
        int num = 1;
        try {
            num = 10/0;
            String test = null;
        }catch (ArithmeticException e) {
            System.out.println("Деление на 0");
        }
        System.out.println(num);
    }
}
