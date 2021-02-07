public class Question {
  // category, amount $$, question, answer
  String category;
  int amount;
  String question;
  String answer;

  public Question (String category, int amount){
    this.category = category;
    this.amount = amount;
  }
  
  public Question (String category, int amount, String question, String answer){
    this.category = category;
    this.amount = amount;
    this.question = question;
    this.answer = answer;
  }

  // check if answer is correct
  public void checkAnswer(String answer){
        if(this.answer.equals(answer)){
          Score.addScore(amount);
          System.out.print("Correct! You have been awarded $");
          System.out.println(Score.getScore());
        }
        else{
          System.out.println("Incorrect.");
        }
        }

    public String toString()
    {
        return "You chose: " + category + " for $" + amount;
    }
  }
