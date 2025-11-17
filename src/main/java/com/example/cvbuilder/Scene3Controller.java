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
            nameLabel.setStyle("-fx-font-size: 50px; -fx-font-weight: bold;");
            nameLabel.setMaxWidth(Double.MAX_VALUE);
            nameLabel.setStyle(nameLabel.getStyle() + "-fx-alignment: CENTER; -fx-padding: 10; -fx-margin-top: 30;");
            Up.getChildren().add(nameLabel);

            VBox leftVBox = new VBox(30);
            leftVBox.setAlignment(Pos.CENTER_LEFT);
            leftVBox.setPadding(new Insets(10));

            VBox emailBox = new VBox(5);
            Label email = new Label("E-mail");
            email.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-underline: true;");
            Label emailLabel = new Label(c.getEmail());
            emailLabel.setStyle("-fx-font-size: 18px;");
            emailBox.getChildren().addAll(email, emailLabel);


            VBox phoneBox = new VBox(5);
            Label phone = new Label("Phone");
            phone.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-underline: true;");
            Label phoneLabel = new Label(c.getPhone());
            phoneLabel.setStyle("-fx-font-size: 18px;");
            phoneBox.getChildren().addAll(phone, phoneLabel);

            VBox addressBox = new VBox(5);
            Label address = new Label("Address");
            address.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-underline: true;");
            Label addressLabel = new Label(c.getAddress());
            addressLabel.setStyle("-fx-font-size: 18px;");
            addressBox.getChildren().addAll(address, addressLabel);

            leftVBox.getChildren().addAll(emailBox, phoneBox, addressBox);
            Left.getChildren().add(leftVBox);

            VBox rightVBox = new VBox(30);
            rightVBox.setAlignment(Pos.CENTER_LEFT);
            rightVBox.setPadding(new Insets(10));

            VBox skillVBox = new VBox(5);
            Label skill = new Label("Skill");
            skill.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-underline: true;");
            Label skillLabel = new Label(c.getSkill());
            skillLabel.setStyle("-fx-font-size: 18px;");
            skillVBox.getChildren().addAll(skill, skillLabel);

            VBox educationVBox = new VBox(5);
            Label education = new Label("Education");
            education.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-underline: true;");
            Label educationLabel = new Label(c.getEducation());
            educationLabel.setStyle("-fx-font-size: 18px;");
            educationVBox.getChildren().addAll(education, educationLabel);

            VBox experienceVBox = new VBox(5);
            Label experience = new Label("Experience");
            experience.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-underline: true;");
            Label WorkLabel = new Label(c.getWork());
            WorkLabel.setStyle("-fx-font-size: 18px;");
            experienceVBox.getChildren().addAll(experience, WorkLabel);

            VBox projectVBox = new VBox(5);
            Label project = new Label("Project");
            project.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-underline: true;");
            Label ProjectLabel= new Label(c.getProject());
            ProjectLabel.setStyle("-fx-font-size: 18px;");
            projectVBox.getChildren().addAll(project, ProjectLabel);

            rightVBox.getChildren().addAll(skillVBox, educationVBox, experienceVBox, projectVBox);
            Right.getChildren().add(rightVBox);
        }
    }
}
