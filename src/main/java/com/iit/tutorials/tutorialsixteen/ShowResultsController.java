package com.iit.tutorials.tutorialsixteen;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ShowResultsController {
    @FXML
    TextArea txtOutput;
    @FXML
    TextField txtInput;

    @FXML
    public void displayFibinocci() {
        LabSheetSixteen  lab = new LabSheetSixteen();
        String result = lab.fibinociiSeries(5);
        this.txtOutput.setText(result);

    }

    @FXML
    public void displayGrade() {
        LabSheetSixteen  lab = new LabSheetSixteen();
        int mark = Integer.parseInt(this.txtInput.getText());
        String result = lab.calculateGrade(mark);
        this.txtOutput.setText(result);
    }
}
