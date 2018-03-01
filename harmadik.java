import java.util.Scanner;

public class harmadik
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.print("Adj meg egy szamot: ");
		int elsoSzam = scanner.nextInt();
		System.out.print("Adj meg egy masik szamot: ");
		int masodikSzam = scanner.nextInt();
		System.out.print("Adj meg egy műveletet: ");
		String muvelet = scanner.next();
		
		switch (muvelet)
		{
			case "+":
				System.out.print(elsoSzam + masodikSzam);
				break;
			case "-":
				System.out.print(elsoSzam - masodikSzam);
				break;
			case "*":
				System.out.print(elsoSzam * masodikSzam);
				break;
			case "/":
				if (masodikSzam == 0)
				{
					System.out.print("0-val nem lehet osztani.");
				}
				else
				{
					System.out.print(elsoSzam / masodikSzam);
				}
				break;
			default:
				System.out.print("Rossz erteket adtal meg.");
				break;
			
		}
	}
}
