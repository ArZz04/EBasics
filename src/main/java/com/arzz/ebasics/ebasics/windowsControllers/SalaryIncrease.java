package com.arzz.ebasics.ebasics.windowsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SalaryIncrease {

    @FXML
    private TextField currentSalaryInput;

    @FXML
    private ComboBox<String> categoryComboBox;

    @FXML
    private Label increaseLabel;

    @FXML
    private Label newSalaryLabel;

    @FXML
    private Label resultLabel;

    // Método que se ejecuta al hacer clic en el botón "Calcular aumento"
    @FXML
    private void calculateIncrease() {
        try {
            // Obtener el salario actual ingresado por el usuario
            double currentSalary = Double.parseDouble(currentSalaryInput.getText());

            // Obtener la categoría seleccionada en el ComboBox
            String category = categoryComboBox.getValue();

            if (category == null) {
                resultLabel.setText("Seleccione una categoría.");
                return;
            }

            // Inicializar variables
            double increasePercentage = 0.0;

            // Asignar el porcentaje de aumento según la categoría
            switch (category) {
                case "Sindicalizado":
                    increasePercentage = 20.0;
                    break;
                case "De confianza":
                    increasePercentage = 10.0;
                    break;
                case "Alto directivo":
                    increasePercentage = 5.0;
                    break;
                case "Ejecutivo":
                    increasePercentage = 2.0;
                    break;
                default:
                    resultLabel.setText("Categoría no válida.");
                    return;
            }

            // Calcular el aumento y el nuevo salario
            double increaseAmount = currentSalary * (increasePercentage / 100);
            double newSalary = currentSalary + increaseAmount;

            // Mostrar los resultados en las etiquetas
            increaseLabel.setText(String.format("Aumento: %.2f%% (%.2f)", increasePercentage, increaseAmount));
            newSalaryLabel.setText(String.format("Nuevo salario: %.2f", newSalary));
            resultLabel.setText("Cálculo completado.");

        } catch (NumberFormatException e) {
            resultLabel.setText("Ingrese un salario válido.");
        }
    }
}
