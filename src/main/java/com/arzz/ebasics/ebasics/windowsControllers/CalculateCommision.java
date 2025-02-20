package com.arzz.ebasics.ebasics.windowsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculateCommision {

    @FXML
    private TextField saleAmount;
    @FXML
    private Label resultLabel;

    @FXML
    private void calculateCommission() {
        try {
            // Obtener el monto de la venta
            double amount = Double.parseDouble(saleAmount.getText());

            // Definir el porcentaje de comisión
            double commissionPercentage = amount < 1000 ? 0.03 : 0.05;

            // Calcular la comisión
            double commission = amount * commissionPercentage;

            // Mostrar el resultado
            resultLabel.setText("Comisión: $" + String.format("%.2f", commission));
        } catch (NumberFormatException e) {
            // Mostrar alerta si el formato de entrada no es válido
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error de Entrada");
            alert.setHeaderText("Por favor, ingrese un monto válido.");
            alert.showAndWait();
        }
    }
}
