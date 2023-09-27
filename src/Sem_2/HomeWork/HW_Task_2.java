package Sem_2.HomeWork;
/*
    Если необходимо, исправьте данный код
    (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */

public class HW_Task_2 {
    public static void main(String[] args) {
        try {
            int[] intArray = {1,5,9,15,3,7,24,30,14,23};
            int d = 0;
            double catchedRes1;
            if (d == 0){
                System.out.println("Divide by zero not permited");
            }
            catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
