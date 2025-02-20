package com.arzz.ebasics.ebasics.windowsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


public class ConvertTemperature {

    @FXML
    private TextField celsiusInput;

    @FXML
    private Label resultLabel;

    @FXML
    private void convertToFahrenheit() {
        try {
            double celsius = Double.parseDouble(celsiusInput.getText());
            double fahrenheit = (celsius * 9/5) + 32;
            resultLabel.setText(String.format("%.2f°C es igual a %.2f°F", celsius, fahrenheit));
        } catch (NumberFormatException e) {
            resultLabel.setText("Por favor, ingrese un número válido.");
        }
    }
}
