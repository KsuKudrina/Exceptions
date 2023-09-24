package Sem_1;

import java.io.File;

public class Application {
    public static void main(String[] args) {
//        System.out.println(getFileSize(new File("\\Users\\kseni\\IdeaProjects\\Algoritms")));
        System.out.println(divide(10,0));
    }

    public static int divide(int a1, int a2){

        if(a2 == 0){
            throw new RuntimeException("Divide by zero not permited");
        }
        return a1/a2;
    }
    public static long getFileSize(File file){
        if (!file.exists()){
            return  -1L;
        }
        return  file.length();
    }

}
