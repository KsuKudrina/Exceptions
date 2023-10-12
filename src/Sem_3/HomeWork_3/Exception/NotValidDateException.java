package Sem_3.HomeWork_3.Exception;

import java.util.Date;

public class NotValidDateException extends Exception{
    public  NotValidDateException (String message){
        super(message);
    }

    public void dateException(Date i) {
        System.out.println("Дата рождения введена неверно");
        System.out.printf("Неверные данные: %s", i);
        System.out.println();
    }
}
