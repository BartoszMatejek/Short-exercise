package com.company;

import java.util.*;

public class ShortExercise {

    private String first;
    private String second;
    private Scanner scanner = new Scanner(System.in);

    public ShortExercise(){

    }

    public void enterText(){
            System.out.println("Enter first text: ");
            first = scanner.nextLine();
            System.out.println("Enter second text: ");
            second = scanner.nextLine();
    }

    public String solution(){

        char[] arr0 = first.toCharArray();
        char[] arr1 = second.toCharArray();
        int length = 0;
        char[] scoreArr;

        if(arr0.length > arr1.length){
            length = 2*arr1.length;
        }
        else{
            length = 2*arr0.length;
        }

        scoreArr = new char[length];

        for(int i = 0, j = 0; i < length; i++,j++){
            scoreArr[i] = arr0[j];
            i++;
            scoreArr[i] = arr1[j];
        }

        String result = new String(scoreArr);
        return result;
    }

    public void print(){
        System.out.println(solution());
    }
}
