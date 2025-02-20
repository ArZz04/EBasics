package com.arzz.ebasics.ebasics.windowsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class CalculateAreas {

    // FXML elements
    @FXML
    private VBox circleInputs;
    @FXML
    private VBox triangleInputs;
    @FXML
    private TextField circleRadius;
    @FXML
    private TextField triangleSideA;
    @FXML
    private TextField triangleSideB;
    @FXML
    private TextField triangleSideC;
    @FXML
    private Label resultLabel;

    // Method to show inputs for circle calculation
    @FXML
    public void showCircleInputs() {
        circleInputs.setVisible(true);
        triangleInputs.setVisible(false);
        resultLabel.setText(""); // Clear any previous result
    }

    // Method to show inputs for triangle calculation
    @FXML
    public void showTriangleInputs() {
        triangleInputs.setVisible(true);
        circleInputs.setVisible(false);
        resultLabel.setText(""); // Clear any previous result
    }

    // Method to calculate the area of the circle
    @FXML
    public void calculateCircleArea() {
        try {
            double radius = Double.parseDouble(circleRadius.getText());
            if (radius <= 0) {
                resultLabel.setText("El radio debe ser un valor positivo.");
            } else {
                double area = Math.PI * Math.pow(radius, 2);
                resultLabel.setText("Área del Círculo: " + String.format("%.2f", area));
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Por favor, ingresa un valor numérico válido.");
        }
    }

    // Method to calculate the area of the triangle using Heron's formula
    @FXML
    public void calculateTriangleArea() {
        try {
            double a = Double.parseDouble(triangleSideA.getText());
            double b = Double.parseDouble(triangleSideB.getText());
            double c = Double.parseDouble(triangleSideC.getText());

            if (a <= 0 || b <= 0 || c <= 0) {
                resultLabel.setText("Los lados deben ser valores positivos.");
            } else if (a + b <= c || a + c <= b || b + c <= a) {
                resultLabel.setText("Los lados no forman un triángulo válido.");
            } else {
                double s = (a + b + c) / 2; // Semi-perimeter
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                resultLabel.setText("Área del Triángulo: " + String.format("%.2f", area));
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Por favor, ingresa valores numéricos válidos.");
        }
    }
}
