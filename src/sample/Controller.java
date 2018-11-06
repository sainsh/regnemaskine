package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;


public class Controller {

    @FXML
    public TextField talDisplay;

    private List<Double> numbers = new ArrayList();
    private List<String> operations = new ArrayList<>();


    public void plusMetode(ActionEvent actionEvent) {
        try {
            numbers.add(Double.parseDouble(talDisplay.getText()));
            operations.add("+");
            talDisplay.setText("0");
        } catch (NumberFormatException e) {
            System.out.println("Obs: NumberFormatException" + e.getCause() + e.getMessage());
        }

    }

    public void equalsMetode(ActionEvent actionEvent) {
        try {
            numbers.add(Double.parseDouble(talDisplay.getText()));
            double resultat = numbers.get(0);
            System.out.print("start: " + resultat + "\n");


            if (!operations.isEmpty()) {

                for (int i = 0; i < operations.size(); i++) {

                    if (operations.get(i).equals("+")) {
                        System.out.print(resultat + " + " + numbers.get(i + 1) + " = ");
                        resultat += numbers.get(i + 1);
                        System.out.print(resultat + "\n");


                    } else if (operations.get(i).equals("-")) {
                        System.out.print(resultat + " - " + numbers.get(i + 1) + " = ");
                        resultat -= numbers.get(i + 1);
                        System.out.print(resultat + "\n");
                    } else if (operations.get(i).equals("*")) {
                        System.out.print(resultat + " * " + numbers.get(i + 1) + " = ");
                        resultat *= numbers.get(i + 1);
                        System.out.print(resultat + "\n");
                    } else if (operations.get(i).equals("/")) {
                        System.out.print(resultat + " / " + numbers.get(i + 1) + " = ");
                        resultat /= numbers.get(i + 1);
                        System.out.print(resultat + "\n");
                    }


                }

            }


            talDisplay.setText(String.valueOf(resultat));
            numbers.clear();
            operations.clear();
        } catch (NumberFormatException e) {
            System.out.println("Obs: NumberFormatException" + e.getCause() + e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Obs: ArithemeticException" + e.getCause() + e.getMessage());
        }
    }


    public void minusMetode(ActionEvent actionEvent) {
        try {
            numbers.add(Double.parseDouble(talDisplay.getText()));
            operations.add("-");
            talDisplay.setText("0");
        } catch (NumberFormatException e) {
            System.out.println("Obs: NumberFormatException" + e.getCause() + e.getMessage());
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



