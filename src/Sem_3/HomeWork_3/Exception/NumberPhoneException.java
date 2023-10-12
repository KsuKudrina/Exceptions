package Sem_3.HomeWork_3.Exception;

public class NumberPhoneException extends Exception{
    public  NumberPhoneException(String message){
        super(message);
    }

    public void numPhoneEx(String i) {
        System.out.println("Номер телефона должен содержать 11 цифр");
        System.out.println(i);
        System.out.println();
    }
}
