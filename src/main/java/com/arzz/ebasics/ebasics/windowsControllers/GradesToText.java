package com.arzz.ebasics.ebasics.windowsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class GradesToText {

    @FXML
    private TextField gradeInput;

    @FXML
    private Label resultLabel;

    @FXML
    private void convertGrade() {
        try {
            double grade = Double.parseDouble(gradeInput.getText());

            if (grade < 0 || grade > 10) {
                resultLabel.setText("Por favor, ingrese una calificación entre 0 y 10.");
            } else {
                String result = (grade >= 7.0) ? "Aprobado" : "Reprobado";
                resultLabel.setText(String.format("Calificación: %.1f - %s", grade, result));
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Por favor, ingrese un número válido.");
        }
    }
}