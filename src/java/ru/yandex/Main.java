package ru.yandex;

import ru.yandex.manager.TaskManager;
import ru.yandex.manager.TaskManager2;
import ru.yandex.tasks.Epic;
import ru.yandex.tasks.Subtask;
import ru.yandex.tasks.Task;
import ru.yandex.tasks.TaskStatus;

public class Main {
    public static void main(String[] args) {
        /*
        Epic epic = new Epic();
        epic.setId(1);
        epic.setTitle("my epic 1");
        System.out.println(epic.getTitle());

        Subtask st = new Subtask();
        st.setId(2);

         */

        TaskManager taskManager = new TaskManager();

        Task t1 = new Task();
        t1.setTitle("Провести вебинар");
        t1.setStatus(TaskStatus.NEW);
        taskManager.createTask(t1);
        System.out.println(t1);

        Task t11 = new Task();
        t11.setId(t1.getId());
        t11.setTitle("Провести вебинар в 19:00");
        taskManager.updateTask(t11);
        System.out.println(t1);
        System.out.println(t11);

        // полиморфизм
        Object o = new Task();
        Task t = new Epic();
        Epic epicFromTask = (Epic) t;
        epicFromTask.getSubtasksIds();


        // TaskManager2
        TaskManager2 taskManager2 = new TaskManager2();
        Epic e2 = new Epic();
        taskManager2.createEpic(e2);
        //...
        Epic epic2 = (Epic) taskManager2.getById(3);

    }
}