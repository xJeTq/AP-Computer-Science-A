
public class RockPaperScissorsMethod {

	public static String computerChoice () {
		
		int computerChoice = (int) (Math.random() * 3);
		
		if (computerChoice == 0) {
			
			return "Rock";
			
		} else if (computerChoice == 1) {
			
			return "Paper";
			
		} else {
			
			return "Scissors";
			
		}
		
	}
	
	public static String winOrLose (String playerChoice) {
		
		String computerChoice = computerChoice();
		
		if (playerChoice.equals(computerChoice)) {
			
			return "Draw";
			
		} else if (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) {
			
			return "Win";
			
		} else if (playerChoice.equals("Paper") && computerChoice.equals("Rock")) {
			
			return "Win";
			
		} else if (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) {
			
			
			return "Win";
			
		} else { 
			
			return "Lose";
			
		}
	}
	
}
