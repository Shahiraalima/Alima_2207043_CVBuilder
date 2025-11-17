package com.example.cvbuilder;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class Scene3Controller {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private VBox Up;
    @FXML
    private VBox Left;
    @FXML
    private VBox Right;

    public void loadData(ObservableList<CVdetails> list){
//        Up.setStyle("-fx-background-color: grey;");
        for(CVdetails c : list){
            Label nameLabel = new Label(c.getName());
            nameLabel.setStyle("-fx-font-size: 30px; -fx-font-weight: bold;");
            nameLabel.setMaxWidth(Double.MAX_VALUE);
            nameLabel.setStyle(nameLabel.getStyle() + "-fx-alignment: CENTER; -fx-padding: 10; -fx-margin-top: 30;");
            Up.getChildren().add(nameLabel);

            VBox leftVBox = new VBox(100);
            leftVBox.setAlignment(Pos.CENTER_LEFT);
            leftVBox.setPadding(new Insets(10));

            Label emailLabel = new Label("E-mail: \n" + c.getEmail());
            Label phoneLabel = new Label("Phone No: \n" + c.getPhone());
            Label addressLabel = new Label("Address: \n" + c.getAddress());

            leftVBox.getChildren().addAll(emailLabel, phoneLabel, addressLabel);
            Left.getChildren().add(leftVBox);

            VBox rightVBox = new VBox(100);
            rightVBox.setAlignment(Pos.CENTER_LEFT);
            rightVBox.setPadding(new Insets(10));

            Label skillLabel = new Label("Skills: \n" + c.getSkill());
            Label Education = new Label("Educational Qualifications: \n" + c.getEducation());
            Label WorkLabel = new Label("Work Experience: \n" + c.getWork());
            Label ProjectLabel= new Label("Projects: \n" + c.getProject());

            rightVBox.getChildren().addAll(skillLabel, Education, WorkLabel, ProjectLabel);
            Right.getChildren().add(rightVBox);
        }
    }
}
