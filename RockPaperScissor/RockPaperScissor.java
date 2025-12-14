import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        int win = 0;
        int lose = 0;
        int draw = 0;

        while (true) {

            System.out.print("Enter rock/paper/scissor or !exit : ");
            String player = sc.nextLine();

            if (player.equals("!exit")) {
                break;
            }

    
            if (player.equals("secret")) {
                System.out.println("คุณใช้คำสั่งลับ! ชนะทันที (+100)");
                win++;
                score += 100;
                continue;
            }

            
            if (player.equals("bonus")) {
                System.out.println("ได้รับโบนัส +20 คะแนน!");
                score += 20;
                continue;
            }

           
            if (!player.equals("rock") &&
                !player.equals("paper") &&
                !player.equals("scissor")) {
                System.out.println("Invalid input.");
                continue;
            }
            
            int r = rand.nextInt(3);   
            String computer;
            if (r == 0) {
                computer = "paper";
            }
            else if (r == 1) {
                computer = "scissor";
            }
            else {
                computer = "rock";
            }

            System.out.println("Computer chose: " + computer);

           
            if (player.equals(computer)) {
                System.out.println("Result: Draw");
                draw++;
            }
            else if (player.equals("rock") && computer.equals("scissor")) {
                System.out.println("Result: You Win (+100)");
                win++;
                score += 100;
            }
            else if (player.equals("paper") && computer.equals("rock")) {
                System.out.println("Result: You Win (+100)");
                win++;
                score += 100;
            }
            else if (player.equals("scissor") && computer.equals("paper")) {
                System.out.println("Result: You Win (+100)");
                win++;
                score += 100;
            }
            else {
                System.out.println("Result: You Lose");
                lose++;
            }

            System.out.println(); 
        }

        
        System.out.println("\n--- Game Summary ---");
        System.out.println("Win  : " + win);
        System.out.println("Lose : " + lose);
        System.out.println("Draw : " + draw);
        System.out.println("Score: " + score);
    }
}
