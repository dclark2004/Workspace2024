import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args) {
		
		String guessInput = JOptionPane.showInputDialog("Think of a number between 1 and 10");
		try {
			Integer.parseInt(guessInput);
			
			int randomNumber = 1 + (int)(Math.random() * 10);
			
			JOptionPane.showMessageDialog(null, "The number is: " + randomNumber);
			
			} finally {
		}

	}
}


