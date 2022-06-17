package com.tom.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFlie {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");
            int data = fileReader.read();
            System.out.println(data);
            data=fileReader.read();
            System.out.println(data);

        }catch(FileNotFoundException e) {
            System.out.println("檔案失敗");

        }catch(IOException e){
            System.out.println("資料失敗");
        }
    }

}

