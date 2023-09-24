package Sem_2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


/*
    Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
    (либо HashMap, если студенты с ним знакомы).
    В отдельном методе нужно будет пройти по структуре данных,
    если сохранено значение ?, заменить его на соответствующее число.
    Если на каком-то месте встречается символ, отличный от числа или ?,
    бросить подходящее исключение.
    Записать в тот же файл данные с замененными символами ?.
 */
public class Task_1 {
    public static void main(String[] args) {
        File file = new File("1.txt");
        HashMap<String, String> map = new HashMap<>();
        WriteFile(file);
        System.out.println(file);
        map = ReadSave(file);
        Change(map);

        Write(map,file);
        System.out.println(map);
    }

    public static void WriteFile(File file){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("Анна=4\n");
            fileWriter.write("Елена=5\n");
            fileWriter.write("Марина=6\n");
            fileWriter.write("Владимир=?\n");
            fileWriter.write("Константин=?\n");
            fileWriter.write("Иван=4\n");
        } catch (IOException e) {
            System.out.println("Write process problem");
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static HashMap<String, String> ReadSave(File file){
        HashMap<String, String> map = new HashMap<>();
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(file));
            String str;
            while ((str = input.readLine()) != null){
//                str = input.readLine();
                map.put(str.split("=")[0].trim(),str.split("=")[1].trim());
            }


        } catch (FileNotFoundException e) {
            System.out.println("Reade process problem");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static void Change (HashMap<String, String> map){
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals( "?")) {
                entry.setValue(String.valueOf(entry.getKey().length()));
            }
        }
    }

    public static void Write (HashMap<String, String> map, File file) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                fileWriter.write(entry.getKey() + "=" + entry.getValue() );
                fileWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
