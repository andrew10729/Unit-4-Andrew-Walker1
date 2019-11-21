public class bankAccount {
    private int balance;
    private int withdrew;


        public bankAccount(){
        balance = 0;
        withdrew = 0;



        }



        public double getBalance() {
        return balance;
        }

    public int getWithdrew() {
        return withdrew;
    }

    public int deposit(int money) {
            balance = balance + money;
            return balance;

        }

        public int withdraw(int drawCash) {
            //withdrew = balance - drawCash;
           balance = balance - drawCash;
            return balance;

        }








}
