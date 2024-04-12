package practice;

public class Main {

    public static void main(String[] args) {
        int[][] multiArray = new int[3][4];

        for(int i = 0; i < multiArray.length; i ++){
            for(int j = 0; j < multiArray[i].length; j ++){
                multiArray[i][j] = i + j + 1;
            }   
        }
        System.out.println(multiArray[2][3]);

    }

}
