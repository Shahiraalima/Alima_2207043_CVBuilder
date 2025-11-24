package com.example.cvbuilder;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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

    private final userDAO userDAO = new userDAO();
    private int currentUserID ;
    @FXML

    private ObservableList<CVdetails> list;
    public void initialize(){
        list = FXCollections.observableArrayList();
    }

    @FXML
    void switchToScene3(ActionEvent event) throws IOException {
        if(isEmpty(name, "Name")) return;
        if(isEmpty(email, "E-mail")) return;
        if(isEmpty(phone, "Phone")) return;
        if(isEmpty(address, "Address")) return;
        if(isEmpty(Education, "Educational Qualifications")) return;
        if(isEmpty(skill, "Skills")) return;
        if(isEmpty(work, "Work")) return;
        if(isEmpty(projects, "Projects")) return;


        CVdetails cv = new CVdetails(name.getText(), email.getText(), phone.getText(), address.getText(),  Education.getText(), skill.getText(), work.getText(), projects.getText());
        list.add(cv);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene3.fxml"));
        Parent root = (Parent) loader.load();

        Scene3Controller controller = loader.getController();
        controller.loadData(list);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Create New CV");
        stage.setScene(scene);
        stage.show();
    }

    private boolean isEmpty(TextField tf, String fieldName){
        if(tf.getText().trim().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Warning");
            alert.setHeaderText("Required field missing!");
            alert.setContentText(fieldName);
            alert.showAndWait();
            return true;
        }
        return false;
    }
}
