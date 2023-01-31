package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.HashMap;

public class Epic extends Task {

    private ArrayList<Integer> subtasksIds;

    public ArrayList<Integer> getSubtasksIds() {
        return subtasksIds;
    }

    public void setSubtasksIds(ArrayList<Integer> subtasksIds) {
        this.subtasksIds = subtasksIds;
    }
}
