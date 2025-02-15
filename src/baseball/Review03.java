package baseball;

public class Review03 {

    public static void main(String[] args) {
        // チームを生成
        BaseBallTeam Swallows = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        BaseBallTeam Baystars = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        BaseBallTeam Tigers = new BaseBallTeam("阪神タイガース",68,71,4);
        BaseBallTeam Giants = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        BaseBallTeam Carp = new BaseBallTeam("広島東洋カープ",66,74,3);
        BaseBallTeam Dragos = new BaseBallTeam("中日ドラゴンズ",66,75,2);

        // 勝率を取得
        double getRate1 = Swallows.getRate();
        double getRate2 = Baystars.getRate();
        double getRate3 = Tigers.getRate();
        double getRate4 = Giants.getRate();
        double getRate5 = Carp.getRate();
        double getRate6 = Dragos.getRate();

        // reportメソッドを呼び出す
        Swallows.report(getRate1);
        Baystars.report(getRate2);
        Tigers.report(getRate3);
        Giants.report(getRate4);
        Carp.report(getRate5);
        Dragos.report(getRate6);
    }

}
