package Sem_2.HomeWork;

import java.io.*;
/*
    Задание 4 из презентации
 */
public class HW_Task_1 {

    public static void test () throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }

    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[1];
            test();
//            int a = 1 / 0;
            inputStream = new FileInputStream("sdafgdsaf");
        }catch (StackOverflowError error){
            System.out.println("asdfasdfdsa");
        }catch (Throwable e){
            e.printStackTrace();
        }finally {
            System.out.println("Я все равно выполнился! ");
        }
        System.out.println("Я жив!");
    }
}
