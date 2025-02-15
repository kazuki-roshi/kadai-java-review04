package baseball;

public class BaseBallTeam {
    // フィールド
    private String name; // チーム名
    private int win;     // 勝ち数
    private int lose;    // 負け数
    private int draw;    // 引き分け数

    // コンストラクタ
    public BaseBallTeam() {
    }

    // 引数ありコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // 勝率メソッド
    public double getRate() {
        // 小数点以下の値を保持する為にwinをキャストし、勝率の計算を行う
        double rate = (double)this.win / (this.win + this.lose);
        return rate;
    }

    // reportメソッド
    public void report() {
        double Rate = getRate();
        System.out.println(this.name+" の2022年の成績は "+this.win+"勝 "+this.lose+"敗 "+this.draw+"分、勝率は "+Rate+"です。");
    }


    public String getName () {
        return name;
    }
    public void detName(String name) {
        this.name = name;
    }
    public int getWin() {
        return win;
    }
    public void setWin(int win) {
        this.win = win;
    }
    public int getLose() {
        return lose;
    }
    public void setLose(int lose) {
        this.lose = lose;
    }
    public int getDraw() {
        return draw;
    }
    public void setDraw(int draw) {
        this.draw = draw;
    }

}
