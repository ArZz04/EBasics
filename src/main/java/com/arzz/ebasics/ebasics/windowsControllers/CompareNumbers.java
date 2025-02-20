package com.arzz.ebasics.ebasics.windowsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CompareNumbers {

    @FXML
    private TextField textFieldA;
    @FXML
    private TextField textFieldB;
    @FXML
    private TextField textFieldC;
    @FXML
    private Label resultLabel;

    @FXML
    private void compareNumbers() {
        try {
            // Obtener los valores ingresados
            int A = Integer.parseInt(textFieldA.getText());
            int B = Integer.parseInt(textFieldB.getText());
            int C = Integer.parseInt(textFieldC.getText());

            // Verificar que los valores sean distintos
            if (A == B || B == C || A == C) {
                // Mostrar alerta si los valores no son distintos
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Los valores deben ser distintos");
                alert.showAndWait();
            } else {
                // Determinar el mayor y el menor
                int mayor = Math.max(A, Math.max(B, C));
                int menor = Math.min(A, Math.min(B, C));

                // Mostrar el resultado
                resultLabel.setText("Mayor: " + mayor + "\nMenor: " + menor);
            }
        } catch (NumberFormatException e) {
            // Mostrar alerta si hay un error de formato (no es un número)
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error de Entrada");
            alert.setHeaderText("Por favor, ingrese valores válidos.");
            alert.showAndWait();
        }
    }
}
