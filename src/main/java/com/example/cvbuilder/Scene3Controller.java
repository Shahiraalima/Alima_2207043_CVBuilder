package com.example.cvbuilder;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
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
        for(CVdetails c : list){
            Up.getChildren().add(new Label(c.getName()));
            VBox leftVBox = new VBox(3);
            leftVBox.getChildren().addAll(new Label("E-mail: \n" + c.getEmail()),
                    new Label("Phone No: \n" + c.getEmail()),
                    new Label("Address: \n" + c.getAddress()));
            Left.getChildren().add(leftVBox);

            VBox rightVBox = new VBox(3);
            rightVBox.getChildren().addAll(new Label("Educational Qualifications: \n" + c.getSkill()),
                new Label("Skills: \n" + c.getSkill()),
                new Label("Work Experiences: \n" + c.getWork()),
                new Label("Projects: \n" + c.getProject()));
            Right.getChildren().add(rightVBox);
        }
    }


}
