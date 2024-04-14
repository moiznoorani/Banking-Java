module com.example.ssmbank {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.ssmbank to javafx.fxml;
    exports com.example.ssmbank;
    exports com.example.ssmbank.Controllers;
    exports com.example.ssmbank.Controllers.Admin;
    exports com.example.ssmbank.Controllers.Client;
    exports com.example.ssmbank.Models;
    exports com.example.ssmbank.Views;



}