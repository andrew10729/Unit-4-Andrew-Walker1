import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;




public class bankTester {
    public static void main(String[] args) {
        System.out.println("Welcome To The Bank!");
        System.out.println("--------------------");
        System.out.println("Your Current Balance ");
        System.out.println("                     ");
        bankAccount b1 = new bankAccount();

        System.out.println("How Much Money do You Want to Deposit?");


        b1.deposit(10000);
        System.out.println("You Deposited "+b1.getBalance()+" dollars!");
        System.out.println("Your current balance is "+b1.getBalance()+"dollars");

        b1.withdraw(8976);
        System.out.println("You withdrew "+b1.getWithdrew()+" dollars!");

        System.out.println("Your Remaining Balance "+b1.getBalance()+"" );

        b1.interest();









    }








}
