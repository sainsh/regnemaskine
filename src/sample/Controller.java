package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;


public class Controller {

    @FXML
    public TextField talDisplay;    // access to textfield

    private List<Double> numbers = new ArrayList(); //list of input numbers
    private List<String> operations = new ArrayList<>(); // list of operations


    public void plusMetode(ActionEvent actionEvent) {
        try {
            numbers.add(Double.parseDouble(talDisplay.getText())); //add number to numbers
            operations.add("+");    //add operator
            talDisplay.setText("0");
        } catch (NumberFormatException e) {
            System.out.println("Obs: NumberFormatException" + e.getCause() + e.getMessage());
        }

    }

    public void equalsMetode(ActionEvent actionEvent) {
        try {
            numbers.add(Double.parseDouble(talDisplay.getText()));//add number to numbers
            double resultat = numbers.get(0);   //set result as first number
            System.out.print("start: " + resultat + "\n");


            if (!operations.isEmpty()) {

                for (int i = 0; i < operations.size(); i++) {   //run through operators

                    if (operations.get(i).equals("+")) {    // adds result and next number
                        System.out.print(resultat + " + " + numbers.get(i + 1) + " = ");
                        resultat += numbers.get(i + 1);
                        System.out.print(resultat + "\n");


                    } else if (operations.get(i).equals("-")) { // subtracts next number from result
                        System.out.print(resultat + " - " + numbers.get(i + 1) + " = ");
                        resultat -= numbers.get(i + 1);
                        System.out.print(resultat + "\n");

                    } else if (operations.get(i).equals("*")) { //multiplies result and next number
                        System.out.print(resultat + " * " + numbers.get(i + 1) + " = ");
                        resultat *= numbers.get(i + 1);
                        System.out.print(resultat + "\n");

                    } else if (operations.get(i).equals("/")) { // divides result and next number
                        System.out.print(resultat + " / " + numbers.get(i + 1) + " = ");
                        resultat /= numbers.get(i + 1);
                        System.out.print(resultat + "\n");
                    } else if (operations.get(i).equals("%")) {
                        System.out.print(resultat + " % " + numbers.get(i + 1)+ " = ");
                        resultat %= numbers.get(i+1);
                        System.out.print(resultat + "\n");
                    }


                }

            }


            talDisplay.setText(String.valueOf(resultat));   //display result
            numbers.clear();
            operations.clear();
        } catch (NumberFormatException e) {
            System.out.println("Obs: NumberFormatException" + e.getCause() + e.getMessage()); // if text is inputted
        } catch (ArithmeticException e) {
            System.out.println("Obs: ArithemeticException" + e.getCause() + e.getMessage()); // math errors
        }
    }


    public void minusMetode(ActionEvent actionEvent) {
        try {
            numbers.add(Double.parseDouble(talDisplay.getText()));  //add input to numbers
            operations.add("-");    //add operator
            talDisplay.setText("0");
        } catch (NumberFormatException e) {
            System.out.println("Obs: NumberFormatException" + e.getCause() + e.getMessage());   //if text is inputted
        }
    }

    public void gangeMetode(ActionEvent actionEvent) {  //add multiply to operations
        try {
            numbers.add(Double.parseDouble(talDisplay.getText()));
            operations.add("*");
            talDisplay.setText("0");
        } catch (NumberFormatException e) {
            System.out.println("Obs: NumberFormatException" + e.getCause() + e.getMessage());
        }
    }

    public void deviderMetode(ActionEvent actionEvent) {    //add divide to operations
        try {
            numbers.add(Double.parseDouble(talDisplay.getText()));
            operations.add("/");
            talDisplay.setText("0");
        } catch (NumberFormatException e) {
            System.out.println("Obs: NumberFormatException" + e.getCause() + e.getMessage());
        }
    }

    public void OnClick7(ActionEvent actionEvent) {
        talDisplay.setText(talDisplay.getText() + 7);
    }

    public void OnClick8(ActionEvent actionEvent) {
        talDisplay.setText(talDisplay.getText() + 8);
    }

    public void OnClick4(ActionEvent actionEvent) {
        talDisplay.setText(talDisplay.getText() + 4);
    }

    public void OnClick5(ActionEvent actionEvent) {
        talDisplay.setText(talDisplay.getText() + 5);
    }

    public void OnClick6(ActionEvent actionEvent) {
        talDisplay.setText(talDisplay.getText() + 6);
    }

    public void OnClick1(ActionEvent actionEvent) {
        talDisplay.setText(talDisplay.getText() + 1);
    }

    public void OnClick2(ActionEvent actionEvent) {
        talDisplay.setText(talDisplay.getText() + 2);
    }

    public void OnClick3(ActionEvent actionEvent) {
        talDisplay.setText(talDisplay.getText() + 3);
    }

    public void OnClick0(ActionEvent actionEvent) {
        talDisplay.setText(talDisplay.getText() + 0);
    }

    public void OnClick9(ActionEvent actionEvent) {
        talDisplay.setText(talDisplay.getText() + 9);
    }

    public void modulusMetode(ActionEvent actionEvent) {    //adds modulus to operations
        try {
            numbers.add(Double.parseDouble(talDisplay.getText()));
            operations.add("%");
            talDisplay.setText("0");
        } catch (NumberFormatException e) {
            System.out.println("Obs: NumberFormatException" + e.getCause() + e.getMessage());
        }

    }

    public void clearDisplayMethod(ActionEvent actionEvent) {

        talDisplay.setText("0");

    }

    public void clearRecordMetode(ActionEvent actionEvent) {    //empties numbers and operations
        numbers.clear();
        operations.clear();
        talDisplay.setText("0");
    }
}



