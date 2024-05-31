module edu.cue.proyectofinal.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.media;
    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;


    opens edu.cue.proyectofinal to javafx.fxml;
    exports edu.cue.proyectofinal;
}

