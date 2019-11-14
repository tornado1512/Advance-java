package elfuncs;
import java.util.Random;
public class ELFuncs{
	public static int showDice(){
		Random random = new Random();

		return random.nextInt(5);
	}
}