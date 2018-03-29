package sajat.elso;

public class Szam
{
	private static double tures = 0.001;
	private double valosSzam;
	
	public double getValosSzam ()
	{
		return this.valosSzam;
	}
	
	public void setValosSzam (double valosSzam)
	{
		this.valosSzam = valosSzam;
	}
	
	
	public Szam (double valosSzam)
	{
		this.valosSzam = valosSzam;
	}
	
	boolean Tures (double parameter)
	{
		boolean tures = false;
		if (this.valosSzam - parameter < this.tures)
		{
			tures = true;
		}
		return tures;
	}
}
