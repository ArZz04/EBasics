package com.arzz.ebasics.ebasics.windowsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Arrays;

public class VideoClubDiscount {

    @FXML
    private TextField price1;
    @FXML
    private TextField price2;
    @FXML
    private TextField price3;
    @FXML
    private Label resultLabel;

    @FXML
    private void calculateTotal() {
        try {
            // Obtener los precios de las películas
            double p1 = Double.parseDouble(price1.getText());
            double p2 = Double.parseDouble(price2.getText());
            double p3 = Double.parseDouble(price3.getText());

            // Ordenar los precios de menor a mayor
            double[] prices = {p1, p2, p3};
            Arrays.sort(prices);

            // Calcular el precio total (precio de las dos más baratas)
            double total = prices[0] + prices[1];

            // Mostrar el resultado
            resultLabel.setText("Total a pagar: $" + total);
        } catch (NumberFormatException e) {
            // Mostrar alerta si el formato de algún precio no es válido
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error de Entrada");
            alert.setHeaderText("Por favor, ingrese valores válidos.");
            alert.showAndWait();
        }
    }
}
