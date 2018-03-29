package sajat.masodik;

import java.util.Random;
import sajat.elso.Szam;

public class mainSzam
{
	public static void main(String[] args)
	{
		Random rand = new Random ();
		double valosSzam = rand.nextDouble();
		Szam szam = new Szam (valosSzam);
		final double lokalisSzam = szam.getValosSzam();
		
		
	}

}
