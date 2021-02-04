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
  
  //Prints out welcome text
  System.out.println("Welcome to Jeopardy! Let's get started.");
  
  //Will allow user to play again from the start
  boolean playAgain = true;
  while (playAgain){

  //gives illusion of game loading up to 100%, starting at 10 with increments of 30
    System.out.println("Loading...");
    for(int i = 10; i < 130; i += 30) {
      System.out.println(i);
    }
    
    //Asks user to choose category
    System.out.println("Choose a category. Dogs, Movies, or Candy for $200, $400, or $600.");
    String category = input.nextLine();
    int amount = input.nextInt();

    for(int i=0; i < questionBank.length; i++){
      String qCategory = questionBank[i].category;
      int qAmount = questionBank[i].amount;
      
      if(category.equals(qCategory) && amount == qAmount){
        System.out.println(); // print questionBank
        String answer = input.nextLine(); //collect answer from user

        // check if answer is correct
        if(input.equals(answer)){
          System.out.println("Correct! You have been awarded ");
          System.out.print(Score.getScore());
        }
      }
    }




//    //If user chooses Dogs for $200
//     if(category.equals("Dogs for $200")){
//       System.out.println("These dogs were bred to pull sleds over long distances and are known for yelling."); 
//    //Allows user to input their answer 
//        String dog200Answer = input.nextLine(); 
//     //Prints is user answers correctly 
//        if(dog200Answer.equals("Husky") || dog200Answer.equals  ("Huskies")){
//       System.out.println("Correct! You have been awarded $200!");
//   //adds $ to score
//   //changed
//       Score.addScore(200);
//       System.out.println(Score.getScore());
//     }   
//     else{
//   //Prints if user answers incorrectly
//       System.out.println("Incorrect.");
//     }
//   //Code for each category functions identically and is tailored accordingly
//     }

//    //If user chooses Dogs for $400
//     if(category.equals("Dogs for $400")){
//       System.out.println("This is the most popular dog breed in the United States");
      
//        String dog400Answer = input.nextLine();

//        if(dog400Answer.equals("Labrador Retriever") || dog400Answer.equals ("Labrador") || dog400Answer.equals("Lab")){
//       System.out.println("Correct! You have been awarded $400!");
//       score += 400;
//     }
//     else{
//       System.out.println("Incorrect.");
//     }
//     }

//   //If user chooses Dogs for $600
//   if(category.equals("Dogs for $600")){
//     System.out.println("This was the dog breed that starred in the movie Beethoven.");
  
//      String dog600Answer = input.nextLine();

//     if(dog600Answer.equals("St. Bernard") || dog600Answer.equals ("Saint Bernard")){
//     System.out.println("Correct! You have been awarded $600!");
//     score += 600;
//   }
//   else{
//     System.out.println("Incorrect.");
//   }
//   }


//  //If user chooses Movies for $200
//   if(category.equals("Movies for $200")){
//     System.out.println("Which 2010 Disney film is a retelling of the Rapunzel story?");

//     String movie200Answer = input.nextLine();
    
//     if(movie200Answer.equals("Tangled")){
//     System.out.println("Correct! You have been awarded $200!");
//     score += 200;
//   }
//   else{
//     System.out.println("Incorrect.");
//   }
//   }

// //If user chooses Movies for $400
//   if(category.equals("Movies for $400")){
//     System.out.println("Which festive movie from 1990 revolves around a character called Kevin McAllister?");

//     String movie400Answer = input.nextLine();

//     if(movie400Answer.equals("Home Alone")){
//     System.out.println("Correct! You have been awarded $400!");
//     score += 400;
//   }
//   else{
//     System.out.println("Incorrect.");
//   }
//   }

// //If user chooses Movies for $600
//   if(category.equals("Movies for $600")){
//     System.out.println("Which highly successful 2008 musical comedy was largely filmed on the Greek island of Skopelos?");

//     String movie600Answer = input.nextLine();

//     if(movie600Answer.equals("Mamma Mia!") || movie600Answer.equals("Mamma Mia")){
//     System.out.println("Correct! You have been awarded $600!");
//     score += 600;
//   }
//   else{
//     System.out.println("Incorrect.");
//   }
//   }


// //If user chooses Candy for $200
//   if(category.equals("Candy for $200")){
//     System.out.println("What red and white striped candy is a popular Christmas favorite?");

//     String candy200Answer = input.nextLine();
    
//     if(candy200Answer.equals("Candy Cane") || candy200Answer.equals("Candy cane")){
//     System.out.println("Correct! You have been awarded $200!");
//     score += 200;
//   }
//   else{
//     System.out.println("Incorrect.");
//   }
//   }

// //If user chooses Candy for $400 
//   if(category.equals("Candy for $400")){
//     System.out.println("Which candy sucker can you wear on your finger?");

//     String candy400Answer = input.nextLine();
    
//     if(candy400Answer.equals("Ring Pop") || candy400Answer.equals("Ring pop")){
//     System.out.println("Correct! You have been awarded $400!");
//     score += 400;
//   }
//   else{
//     System.out.println("Incorrect.");
//   }
//   }

// //If user chooses Candy for $600
//   if(category.equals("Candy for $600")){
//     System.out.println("What candy comes in refillable dispensers with characters on top?");

//     String candy600Answer = input.nextLine();
  
//     if(candy600Answer.equals("Pez")){
//     System.out.println("Correct! You have been awarded $600!");
//     score += 600;
//   }
//   else{
//     System.out.println("Incorrect.");
//    }
//   }

//Prints out final score and text depending on how high the score is 
System.out.println(score);
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

//Asks user if they want to play again to iterate back to while loop
//https://stackoverflow.com/questions/20228918/how-to-add-the-play-again-feature-for-java 
System.out.println("Do you wish to play again? Y/N");
    String finalAnswer = input.nextLine();
    playAgain = finalAnswer.equalsIgnoreCase("y");
  
  }
  }
}