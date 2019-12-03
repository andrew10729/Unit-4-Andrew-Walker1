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
           int diff = drawCash - balance;
           diff = diff * -1;
            withdrew = balance - diff;
           balance = balance - drawCash;
            return balance;

        }

        public void interest(int rate){
            int interstRate = rate;
            int stepOne = balance * rate;
          balance = balance + stepOne;






        }








}
