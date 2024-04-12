package practice;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[][] multiArray = new int[3][4];

        for(int i = 0; i < multiArray.length; i ++){
            for(int j = 0; j < multiArray[i].length; j ++){
                multiArray[i][j] = i + j + 1;
            }   
        }

        System.out.println("1,3を出力します");
        System.out.println(multiArray[1][3]);

        for(int i = 0; i < multiArray.length; i++){
            System.out.println(Arrays.toString(multiArray[i]));
        }
        

    }

}
