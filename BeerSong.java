public class BeerSong
{
	public static void main(String args[])
	{
	   int nCountDown = 100;

	    while (nCountDown > 0)
	    {
            System.out.println(nCountDown + " bottle" + (nCountDown > 1 ? "s" : "") + " of beer on the wall");
            System.out.println(nCountDown + " bottle" + (nCountDown > 1 ? "s" : "") + " of beer");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            nCountDown = nCountDown - 1;
            
            if (nCountDown > 0)
            {
                System.out.println(nCountDown + " bottle" + (nCountDown > 1 ? "s" : "") + " of beer on the wall");
            }
        }
        
        System.out.println("No more bottles of beer on the wall");

	}
}
