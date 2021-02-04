public class Score{
  static int score = 0;

  public static int getScore(){
    return score;
  }

  public static void addScore(int points){
    score += points;
  }
}