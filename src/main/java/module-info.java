module com.arzz.ebasics.ebasics {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.arzz.ebasics.ebasics to javafx.fxml;  // Abre el paquete principal a javafx.fxml
    opens com.arzz.ebasics.ebasics.windowsControllers to javafx.fxml;  // Abre el paquete windows a javafx.fxml

    exports com.arzz.ebasics.ebasics;  // Exporta el paquete principal
    exports com.arzz.ebasics.ebasics.windowsControllers;  // Exporta el paquete windows
}
