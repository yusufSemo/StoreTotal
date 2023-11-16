package com.example.storet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.text.SimpleDateFormat;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.util.ResourceBundle;

public class Controls implements Initializable {
    @FXML
    private Button SubmitB;
    @FXML
    private TextField inputCard;

    @FXML
    private TextField inputCash;

    @FXML
    private TextField inputDate;

    @FXML
    private TextField inputOnline;

    @FXML
    private TextField inputWD;
    @FXML
    private TableView<DayTotal> myTable;
    @FXML
    private TableColumn<DayTotal,Float> card;

    @FXML
    private TableColumn<DayTotal,String> weekDay;
    @FXML
    private TableColumn<DayTotal,theDate> date;


    @FXML
    private TableColumn<DayTotal,Float> cash;

    @FXML
    private TableColumn<DayTotal,Float> online;

    @FXML
    private TableColumn<DayTotal,Float> total;

    ObservableList<DayTotal> list = FXCollections.observableArrayList(
            new DayTotal(new theDate(11, 11, 2023), 230, 34, 34),
            new DayTotal(new theDate(3, 1, 2023), 25, 40, 20),
            new DayTotal(new theDate(11, 15, 2023), 25, 40, 20)
    );
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cash.setCellValueFactory(new PropertyValueFactory<>("Cash"));
        date.setCellValueFactory(new PropertyValueFactory<>("Date"));
        weekDay.setCellValueFactory(new PropertyValueFactory<>("weekDay"));
        online.setCellValueFactory(new PropertyValueFactory<>("Online"));
        card.setCellValueFactory(new PropertyValueFactory<>("Card"));
        total.setCellValueFactory(new PropertyValueFactory<>("Total"));
        myTable.setItems(list);
    }

}