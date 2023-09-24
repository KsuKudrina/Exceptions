package Sem_1;
/*
    Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
    Необходимо посчитать и вернуть сумму элементов этого массива.
    При этом накладываем на метод 2 ограничения:
        метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
        и в каждой ячейке может лежать только значение 0 или 1.
    Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

 */

public class Task_2 {

    static int[][] arr2 = new int[][]{
            {0,1,1},
            {1,0,1},
            {0,0,8}
    };
//    System.out.println(sum2DArr(arr2));


    public static int sum2DArr(){
       return  sum2DArr(arr2);
    }
    private static int sum2DArr(int[][] numArr){
        int sum = 0;
        if (numArr.length == 0){
            return -1;

        }else {
            if (numArr[0].length != numArr.length) {
                return -2;
            }else {
                for (int[] line: numArr) {
                    for (int i = 0; i < numArr.length; i++) {
                        if (line[i] != 0 && line[i] != 1){
                            return -3;
                        }
                        sum += line[i];
                    }
                }
                return sum;
            }
        }
    }
    public static void RunEx(){
        int bug = sum2DArr();
        if (bug == -1){
            throw new RuntimeException("Двумернный массив пустой! ");
        }else {
            if (bug == -2){
                throw new RuntimeException("Двумерный массив не квадратный! ");
            }else {
                if (bug == -3){
                    throw new RuntimeException("В массиве недопустимые числа! ");
                }else System.out.println(sum2DArr());
            }
        }

    }
}
