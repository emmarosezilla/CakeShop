public class Cake {

    public String icingColour;
    public int numTiers;
    public String flavour;
    public boolean hasSprinkles;
    public int numCandles;

    public Cake (String paramColour, int paramNumTiers,
                 String paramFlavour, boolean paramHasSprinkles){
        icingColour = paramColour;
        numTiers = paramNumTiers;
        flavour = paramFlavour;
        hasSprinkles = paramHasSprinkles;
        numCandles = (int)(Math.random()*10);

    }

    public void printInfo (){
        System.out.println("Your cake has " + icingColour + " coloured icing!");
        System.out.println("Your cake has " + numTiers + " cake tiers.");
        System.out.println("Your cake is " + flavour + " flavoured.");
        System.out.println("Your cake has " + numCandles + " candles.");

        if (hasSprinkles == true){
            System.out.println("Your cake has sprinkles. ");
        }
        else {
            System.out.println("Your cake doesn't have sprinkles.");
        }

    }



}
