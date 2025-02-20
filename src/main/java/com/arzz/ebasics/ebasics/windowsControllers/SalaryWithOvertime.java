package com.arzz.ebasics.ebasics.windowsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class SalaryWithOvertime {

    @FXML
    private TextField hoursInput;

    @FXML
    private TextField rateInput;

    @FXML
    private Label resultLabel;

    @FXML
    private void calculateSalary() {
        try {
            double hours = Double.parseDouble(hoursInput.getText());
            double rate = Double.parseDouble(rateInput.getText());

            double salary;
            if (hours <= 40) {
                salary = hours * rate;
            } else {
                double regularPay = 40 * rate;
                double overtimeHours = hours - 40;
                double overtimeRate = rate * 1.5;
                double overtimePay = overtimeHours * overtimeRate;
                salary = regularPay + overtimePay;
            }

            resultLabel.setText(String.format("Salario total: $%.2f", salary));
        } catch (NumberFormatException e) {
            resultLabel.setText("Por favor, ingrese valores numéricos válidos.");
        }
    }
}