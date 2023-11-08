package com.example.storet;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javafx.beans.property.StringProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setStyle("-fx-background-color: darkgray;");
        Scene primaryScene = new Scene(root, 600, 600);
        primaryStage.setTitle("My Stage");
        Text text = new Text("This is a blue screen");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.BLACK);

        TableView<Person> tableView = new TableView<>();

        TableColumn<Person, String> nameColumn = new TableColumn<>("Name");
        TableColumn<Person, Integer> ageColumn = new TableColumn<>("Age");

        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        ageColumn.setCellValueFactory(cellData -> cellData.getValue().ageProperty().asObject());

        tableView.getColumns().add(nameColumn);
        tableView.getColumns().add(ageColumn);

        tableView.getItems().addAll(
                new Person("John", 30),
                new Person("Alice", 25),
                new Person("Bob", 35)
        );

        root.getChildren().addAll(text, tableView);

        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public StringProperty nameProperty() {
            return new SimpleStringProperty(name);
        }

        public IntegerProperty ageProperty() {
            return new SimpleIntegerProperty(age);
        }
    }
}
