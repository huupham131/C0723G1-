package ss8_clean_code_refactoring.bai_tap;

public class TennisGame {
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirdty";
    public static final String FORTY = "Forty";
    public static final String DEUCE = "Deuce";
    public static final String ALL = "All";
    public static final String DASH = "-";
    static String score = "";
    static int tempScore = 0;

    public static void getDrawScore(int playerscore) {
        switch (playerscore) {
            case 0:
                score = LOVE + DASH + ALL;
                break;
            case 1:
                score = FIFTEEN + DASH + ALL;
                break;
            case 2:
                score = THIRTY + DASH + ALL;
                break;
            case 3:
                score = FORTY + DASH + ALL;
                break;
            default:
                score = DEUCE;
                break;
        }
    }

    public static String getCurrentResult(int playerScore1, int playerScore2) {
        int minusResult = playerScore1 - playerScore2;
        if (minusResult == 1) {
            score = "Advantage player1";
        } else if (minusResult == -1) {
            score = "Advantage player2";
        } else if (minusResult >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }

    public static String getDifferenceScore(int playerScore1, int PlayerScore2) {
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = playerScore1;
            else {
                score += "-";
                tempScore = PlayerScore2;
            }
            switch (tempScore) {
                case 0:
                    score += LOVE;
                    break;
                case 1:
                    score += FIFTEEN;
                    break;
                case 2:
                    score += THIRTY;
                    break;
                case 3:
                    score += FORTY;
                    break;
            }
        }
        return score;
    }

    public static String displayResult(int player1Score, int player2Score) {

        if (player1Score == player2Score) {
            getDrawScore(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            getCurrentResult(player1Score, player2Score);
        } else {
            getDifferenceScore(player1Score, player2Score);
        }
        return score;
    }

    public static void main(String[] args) {
    }
}
