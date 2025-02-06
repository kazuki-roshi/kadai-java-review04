
public class Review01 {

    public static void main(String[] args) {
        //double型変数price1,taxRateを宣言し、商品価格と税率を代入
        double price1 = 1500;
        double taxRate =0.1;
        //double型変数price1を型変換し、int型変数price2に代入
        int price2 = (int) price1;
        //int型変数taxを宣言し、taxメソッドを呼び出して代入
        int tax = tax(price1, taxRate);
        //int型変数priceIncludingTaxを宣言し、price2とtaxの加算結果（税込価格）を代入
        int priceIncludingTax = price2 + tax;

        System.out.println(price2 + "円の商品の税込価格は" + priceIncludingTax + "円（消費税は" + tax + "円）です。");
    }
    //戻り値int型のtaxメソッドに引数double型price1とtaxRateを定義する
    public static int tax(double price1, double taxRate) {
        //double型変数taxを宣言し、乗算結果を代入
        double tax =(price1 * taxRate);
        //double型変数taxを型変換し、int型変数resultに代入
        int result = (int)tax;
        //呼び出し元へ戻す
        return result;
    }

}
