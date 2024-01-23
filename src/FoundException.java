import java.util.Date;

public class FoundException {
	public static void main(String[] args) {
		Date date = null;
		Date today = new Date();
		Date[] dateTab = {date, today};

		for(int i = 0; i < dateTab.length; i++) {
			try {
				System.out.println(dateTab[i].getClass().getName());

			} catch(NullPointerException e) {
				System.out.println("Une date ne peut pas être null !");
			}
		}

	}
}
