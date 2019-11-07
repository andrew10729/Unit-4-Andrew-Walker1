public class dieTester {
    public static void main(String[] args) {
        System.out.println("welcome to the Dice Simulator!!");

        Die d1 = new Die();
        Die d2 = new Die();

        d1.roll();
        d2.roll();

        System.out.println("Die 1 = " + d1.getFace());
        System.out.println("Die 2 = " + d2.getFace());

        if(d1 == d2) {
            System.out.println("You Got A Double!");
        }else{
            System.out.println("Fail!");
            d1.roll();
            d2.roll();
            System.out.println("Die 1 = " + d1.getFace());
            System.out.println("Die 2 = " + d2.getFace());

        }



    }

}
