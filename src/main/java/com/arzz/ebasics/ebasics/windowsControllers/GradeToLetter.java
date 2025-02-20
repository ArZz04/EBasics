package com.arzz.ebasics.ebasics.windowsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class GradeToLetter {

    @FXML
    private TextField gradeInput;

    @FXML
    private Label resultLabel;

    @FXML
    private void convertGrade() {
        try {
            int grade = Integer.parseInt(gradeInput.getText());

            if (grade < 1 || grade > 20) {
                resultLabel.setText("Por favor, ingrese una calificación entre 1 y 20.");
            } else {
                String letterGrade = convertToLetter(grade);
                resultLabel.setText(String.format("Calificación numérica: %d - Calificación en letra: %s", grade, letterGrade));
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Por favor, ingrese un número entero válido.");
        }
    }

    private String convertToLetter(int grade) {
        if (grade >= 19) {
            return "A";
        } else if (grade >= 16) {
            return "B";
        } else if (grade >= 13) {
            return "C";
        } else if (grade >= 10) {
            return "D";
        } else {
            return "E";
        }
    }
}
