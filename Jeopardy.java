import java.util.Scanner;

public class Jeopardy { 

static Question[] questionBank = {
  new Question("Dogs", 200, "These dogs were bred to pull sleds over long distances and are known for yelling.", "Husky"),
  new Question("Dogs", 400, "This is the most popular dog breed in the United States", "Labrador Retriever"),
  new Question("Dogs", 600, "This was the dog breed that starred in the movie Beethoven.", "Saint Bernard"),
  new Question("Movies", 200, "Which 2010 Disney film is a retelling of the Rapunzel story?", "Tangled"),
  new Question("Movies", 400, "Which festive movie from 1990 revolves around a character called Kevin McAllister?", "Home Alone"),
  new Question("Movies", 600, "Which highly successful 2008 musical comedy was largely filmed on the Greek island of Skopelos?", "Mamma Mia"),
  new Question("Candy", 200, "What red and white striped candy is a popular Christmas favorite?", "Candy Cane"),
  new Question("Candy", 400, "Which candy sucker can you wear on your finger?", "Ring Pop"), 
  new Question("Candy", 600, "What candy comes in refillable dispensers with characters on top?", "Pez")
};

  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  //sets initial score to zero
  int score = 0;

 //gives illusion of game loading up to 100%, starting at 10 with increments of 30
    System.out.println("Loading...");
    for(int i = 10; i < 130; i += 30) {
      System.out.println(i);
    }

  //Prints out welcome text
  System.out.println("Welcome to Jeopardy! Let's get started.");
  
  //Will allow user to play again from the start
  boolean playAgain = true;
  while (playAgain){
    
    //Asks user to choose category
    System.out.println("Choose a category. Dogs, Movies, or Candy.");
    String category = input.nextLine();
    System.out.println("Choose an amount. $200, $400, or $600.");
    int amount = input.nextInt();
    input.nextLine();

    for(int i=0; i < questionBank.length; i++){
      String qCategory = questionBank[i].category;
      int qAmount = questionBank[i].amount;
      
      if(category.equals(qCategory) && amount == qAmount){
        System.out.println(questionBank[i].question); // print questionBank
        //input = new Scanner(System.in);
        String answer = input.nextLine(); //collect answer from user
        questionBank[i].checkAnswer(answer);
      }

    }
Score.checkScore();

System.out.println("Do you wish to play again? Y/N");
    String finalAnswer = input.nextLine();
    playAgain = finalAnswer.equalsIgnoreCase("y");
  
  }
  }
}