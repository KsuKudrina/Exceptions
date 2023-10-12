package Sem_3.HomeWork_3;

import java.util.Arrays;
import Sem_3.HomeWork_3.Program.Run;

public class Main {
    public static void main(String[] args) {

        try {
            Run.ReadingData();
            System.out.println("Завершено");
        }catch (Exception e){
//            System.out.println(Arrays.toString(e.getStackTrace()));
            System.out.println(e.getMessage());
        }
    }
}
