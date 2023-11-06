public class CakeShop {
    public static void main(String[] args) {
        System.out.println("\n Welcome to the cake shop! \n");
    CakeShop myBakery = new CakeShop();
    }

    public CakeShop(){

        Cake chocolate;
        chocolate = new Cake ("turqoise", 3,
                "chocolate", true);

        chocolate.printInfo();
        System.out.println("Here is your order!");


    }




}