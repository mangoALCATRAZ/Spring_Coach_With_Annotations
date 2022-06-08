package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;


@Component
public class FileFortuneService implements FortuneService{

    //create arraylist
    private ArrayList<String> li = new ArrayList<String>();
    private Random myRandom = new Random();


    //populate arraylist
    //public void FileFortuneService(){
     // this.setList();
    //}


    @Override
    public String getFortune() {
        this.setList();

        // get random num based on array size
        int index = myRandom.nextInt(li.size());

        // select random arraylist entry from random num


        return li.get(index);
    }

    public void setList() {
        try {
            String file = "file.txt";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String curLine;
            while((curLine = bufferedReader.readLine()) != null){
                this.li.add(curLine);
            }
            bufferedReader.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
