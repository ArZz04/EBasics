package com.arzz.ebasics.ebasics.windowsControllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Loops {

    // FXML fields
    @FXML public TextField tablaInput;
    @FXML public TextField primosInput;
    @FXML public TextField factorialInput;
    @FXML public TextField imparesInput;
    @FXML public TextField perfectoInput;
    @FXML public TextField amigosInput1;
    @FXML public TextField amigosInput2;
    @FXML public TextField potenciaInputP;
    @FXML public TextField potenciaInputN;
    @FXML public TextField exInputX;

    // FXML fields for results
    @FXML private Label sumatoriaResult;
    @FXML private Label sumatoriaMultiplesResult;
    @FXML private TextArea tablaResult;
    @FXML private TextArea primosResult;
    @FXML private Label factorialResult;
    @FXML private TextArea imparesResult;
    @FXML private Label perfectoResult;
    @FXML private Label amigosResult;
    @FXML private Label potenciaResult;
    @FXML private Label exResult;

    // 1. Sumatoria de 1 a 10
    @FXML
    public void handleSumatoria() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        sumatoriaResult.setText("Sumatoria: " + sum);
    }

    // 2. Sumatoria múltiplos de 5 entre 1 y 100
    @FXML
    public void handleSumatoriaMultiples() {
        int sum = 0;
        StringBuilder multiples = new StringBuilder();
        for (int i = 5; i <= 100; i += 5) {
            multiples.append(i).append(" ");
            sum += i;
        }
        sumatoriaMultiplesResult.setText("Múltiplos de 5: " + multiples.toString() + "\nSumatoria: " + sum);
    }

    // 3. Tabla de multiplicar de N
    @FXML
    public void handleTabla() {
        int n = Integer.parseInt(tablaInput.getText().trim());  // Cambié de tablaResult a tablaInput
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            result.append(n).append(" x ").append(i).append(" = ").append(n * i).append("\n");
        }
        tablaResult.setText(result.toString());
    }

    // 4. Primeros N números primos
    @FXML
    public void handlePrimos() {
        int n = Integer.parseInt(primosInput.getText().trim());  // Cambié de primosResult a primosInput
        StringBuilder result = new StringBuilder();
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                result.append(num).append(" ");
                count++;
            }
            num++;
        }
        primosResult.setText("Primos: " + result.toString());
    }

    // Verifica si un número es primo
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 5. Calcular factorial
    @FXML
    public void handleFactorial() {
        int num = Integer.parseInt(factorialInput.getText().trim());  // Cambié de factorialResult a factorialInput
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        factorialResult.setText("Factorial: " + fact);
    }

    // 6. Primeros N números impares
    @FXML
    public void handleImpares() {
        int n = Integer.parseInt(imparesInput.getText().trim());  // Cambié de imparesResult a imparesInput
        StringBuilder result = new StringBuilder();
        for (int i = 1; result.length() < n * 2; i += 2) {
            result.append(i).append(" ");
        }
        imparesResult.setText("Impares: " + result.toString());
    }

    // 7. Verificar número perfecto
    @FXML
    public void handlePerfecto() {
        int num = Integer.parseInt(perfectoInput.getText().trim());  // Cambié de perfectoResult a perfectoInput
        if (isPerfect(num)) {
            perfectoResult.setText(num + " es un número perfecto.");
        } else {
            perfectoResult.setText(num + " no es un número perfecto.");
        }
    }

    // Verifica si un número es perfecto
    private boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    // 8. Verificar números amigos
    @FXML
    public void handleAmigos() {
        int num1 = Integer.parseInt(amigosInput1.getText().trim());  // Cambié de amigosResult a amigosInput1 y amigosInput2
        int num2 = Integer.parseInt(amigosInput2.getText().trim());
        if (areAmigos(num1, num2)) {
            amigosResult.setText(num1 + " y " + num2 + " son números amigos.");
        } else {
            amigosResult.setText(num1 + " y " + num2 + " no son números amigos.");
        }
    }

    // Verifica si dos números son amigos
    private boolean areAmigos(int num1, int num2) {
        return sumDivisors(num1) == num2 && sumDivisors(num2) == num1;
    }

    private int sumDivisors(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    // 9. Elevar número N a potencia P
    @FXML
    public void handlePotencia() {
        int n = Integer.parseInt(potenciaInputN.getText().trim());  // Cambié de potenciaResult a potenciaInputN y potenciaInputP
        int p = Integer.parseInt(potenciaInputP.getText().trim());
        int result = (int) Math.pow(n, p);
        potenciaResult.setText(n + " ^ " + p + " = " + result);
    }

    // 10. Calcular e^x
    @FXML
    public void handleEx() {
        double x = Double.parseDouble(exInputX.getText().trim());  // Cambié de exResult a exInputX
        double result = Math.exp(x);
        exResult.setText("e^" + x + " = " + result);
    }
}
