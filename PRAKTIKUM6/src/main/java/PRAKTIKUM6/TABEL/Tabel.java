package PRAKTIKUM6.TABEL;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {

        javafx.scene.control.TableView<Data> tableView = new javafx.scene.control.TableView<>();

        TableColumn<Data, String> column1 =
                new TableColumn<>("NIM");

        column1.setCellValueFactory(
                new PropertyValueFactory<>("NIM"));

        TableColumn<Data, String> column2 =
                new TableColumn<>("Nama");

        column2.setCellValueFactory(
                new PropertyValueFactory<>("Nama"));

        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);

        tableView.getItems().add(
                new Data("2110817230003", "Arif Budiman Nugraha"));

        tableView.getItems().add(
                new Data("2110817220002", "Prameswari Ayu Kusuma"));

        tableView.getItems().add(
                new Data("2110817210001", "Cahyadi Wijaya"));

        tableView.getItems().add(
                new Data("2210817230006", "Dewi Ayu Handayani"));

        tableView.getItems().add(
                new Data("2310817220005", "Pratama Budi"));

        tableView.getItems().add(
                new Data("2110817210004", "Sari Fitriani"));

        tableView.getItems().add(
                new Data("2210817230009", "Wardhana Wisnu"));

        tableView.getItems().add(
                new Data("2310817220008", "Sari Kartika"));

        tableView.getItems().add(
                new Data("2110817210007", "Santoso Prastoso"));

        tableView.getItems().add(
                new Data("2210817230010", "Susanti Dewi"));


        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
