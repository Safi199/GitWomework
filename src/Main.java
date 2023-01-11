import java.util.Scanner;

class Main {

    public static void main(String [] args){


     /*   Scanner user = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan = user.nextBoolean();

        if (!loan) {
            System.out.println("Unknown");
        }
        System.out.println("What is your credit score?");
        int score = user.nextInt();

        if(score<600){
            System.out.println("The eligibility is Not eligible");
        }else if(score>=600 && score<=700){
            System.out.println("The eligibility is Maybe eligible");

        }else if(score>=701 && score<=800){
            System.out.println("The eligibility is Eligible");
        }else{
            System.out.println("The eligibility is Definitely eligible");*/

   //Prompt user with a question: "Is it weekend?"
        //
        //If it is not a weekend --> subject="manual testing"
        //
        //Otherwise --> subject="Java"
        //
        //**Output**:
        //
        //```
        //Today you will be learning ____
        //```
     boolean subject;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Is it weekend?");
        subject= scanner.nextBoolean();
        if(subject){
            System.out.println("manual testing");

        }else
            System.out.println("Java");
    }
}