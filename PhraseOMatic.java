public class PhraseOMatic
{
	public static void main(String[] args)
	{
		String[] wordListOne = {"24/7", "multi-tier", "30,000 foot", "win-win", "front-end", "web-based", "pervasive",
		                        "smart", "six-sigma", "critical-path", "dynamic"};
		String[] wordListTwo = {"empowered", "sitcky", "value-added", " oriented", "centric", "distributed", "clusterd",
		                        "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned",
		                        "targeted", "shared", "cooperative", "accelerated", "global"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
                                  "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        int rand1 = (int) (Math.random() * wordListOne.length);
        int rand2 = (int) (Math.random() * wordListTwo.length);
        int rand3 = (int) (Math.random() * wordListThree.length);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase + " and we need it right now!");
	}
}
