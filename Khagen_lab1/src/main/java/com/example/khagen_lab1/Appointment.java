package com.example.khagen_lab1;

import javafx.scene.control.TableColumn;

public class Appointment {
    private TableColumn<Appointment, Integer> id;
    private String Name;
    private String College;
    private TableColumn<Appointment, Integer> Room;
    public Appointment(TableColumn<Appointment, Integer> id, TableColumn<Appointment, String> Name, TableColumn<Appointment, String> College , TableColumn<Appointment, Integer> Room) {
        this.id = id;
        this.Name = String.valueOf(Name);
        this.College = String.valueOf(College);
        this.Room = Room;
    }
    public TableColumn<Appointment, Integer> getId() {
        return id;
    }
    public String getName() {
        return Name;
    }
    public String getDoctor() {
        return College;
    }
    public TableColumn<Appointment, Integer> getRoom() {
        return Room;
    }
}
