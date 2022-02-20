package com.example.task15;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.Collection;
import java.util.Random;

public class HelloController {
    private ObservableList<Nums> RandomNumsTable = FXCollections.observableArrayList();

    @FXML
    private TableView<Nums> tableNums;

    @FXML
    private TableColumn<Nums, Double> tableColumn1;

    @FXML
    private TableColumn<Nums, Double> tableColumn2;

    @FXML
    private Button randomNumsBtn;

    @FXML
    private Button btnExit;

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private Label errorLabel;

    public void Exit(ActionEvent actionEvent){
        System.exit(0);
    }

    @FXML
    private void SetRandomNums(ActionEvent actionEvent){
        initData();

        tableColumn1.setCellValueFactory(new PropertyValueFactory("tableColumn1"));

        tableNums.setItems(RandomNumsTable);
    }

    private void initData() {
        Random r = new Random();
        RandomNumsTable.add(new Nums(Math.random(), 0));
        RandomNumsTable.add(new Nums(Math.random(), 0));
        RandomNumsTable.add(new Nums(Math.random(), 0));
        RandomNumsTable.add(new Nums(Math.random(), 0));
        RandomNumsTable.add(new Nums(Math.random(), 0));
        RandomNumsTable.add(new Nums(Math.random(), 0));
        RandomNumsTable.add(new Nums(Math.random(), 0));
        RandomNumsTable.add(new Nums(Math.random(), 0));
        RandomNumsTable.add(new Nums(Math.random(), 0));
        RandomNumsTable.add(new Nums(Math.random(), 0));
    }

    public void ComputeTask(ActionEvent actionEvent){
        if(RandomNumsTable.size() != 0) {
            if(isNumeric(textField1.getText()) == true && isNumeric(textField2.getText()) == true) {
                double a = Double.parseDouble(textField1.getText());
                double b = Double.parseDouble(textField2.getText());
                int factI = 1;
                    for (int i = 0; i < 10; i++){
                        double y = Math.pow(Math.pow((a * a + b * b) , 3) *
                                Math.cos(Double.valueOf(tableColumn1.getCellData(i).toString()), 1 / 3);
                    }
                tableNums.setItems(RandomNumsTable);
                tableNums.refresh();
            }
            else errorLabel.setText("a и b должны быть числами!");

        }
        else errorLabel.setText("Заполните таблицу числами");
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void Clear(ActionEvent actionEvent){
        tableNums.getItems().clear();
        textField1.setText("");
        textField2.setText("");
    }
}