import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for(;;) {
            int rand = (int) (Math.random() * 1000);
            int guess = 0;
            do {
                System.out.println("Guess number from 1 to 1000:");
                guess = sc.nextInt();
                if (guess == rand) {
                    System.out.println("Correct Guess!!!");
                    break;
                } else if (guess < rand) {
                    System.out.println("Wrong Guess, Try something larger :(");
                } else {
                    System.out.println("Wrong Guess, Try something smaller :(");
                }
            } while (guess > 0);
            System.out.println("Correct Number was:" + rand);
            System.out.println("Play Again(Y/N):");
            char play=' ';
            play=sc.next().charAt(0);
            if(play=='Y' || play=='y'){
                continue;
            }
            else{
                break;
            }
        }
    }
}