package practice;

// 標準ライブラリからのインポート
import java.util.Arrays;

// メインファイルの内容
public class Sample {

    // 実行されるメインメソッド
    // 実行する際は画面右上の▶アイコンをクリック
    public static void main(String[] args) {

        //3x4の２次元配列の各要素に代入して適当に出力
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
