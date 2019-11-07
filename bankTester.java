public class bankTester {
    public static void main(String[] args) {
        System.out.println("Welcome To The Bank!");
        System.out.println("--------------------");
        System.out.println("Your Current Balance ");
        System.out.println("                     ");
        bankAccount b1 = new bankAccount();

        System.out.println("How Much Money do You Want to Deposit?");


        b1.deposit(1000);
        System.out.print("You Deposited " +  +"dollars!");
    }
}
