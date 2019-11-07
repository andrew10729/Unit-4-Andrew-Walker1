public class bankAccount {
    private int balance;

        public bankAccount(){
        balance = 0;

        }



        public double getBalance() {
        return balance;
        }



        public int deposit(int money) {
            balance = balance + money;
            return balance;




        }






}
