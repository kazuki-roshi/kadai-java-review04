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


        // reportメソッドを呼び出す
        Swallows.report();
        Baystars.report();
        Tigers.report();
        Giants.report();
        Carp.report();
        Dragos.report();
    }

}
