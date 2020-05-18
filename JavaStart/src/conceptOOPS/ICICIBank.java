package conceptOOPS;

public class ICICIBank implements USBank,RBIBank 
{
	@Override
	public void Homeloan() {
		System.out.println("ICICI -- Homeloan");
	}

	@Override
	public void Carloan() {
		System.out.println("ICICI -- Carloan");
	}

	@Override
	public void Landloan() {
		System.out.println("ICICI -- Landloan");
	}

	@Override
	public void Debit() {
		System.out.println("ICICI -- Debit");
	}

	@Override
	public void Credit() {
		System.out.println("ICICI -- Credit");
	}

	@Override
	public void Transaction() {
		System.out.println("ICICI -- Transaction");
	}
	

}
