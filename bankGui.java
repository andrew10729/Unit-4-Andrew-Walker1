import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

//make account and pin work
public class bankGui extends Application {
    private bankAccount b1 = new bankAccount();
    private TextField amount;
    private  TextField pin;
    private TextArea status;
    private Button statusButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button depositB = new Button("Deposit");
        depositB.setOnAction(this::deposit);

        Button withdrawB = new Button("Withdraw");
        withdrawB.setOnAction(this::withdraw);

        amount = new TextField();
        status = new TextArea();
        pin = new TextField();
        statusButton = new Button("Status");
        statusButton.setOnAction(this::status);
        Text pinText = new Text("PIN");

        FlowPane flow = new FlowPane(depositB, withdrawB,statusButton,amount,pinText, pin, status);




        Scene scene = new Scene(flow, 500, 500);

        primaryStage.setTitle("Bank Account");
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    private void deposit(ActionEvent event)
    {
       b1.deposit(Integer.parseInt(amount.getText()));
        System.out.println("You Deposited "+ amount.getText() +" dollars!");
        status.setText("You deposited "+amount.getText() +" dollars!");
        System.out.println("Your current balance is "+b1.getBalance());


    }




    private void withdraw(ActionEvent event)
    {





        b1.withdraw(Integer.parseInt(amount.getText()));
        System.out.println("You withdrew "+amount.getText()+" dollars!");
        System.out.println("Your current balance is "+b1.getBalance());
        status.setText("You withdrew "+amount.getText() +" dollars!");
    }









    private void status(ActionEvent event)
    {
        status.setText("Your Balance is "+b1.getBalance());




    }

}

