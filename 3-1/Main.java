/**
 * バブルソート
 * チェックテスト-Java３章
 *
 */

public class Main{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */

        int [] data = new int [5];
        data[0] = 3;
        data[1] = 1;
        data[2] = 2;
        data[3] = 7;
        data[4] = 5;

        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
        for(int i = 0; i < 5 /*ここに記述*/; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 4 /*ここに記述*/; i++) {
            for (int j = 4 /*ここに記述*/; j > i; j--) {
                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */

                if(data[j-1 /*ここに記述*/] > data[j /*ここに記述*/]){ 
                    int box = data[ j /*ここに記述*/];
                    data[j /*ここに記述*/] = data[j-1 /*ここに記述*/];
                    data[j-1 /*ここに記述*/] = box;
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}