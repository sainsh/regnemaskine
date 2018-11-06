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
                    }


                }

            }


            talDisplay.setText(String.valueOf(resultat));   //display result
            numbers.clear();
            operations.clear();
        } catch (NumberFormatException e) {
            System.out.println("Obs: NumberFormatException" + e.getCause() + e.getMessage()); // if text is inputted
        } catch (ArithmeticException e){
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

    public void gangeMetode(ActionEvent actionEvent) {
        try {
            numbers.add(Double.parseDouble(talDisplay.getText()));
            operations.add("*");
            talDisplay.setText("0");
        } catch (NumberFormatException e) {
            System.out.println("Obs: NumberFormatException" + e.getCause() + e.getMessage());
        }
    }

    public void deviderMetode(ActionEvent actionEvent) {
        try {
            numbers.add(Double.parseDouble(talDisplay.getText()));
            operations.add("/");
            talDisplay.setText("0");
        } catch (NumberFormatException e) {
            System.out.println("Obs: NumberFormatException" + e.getCause() + e.getMessage());
        }
    }
}



