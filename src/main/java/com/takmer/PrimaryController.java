package com.takmer;

import java.text.NumberFormat;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PrimaryController {

    @FXML
    private TextField investmentField;
    @FXML
    private TextField interestRateField;
    @FXML
    private TextField yearsField;
    @FXML
    private TextField futureValueField;

    @FXML
    private void calculateButtonClicked() {
        double investment
            = Double.parseDouble(investmentField.getText());
        double rate
            = Double.parseDouble(interestRateField.getText());
        int years
            = Integer.parseInt(yearsField.getText());
        double futureValue
            = FinancialCalculations.calculateFutureValue(
            investment, rate, years);

        NumberFormat currency
            = NumberFormat.getCurrencyInstance();
        futureValueField.setText(
            currency.format(futureValue));
    }

    @FXML
    private void exitButtonClicked() {
        // 0 indicates a normal exit
        System.exit(0);
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
