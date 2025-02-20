package com.arzz.ebasics.ebasics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class EBasiController {

    private void openWindow(String fxmlFile, String titulo, Stage parentStage, double width, double height) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();

            // Crear una nueva ventana (Stage)
            Stage newStage = new Stage();
            newStage.setTitle(titulo);

            // Hacer que la ventana no sea redimensionable
            newStage.setResizable(false);

            // Establecer dimensiones para la ventana hija
            newStage.setWidth(width);
            newStage.setHeight(height);

            // Mostrar la nueva ventana
            newStage.setScene(new Scene(root));
            newStage.show();

            // Poner la ventana padre en segundo plano
            parentStage.toBack(); // Coloca la ventana padre en el fondo

            // Al cerrar la ventana hija, traer la ventana padre al frente
            newStage.setOnCloseRequest(e -> parentStage.toFront());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Métodos para abrir las ventanas con el tamaño heredado de la ventana principal
    @FXML
    public void onCalculateAreas(ActionEvent event) {
        Stage parentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        openWindow("calculateAreas.fxml", "Calculate Areas", parentStage, parentStage.getWidth(), parentStage.getHeight());
    }

    @FXML
    public void onConvertTemperature(ActionEvent event) {
        Stage parentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        openWindow("convertTemperature.fxml", "Convert Temperature", parentStage, parentStage.getWidth(), parentStage.getHeight());
    }

    @FXML
    public void onCalculateCommission(ActionEvent event) {
        Stage parentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        openWindow("calculateCommission.fxml", "Calculate Commission", parentStage, parentStage.getWidth(), parentStage.getHeight());
    }

    @FXML
    public void onSalaryIncrease(ActionEvent event) {
        Stage parentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        openWindow("salaryIncrease.fxml", "Salary Increase", parentStage, parentStage.getWidth(), parentStage.getHeight());
    }

    @FXML
    public void onCompareNumbers(ActionEvent event) {
        Stage parentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        openWindow("compareNumbers.fxml", "Compare Numbers", parentStage, parentStage.getWidth(), parentStage.getHeight());
    }

    @FXML
    public void onVideoClubDiscount(ActionEvent event) {
        Stage parentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        openWindow("videoClubDiscount.fxml", "Video Club Discount", parentStage, parentStage.getWidth(), parentStage.getHeight());
    }

    @FXML
    public void onGradesToText(ActionEvent event) {
        Stage parentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        openWindow("gradesToText.fxml", "Grades to Text", parentStage, parentStage.getWidth(), parentStage.getHeight());
    }

    @FXML
    public void onGradeToLetter(ActionEvent event) {
        Stage parentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        openWindow("gradeToLetter.fxml", "Grade to Letter", parentStage, parentStage.getWidth(), parentStage.getHeight());
    }

    @FXML
    public void onSalaryWithOvertime(ActionEvent event) {
        Stage parentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        openWindow("salaryWithOvertime.fxml", "Salary with Overtime", parentStage, parentStage.getWidth(), parentStage.getHeight());
    }

    @FXML
    public void onConvertMinutes(ActionEvent event) {
        Stage parentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        openWindow("convertMinutes.fxml", "Convert Minutes", parentStage, parentStage.getWidth(), parentStage.getHeight());
    }

    @FXML
    public void onConditionals(ActionEvent event) {
        Stage parentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        openWindow("conditionals.fxml", "Conditionals", parentStage, 650, 800);
    }

    // Método específico para la ventana "Loops" con tamaño personalizado
    @FXML
    public void onLoops(ActionEvent event) {
        Stage parentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Abre la nueva ventana con un tamaño específico (600x400)
        openWindow("loops.fxml", "Loops", parentStage, 650, 800);
    }
}
