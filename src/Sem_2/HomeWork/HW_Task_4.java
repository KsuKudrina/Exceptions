package Sem_2.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class HW_Task_4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Пишите! ");
            String str = reader.readLine();
            if (str.equals("")){
                throw new RuntimeException("Строка не должна быть пуста! ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
