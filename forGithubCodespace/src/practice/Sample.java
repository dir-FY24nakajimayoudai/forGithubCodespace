package practice;

// 標準ライブラリからのインポート
import java.util.Arrays;

// メインファイルの内容
public class Sample {

    // 実行されるメインメソッド
    // 実行する際は画面右上の▶アイコンをクリック
    public static void main(String[] args) {

        int number1 = 0;
        Integer number2 = 0;

        String type1 = number1.getClass().getSimpleName();
        System.out.println("number1");
        System.out.println(type1);

        String type2 = number2.getClass().getSimpleName(); 
        System.out.println("number2");
        System.out.println(type2);
    }

}
