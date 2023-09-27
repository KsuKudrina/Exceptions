package Sem_2.HomeWork;

import java.io.IOException;

/*
    Дан следующий код, исправьте его там, где требуется
    (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */
public class HW_Task_3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;

            System.out.println(printDiv(a, b));
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[1] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }
    public static int printDiv(Integer a, Integer b){
        if (b == 0) {
            System.out.println("Деление на 0! ");
            return a;
        }
        return a/b;

    }

}
