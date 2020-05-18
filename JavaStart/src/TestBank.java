import conceptOOPS.ICICIBank;
import conceptOOPS.USBank;

public class TestBank {

	public static void main(String[] args) {
		ICICIBank I = new ICICIBank();
		I.Homeloan();
		I.Carloan();
		I.Landloan();
		I.Credit();
		I.Debit();
		I.Transaction();
		System.out.println(USBank.Amount);
	}
}
