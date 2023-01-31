package ru.yandex.manager;

import java.util.HashMap;

import ru.yandex.tasks.Epic;
import ru.yandex.tasks.Subtask;
import ru.yandex.tasks.Task;

public class TaskManager {
    private HashMap<Integer, Task> tasksById = new HashMap<>();
    private HashMap<Integer, Epic> epicsById = new HashMap<>();
    private HashMap<Integer, Subtask> subtasksById = new HashMap<>();

    private int nextId = 1;

    /*
    public int getNextId() {
        return nextId++;
    }
     */

    public Task getTaskById(int id) {
        return tasksById.get(id);
    }

    public void createTask(Task task) {
        task.setId(nextId++);
        //task.setId(nextId);
        //nextId = nextId + 1;
        // todo
    }

    public void updateTask(Task task) {
        tasksById.put(task.getId(), task);
        // todo
    }


    // Epic, Subtask

    public void createEpic(Epic task) {
        // todo
    }

    public void updateEpic(Epic epic) {

        // todo
    }

    private void updateEpicStatus(Epic epic) {
        // todo
    }
}
