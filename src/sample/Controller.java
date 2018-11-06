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
        numbers.add(Double.parseDouble(talDisplay.getText()));
        operations.add("+");
        talDisplay.setText("0");

    }

    public void equalsMetode(ActionEvent actionEvent) {
        numbers.add(Double.parseDouble(talDisplay.getText()));
        double resultat = numbers.get(0);
        System.out.println("start: " + resultat);


        if (!operations.isEmpty()) {

            for (int i = 0; i < operations.size(); i++) {

                if (operations.get(i).equals("+")) {
                    System.out.print("\n");
                    resultat += numbers.get(i + 1);
                    System.out.println(resultat);


                } else if (operations.get(i).equals("-")) {
                    System.out.println("nummer " + i + " " + numbers.get(i + 1));
                    resultat -= numbers.get(i + 1);
                    System.out.println(resultat);
                }


            }
        }

        System.out.println(resultat);
        talDisplay.setText(String.valueOf(resultat));
        numbers.clear();
        operations.clear();
    }


    public void minusMetode(ActionEvent actionEvent) {
        numbers.add(Double.parseDouble(talDisplay.getText()));
        operations.add("-");
        talDisplay.setText("0");
    }
}



