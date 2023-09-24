package Sem_1;

import java.util.Scanner;

public class Task_1 {
    /*
    Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
    Если длина массива меньше некоторого заданного минимума,
    метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
    */
    public static int ChekArr(int[] arr, int min){
        if (arr.length < min){
            return  -1;
        }
        return arr.length;
    }

    /*
    Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
    Метод ищет в массиве заданное значение и возвращает его индекс.
    При этом, например:
        1. если длина массива меньше некоторого заданного минимума,
    метод возвращает -1, в качестве кода ошибки.
        2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
        3. если вместо массива пришел null, метод вернет -3
        4. придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
    Напишите метод, в котором реализуйте взаимодействие с пользователем.
    То есть, этот метод запросит искомое число у пользователя, вызовет первый,
    обработает возвращенное значение и покажет читаемый результат пользователю.
    Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
     */

    static int[] arr = {1,6,9,4,3,7};
//    static int[] arr = {};
//    static int[] arr = null;
    static int min = 1;
    static Scanner sc = new Scanner(System.in);
    static int val = sc.nextInt();

    public static int CheckArray(){
        return CheckArray(arr, min, val);
    }
    private static int CheckArray(int[] arr, int min, int val){

        if (arr == null) {
            return -3;
        }

        if (arr.length < min){
            return  -1;
        }

        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] == val){
                return i;
            }
        }
        return -2;
    }
    public static void usMess(){
        int bug = CheckArray();
        if (bug == -3){
            System.out.println("Массива нет! ");
        }else {
            if (bug == -1) {
                System.out.println("Массив пустой. ");
            } else {
                if (bug == -2) {
                    System.out.println("Искомое число не найдено! ");
                }else {
                    System.out.println(CheckArray());
                }
            }
        }

    }
}
