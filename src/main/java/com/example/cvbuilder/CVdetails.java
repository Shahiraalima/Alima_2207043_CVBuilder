package com.example.cvbuilder;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CVdetails {
    private final StringProperty name;
    private final StringProperty email;
    private final StringProperty phone;
    private final StringProperty address;
    private final StringProperty education;
    private final StringProperty skill;
    private final StringProperty work;
    private final StringProperty project;

    public CVdetails(String name, String email, String phone, String address, String education, String skill, String work, String project) {
        this.name = new SimpleStringProperty(name);
        this.email = new SimpleStringProperty(email);
        this.phone = new SimpleStringProperty(phone);
        this.address = new SimpleStringProperty(address);
        this.education = new SimpleStringProperty(education);
        this.skill = new SimpleStringProperty(skill);
        this.work = new SimpleStringProperty(work);
        this.project = new SimpleStringProperty(project);
    }

    public String getName() {
        return name.get();
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty emailProperty() {
        return email;
    }

    public String getPhone() {
        return phone.get();
    }

    public StringProperty phoneProperty() {
        return phone;
    }

    public String getAddress() {
        return address.get();
    }

    public StringProperty addressProperty() {
        return address;
    }

    public String getEducation() {
        return education.get();
    }

    public StringProperty educationProperty() {
        return education;
    }

    public String getSkill() {
        return skill.get();
    }

    public StringProperty skillProperty() {
        return skill;
    }

    public String getWork() {
        return work.get();
    }

    public StringProperty workProperty() {
        return work;
    }

    public String getProject() {
        return project.get();
    }

    public StringProperty projectProperty() {
        return project;
    }

}
