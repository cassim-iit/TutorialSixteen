module com.iit.tutorials.tutorialsixteen {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.iit.tutorials.tutorialsixteen to javafx.fxml;
    exports com.iit.tutorials.tutorialsixteen;
}