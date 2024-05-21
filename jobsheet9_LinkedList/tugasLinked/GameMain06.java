package jobsheet9_LinkedList.tugasLinked;

public class GameMain06 {
    public static void main(String[] args) {
        ScavengerHunt06 game = new ScavengerHunt06();
        
        // Add points/questions to the game
        game.addPoint("What is the capital of France?", "Paris");
        game.addPoint("What is the largest mammal?", "Blue whale");
        game.addPoint("What is 2 + 2?", "4");

        // Game logic
        System.out.println("Welcome to the Scavenger Hunt!");
        while (game.start != null) { // Terminate loop when all points have been visited
            System.out.println("Question: " + game.start.question);
            // Logic to get user's answer
            String answer = "User's answer"; // Get the user's answer
            if (game.checkAnswer(answer)) {
                System.out.println("Correct answer! Moving to the next point.");
                game.nextPoint();
            } else {
                System.out.println("Wrong answer! Try again.");
                // Logic to handle wrong answer
            }
        }
        System.out.println("Congratulations! You completed the Scavenger Hunt!");
    }
}
