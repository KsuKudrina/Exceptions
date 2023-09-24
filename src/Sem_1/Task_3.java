package Sem_1;
/*
    Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
    целочисленный одномерный массив.
    Метод должен пройтись по каждому элементу и проверить что он не равен null.
    А теперь реализуйте следующую логику:
    Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
    Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

 */

public class Task_3 {
    static Integer[] arr = {5,null,5,null,7,null};
    public static void checkArray(){
        checkArray(arr);
    }

    private static void checkArray(Integer[] arr){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                result.append(i);
                result.append(" ");
            }
        }
        if (!result.isEmpty()){
            throw new RuntimeException("null is detected on position " + result);
        }
    }
}
