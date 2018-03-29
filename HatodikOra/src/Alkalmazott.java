
public class Alkalmazott
{
	private String nev;
	private int kor, fizetes;
	static int nyugdijKorhatar = 65;
	
	void Alkalmazott (String nev, int kor, int fizetes)
	{
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}
	
	void Alkalmazott (String nev, int kor)
	{
		this.nev = nev;
		this.kor = kor;
		this.fizetes = kor * 10000;
	}
	
	public int EvNyugdijig ()
	{
		return 60 - this.kor;
	}
	
	public String AlkalmazottAdatai ()
	{
		return "Az alkalmozott, neve: " + this.nev + ", életkora: " + this.kor + ", fizetése: " + this.fizetes + ", hátralévő évek a nyudíjig: " + EvNyugdijig ();
	}
	
	public void setNyugdijKorhatar (int nyugdijKorhatar)
	{
		this.nyugdijKorhatar = nyugdijKorhatar;
	}
	
	public Alkalmazott KinekVanTobbHatraNyugdijig (Alkalmazott elsoAlkalmazott, Alkalmazott masodikAlkalmazott)
	{
		if (elsoAlkalmazott.EvNyugdijig() > masodikAlkalmazott.EvNyugdijig())
		{
			return elsoAlkalmazott;
		}
		else
		{
			System.out.println("A második dolgozónak van hátra több éve a nyugdíjig.");
			return masodikAlkalmazott;
		}
	}
}
