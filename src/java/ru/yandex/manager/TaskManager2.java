package ru.yandex.manager;

import java.util.HashMap;

import ru.yandex.tasks.Epic;
import ru.yandex.tasks.Subtask;
import ru.yandex.tasks.Task;

public class TaskManager2 {
    private HashMap<Integer, Task> tasksById = new HashMap<>();

    private int nextId = 1;

    /*
    public int getNextId() {
        return nextId++;
    }
     */



    public Task getById(int id) {
        return tasksById.get(id);
    }

    public void update(Task task) {
        tasksById.put(task.getId(), task);
        if (task.getClass() == Task.class) {
            // todo
        }
        if (task instanceof Subtask) {
            Subtask st = (Subtask) task;
            // todo
        }
        // todo
    }


    // ====

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

    public Epic getEpicById(int id) {
        return (Epic) tasksById.get(id);
    }

    public void createEpic(Epic epic) {
        epic.setId(nextId++);
        tasksById.put(epic.getId(), epic);
        // todo
    }

    public void updateEpic(Epic epic) {

        // todo
    }

    private void updateEpicStatus(Epic epic) {
        // todo
    }
}
