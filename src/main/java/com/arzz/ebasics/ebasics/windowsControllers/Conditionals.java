package com.arzz.ebasics.ebasics.windowsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class Conditionals {

    @FXML private TextField textField1, textField2, textField3, textField4, textField5, textField6;
    @FXML private Label labelResult1, labelResult2, labelResult3, labelResult4, labelResult5, labelResult6, labelResult7, labelResult8, labelResult9, labelResult10;
    @FXML private Button calculateBtn1, calculateBtn2, checkBtn1, calculateBtn3, calculateBtn4, verifyBtn1, calculateBtn5, calculateBtn6, calculateBtn7, calculateBtn8;
    @FXML private MenuButton categoryMenu;
    @FXML private MenuItem sindicalizado, deConfianza, altoDirectivo, ejecutivo;

    @FXML
    private void initialize() {
        // Add action listeners
        calculateBtn1.setOnAction(event -> calcularMayorEntreDos());
        calculateBtn2.setOnAction(event -> calcularMayorEntreTres());
        checkBtn1.setOnAction(event -> verificarPositivoONegativo());
        calculateBtn3.setOnAction(event -> convertirMetros());
        calculateBtn4.setOnAction(event -> convertirCentigradosAFahrenheit());
        verifyBtn1.setOnAction(event -> verificarAptaServicioMilitar());
        calculateBtn5.setOnAction(event -> calcularInteresPrestamo());
        calculateBtn6.setOnAction(event -> calcularComisionVenta());
        calculateBtn7.setOnAction(event -> calcularAumentoSalario());
        calculateBtn8.setOnAction(event -> calcularYSegunValorDeX());
    }

    // 1. Determinar mayor entre 2 números
    private void calcularMayorEntreDos() {
        try {
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());
            double mayor = Math.max(num1, num2);
            labelResult1.setText("Mayor: " + mayor);
        } catch (NumberFormatException e) {
            labelResult1.setText("Por favor ingresa números válidos.");
        }
    }

    // 2. Determinar mayor entre 3 números
    private void calcularMayorEntreTres() {
        try {
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());
            double num3 = Double.parseDouble(textField6.getText());
            double mayor = Math.max(num1, Math.max(num2, num3));
            labelResult2.setText("Mayor: " + mayor);
        } catch (NumberFormatException e) {
            labelResult2.setText("Por favor ingresa números válidos.");
        }
    }

    // 3. Es Positivo o Negativo
    private void verificarPositivoONegativo() {
        try {
            double num = Double.parseDouble(textField3.getText());
            if (num > 0) {
                labelResult3.setText("Positivo");
            } else if (num < 0) {
                labelResult3.setText("Negativo");
            } else {
                labelResult3.setText("Es cero");
            }
        } catch (NumberFormatException e) {
            labelResult3.setText("Por favor ingresa un número válido.");
        }
    }

    // 4. Conversión de metros
    private void convertirMetros() {
        try {
            double metros = Double.parseDouble(textField4.getText());
            // Conversión a otras unidades
            // Ejemplo a kilómetros
            double kilometros = metros / 1000;
            labelResult4.setText(metros + " metros son " + kilometros + " kilómetros");
        } catch (NumberFormatException e) {
            labelResult4.setText("Por favor ingresa un valor válido.");
        }
    }

    // 5. Centígrados a Fahrenheit
    private void convertirCentigradosAFahrenheit() {
        try {
            double centigrados = Double.parseDouble(textField5.getText());
            double fahrenheit = (centigrados * 9 / 5) + 32;
            labelResult5.setText(centigrados + " °C = " + fahrenheit + " °F");
        } catch (NumberFormatException e) {
            labelResult5.setText("Por favor ingresa un valor válido.");
        }
    }

    // 6. Apta para Servicio Militar
    private void verificarAptaServicioMilitar() {
        try {
            int edad = Integer.parseInt(textField4.getText());
            if (edad >= 18 && edad <= 35) {
                labelResult6.setText("Apta para el servicio militar");
            } else {
                labelResult6.setText("No apta para el servicio militar");
            }
        } catch (NumberFormatException e) {
            labelResult6.setText("Por favor ingresa una edad válida.");
        }
    }

    // 7. Cálculo de interés de préstamo
    private void calcularInteresPrestamo() {
        try {
            double monto = Double.parseDouble(textField5.getText());
            double interes = monto * 0.05; // Supongamos que el interés es 5%
            labelResult7.setText("Interés total: " + interes);
        } catch (NumberFormatException e) {
            labelResult7.setText("Por favor ingresa un monto válido.");
        }
    }

    // 8. Comisión de ventas
    private void calcularComisionVenta() {
        try {
            double venta = Double.parseDouble(textField5.getText());
            double comision = venta * 0.1; // Supongamos que la comisión es del 10%
            labelResult8.setText("Comisión: " + comision);
        } catch (NumberFormatException e) {
            labelResult8.setText("Por favor ingresa un monto de venta válido.");
        }
    }

    // 9. Aumento de salario
    private void calcularAumentoSalario() {
        try {
            double salario = Double.parseDouble(textField5.getText());
            String categoria = categoryMenu.getText();
            double aumento = 0;

            switch (categoria) {
                case "Sindicalizado":
                    aumento = salario * 0.05;
                    break;
                case "De confianza":
                    aumento = salario * 0.10;
                    break;
                case "Alto directivo":
                    aumento = salario * 0.15;
                    break;
                case "Ejecutivo":
                    aumento = salario * 0.12;
                    break;
                default:
                    aumento = 0;
            }

            labelResult9.setText("Nuevo salario: " + (salario + aumento));
        } catch (NumberFormatException e) {
            labelResult9.setText("Por favor ingresa un salario válido.");
        }
    }

    // 10. Calcular y según valor de x
    private void calcularYSegunValorDeX() {
        try {
            double x = Double.parseDouble(textField5.getText());
            double y = 0;

            if (x <= 11) {
                y = 3 * x + 36;
            } else if (x > 11 && x <= 33) {
                y = Math.pow(x, 2) - 10;
            } else if (x > 33 && x <= 64) {
                y = x + 6;
            }

            labelResult10.setText("y: " + y);
        } catch (NumberFormatException e) {
            labelResult10.setText("Por favor ingresa un valor válido.");
        }
    }
}
