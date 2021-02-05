public class Score{
  static int score = 0;

  public static int getScore(){
    return score;
  }

  public static void addScore(int points){
    score += points;
  }


  //Prints out final score and text depending on how high the score is 
public static void checkScore(){
if(score <= 200){
  System.out.println("Play again to win more!");
}
else if(score >= 600 && score <= 3400){
  System.out.print("Congratulations! You have been awarded $");
  System.out.println(score);
}
else{
  System.out.println("Congratulations! You won Jeopardy!");
} 
}
}