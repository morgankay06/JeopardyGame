
/**
 * Driver class with Questions array
 *
 * Morgan Kay & Caroline Phillips
 * 5/5/23
 */
import java.util.Scanner;
public class Jeopardy{
    public static void main(String[]args){
        //empty Person object
        Person user1;
        Person user2;
        Person user3;
        Person user4;
        //welcome message
        System.out.println("Hello and welcome to Jeopardy!\nFor this version, do not answer in the form of a question and call the clue you want by listing the row(1-5) and then the column(1-5).\nPlease enter your names.");
        //creates object for player
        Scanner input = new Scanner(System.in);
        System.out.println("Player One Name: ");
        String name = input.nextLine();
        Person Player1 = new Person(name);
        System.out.println("Player Two Name: ");
        name = input.nextLine();
        Person Player2 = new Person(name);
        //creates computer generated 
       /* System.out.println("How many computer generated individuals would you like to play against?(1-4)");
        int create=input.nextInt();
        for(int i=1;i<=create;i++){
            if(i==1){
                user1=new Person();
            }
            if(i==2){
                user2=new Person();
            }
            if(i==3){
                user3=new Person();
            }
            if(i==4){
                user4=new Person();
            }
        } */
        //First # corresponds to row, second # corresponds to column in a grid
    //Category: Synonyms
      Questions q00 = new Questions("British kids who annoyingly complain are told not to whinge; U.S. kids are told not to do this, 1 letter shorter", "whine", 200);
      Questions q10 = new Questions("It's an antonym of even & a synonym of peculiar", "odd", 400);
      Questions q20 = new Questions("Take a synonym for 'trash', drop 3 letters & you have this synonym for 'clothes'", "garb", 600);
      Questions q30 = new Questions("This book of the Bible is a synonym of departure", "Exodus", 800);
      Questions q40 = new Questions("Among synonyms of whirlpool, it's the most common first name", "Eddy", 1000);
      //Category: E before I
      Questions q01 = new Questions("The person who lives next door", "neighbor", 200);
      Questions q11 = new Questions("Legally, adult status is achieved at this age", "eighteen", 400);
      Questions q21 = new Questions("Blood vessels called arteries are connected by means of capillaries to this other type of blood vessel", "vein", 600);
      Questions q31 = new Questions("Not native", "foreign", 800);
      Questions q41 = new Questions("5-letter adjective meaning unusual or eccentric", "weird", 1000);
      //Category: US States
      Questions q02 = new Questions("This state's geographic center lies about 12 miles northwest of Little Rock", "Arkansas", 200);
      Questions q12 = new Questions("America's largest national park, Wrangell-St. Elias, covers more than 8 million acres in this large state", "Alaska", 400);
      Questions q22 = new Questions("Clearwater & Palm Beach are popular seaside resorts in this state", "Florida", 600);
      Questions q32 = new Questions("It earned its nickname 'The Equality State' by being the first to give full voting rights to women back in 1869", "Wyoming", 800);
      Questions q42 = new Questions("Nicknamed the 'Mother of Presidents', it's the birthplace of 7 presidents, including Taft & McKinley", "Ohio", 1000);
      //Category: 3 Ses
      Questions q03 = new Questions("To jump a fence and illegally enter a person’s property", "trespass", 200);
      Questions q13 = new Questions("To aid, or a play that helps your hockey teammate score a goal", "assist", 400);
      Questions q23 = new Questions("To let a classroom of kids go home", "dismiss", 600);
      Questions q33 = new Questions("A woman who entertains guests at her home, perhaps with Twinkies made by this brand", "Hostess", 800);
      Questions q43 = new Questions("When doling out justice, a court of law is 'in' this", "session", 1000);
      //Category: The Planets
      Questions q04 = new Questions("It’s the largest and most massive of the planets in the solar system", "Jupiter", 200);
      Questions q14 = new Questions("In 2006 the Cassini spacecraft found yet another ring around this planet", "Saturn", 400);
      Questions q24 = new Questions("The Greeks called this planet Ares", "Mars", 600);
      Questions q34 = new Questions("It’s the brightest planet in the solar system", "Venus", 800);
      Questions q44 = new Questions("This planet, the third largest in our solar system, was discovered by William Herschel in 1781", "Uranus", 1000);
      
      Questions[][] arr = {{q00,q10,q20,q30,q40},{q01,q11,q21,q31,q41},{q02,q12,q22,q32,q42},{q03,q13,q23,q33,q43},{q04,q14,q24,q34,q44}};
      
      for(int c = 0; c < arr[0].length; c++){
          for(int r = 0; r < arr.length; r++){
              System.out.print("$" + arr[r][c].getWorth() + " ");
            }
            System.out.println();
        }
      System.out.println("Column 1 is Synonyms. Column 2 is E before I. Column 3 is US states. Column 4 is 3 Ses. Column 5 is Planets.");
      
     
      int row = 0;
      int col = 0;
      String answer = "";
      int i = 0;
      //created new scanner object which for some reason fixed issue
      Scanner user=new Scanner(System.in);
      while(i<25 && row!=50){
          //player1 goes on even turns
          if(i%2==0){
              System.out.println("Player One: What row would you like to choose?(1-5) Input \"50\" to end");
              row=input.nextInt();
              //an input of 50 exits the loop
              if(row==50){
                  break;
              }
              System.out.println("What column would you like to choose?(1-5)Input \"50\" to end");
              col=input.nextInt();
              if(col==50){
                  break;
              }
              //checks if clue has already been chosen, asks for another choice if true
              if(arr[col-1][row-1]==null){
                  System.out.println("Clue has already been chosen. Please pick again");
                  System.out.println("Player One: What row would you like to choose?(1-5) Input \"50\" to end");
              row=input.nextInt();
              if(row==50){
                  break;
              }
              System.out.println("What column would you like to choose?(1-5)Input \"50\" to end");
              col=input.nextInt();
              }
              System.out.print(arr[col-1][row-1].getQuestion());
              System.out.println("");
              //System.out.println("Enter your answer:");
              answer = user.nextLine();
              //if answer is correct
              if(answer.equalsIgnoreCase(arr[col-1][row-1].getAnswer())){
                  Player1.setTotal(Player1.getTotal() + arr[col-1][row-1].getWorth());
                  System.out.println("Correct! " + Player1);
                  System.out.println();
                }
               //if answer is wrong 
              else if(!answer.equalsIgnoreCase(arr[col-1][row-1].getAnswer())){
                  Player1.setTotal(Player1.getTotal() - arr[col-1][row-1].getWorth());
                  System.out.println("Wrong! " + Player1);
                  System.out.println("The answer was "+ arr[col-1][row-1].getAnswer());
                  System.out.println();
                }
            }
            //player2 goes on odd turns
          if(i%2!=0){
              System.out.println("Player Two: What row would you like to choose?(1-5) Input \"50\" to end");
              row=input.nextInt();
              if(row==50){
                  break;
              }
              System.out.println("What column would you like to choose?(1-5)Input \"50\" to end");
              col=input.nextInt();
              if(col==50){
                  break;
              }
              //checks if clue has already been chosen, asks for another choice if true
              if(arr[col-1][row-1]==null){
                  System.out.println("Clue has already been chosen. Please pick again");
                  System.out.println("Player One: What row would you like to choose?(1-5) Input \"50\" to end");
              row=input.nextInt();
              if(row==50){
                  break;
              }
              System.out.println("What column would you like to choose?(1-5)Input \"50\" to end");
              col=input.nextInt();
              }
              //prints out question    
             System.out.print(arr[col-1][row-1].getQuestion());
             System.out.println("");
             //takes user input for answer
             answer = user.nextLine();
             //if the correct answer is input
              if(answer.equalsIgnoreCase(arr[col-1][row-1].getAnswer())){
                  Player2.setTotal(Player2.getTotal() + arr[col-1][row-1].getWorth());
                  System.out.println("Correct! " + Player2);
                  System.out.println();
                }
               //if the wrong answer is input 
              else if(!answer.equalsIgnoreCase(arr[col-1][row-1].getAnswer())){
                  Player1.setTotal(Player2.getTotal() - arr[col-1][row-1].getWorth());
                  System.out.println("Wrong! " + Player2);
                  System.out.println("The answer was "+ arr[col-1][row-1].getAnswer());
                  System.out.println();
                }
            }
        //sets clue to null after being used so that it isn't reused
          arr[col-1][row-1]=null;
          i++;
      }
    //end statement
      System.out.println("Congratulations on completing Jeopardy!");
    //if player1 has more money they are declared the winner
      if(Player1.getTotal()>Player2.getTotal()){
        System.out.println(Player1.getName()+" is the winner!");
    }
    //if player 2 has more money they are declared the winner
    else if(Player2.getTotal()>Player1.getTotal()){
        System.out.println(Player2.getName()+" is the winner!");
    }
    //otherwise, they have the same amount and it is a tie
    else{
        System.out.println("You tied!");
    }
      
    }
        
}
