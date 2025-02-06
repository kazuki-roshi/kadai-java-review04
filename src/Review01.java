
public class Review01 {

    public static void main(String[] args) {
        double price = 1500;
        double taxRate =0.1;
        double result;
        double priceIncludingTax;
        result = tax(price, taxRate);
        priceIncludingTax = price + tax(price, taxRate);
        System.out.println((int)price + "円の商品の税込価格は" + (int)priceIncludingTax + "円（消費税は" + (int)result + "円）です。");

    }
    public static double tax(double price, double taxRate) {
        double tax =(price * taxRate);
        return tax;
    }

}
