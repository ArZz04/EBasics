package com.arzz.ebasics.ebasics.windowsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class ConvertMinutes {

    @FXML
    private TextField minutesInput;

    @FXML
    private Label daysLabel;

    @FXML
    private Label hoursLabel;

    @FXML
    private Label remainingMinutesLabel;

    @FXML
    private Label resultLabel;

    @FXML
    private void convertMinutes() {
        try {
            int totalMinutes = Integer.parseInt(minutesInput.getText());

            int days = totalMinutes / (24 * 60);
            int remainingMinutes = totalMinutes % (24 * 60);
            int hours = remainingMinutes / 60;
            int minutes = remainingMinutes % 60;

            daysLabel.setText(String.format("Días: %d", days));
            hoursLabel.setText(String.format("Horas: %d", hours));
            remainingMinutesLabel.setText(String.format("Minutos: %d", minutes));

            resultLabel.setText(String.format("%d minutos equivalen a %d días, %d horas y %d minutos",
                    totalMinutes, days, hours, minutes));
        } catch (NumberFormatException e) {
            resultLabel.setText("Por favor, ingrese un número entero válido de minutos.");
            daysLabel.setText("");
            hoursLabel.setText("");
            remainingMinutesLabel.setText("");
        }
    }
}

