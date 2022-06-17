package com.tom.score;

import java.io.*;

public class ScoringFlie {


    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");
            BufferedReader reader=new BufferedReader(fileReader);

            String line=reader.readLine();
           while (line!=null){
               String[]token=line.split(",");
               String  name=token[0];
               int english=Integer.parseInt(token[1]);
               int math=Integer.parseInt(token[2]);
               Student stu=new Student(name,english,math);
               stu.print();
               line=reader.readLine();

           }

        }catch(FileNotFoundException e) {
            System.out.println("檔案 失敗");

        }catch(IOException e){
            System.out.println("資料 失敗");
        }
        System.out.println("Testing");
    }

}

