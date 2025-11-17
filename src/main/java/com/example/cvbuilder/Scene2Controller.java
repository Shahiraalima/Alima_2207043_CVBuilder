package com.example.cvbuilder;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene2Controller {
    private Stage stage;
    private Scene scene;

    @FXML
    TextField name;
    @FXML
    TextField email;
    @FXML
    TextField phone;
    @FXML
    TextField address;
    @FXML
    TextField Education;
    @FXML
    TextField skill;
    @FXML
    TextField work;
    @FXML
    TextField projects;

    private ObservableList<CVdetails> list;
    public void initialize(){
        list = FXCollections.observableArrayList();
    }

    @FXML
    void switchToScene3(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene3.fxml"));
        Parent root = (Parent) loader.load();

        Scene3Controller controller = loader.getController();
        controller.loadData(cvdetails);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Create New CV");
        stage.setScene(scene);
        stage.show();
    }






}
