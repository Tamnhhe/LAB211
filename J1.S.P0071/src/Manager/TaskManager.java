package Manager;

import GUI.Unity;
import Object.Task;
import Resource.Message;
import java.util.ArrayList;

/**
 * Class for managing tasks (TaskManager) that handles tasks related operations.
 *
 * @author Tamnhhe1713108. 
 * Class SE1811. 
 * Subject J1.S.P0071. 
 * Version 1.0
 */
public class TaskManager {

    Unity input = new Unity();
    ArrayList<Task> listTask = new ArrayList<>();

    /**
     * Checks if any task overlaps in terms of date, assignee, and time range.
     *
     * @param date The date of the task
     * @param assignee The assignee of the task
     * @param from The start time
     * @param to The end time
     * @return true if there is an overlap, false otherwise.
     */
    public boolean checkDuplicate(String date, String assignee, double from, double to) {

        for (Task task : listTask) {
            if (task.getDate().compareTo(date) == 0 && (task.getAssignee().compareTo(assignee) == 0)) {
                if (from < task.getFrom() && to > task.getFrom()) {
                    return true;
                }
                if (from == task.getFrom()) {
                    return true;
                }
                if (from > task.getFrom() && from < task.getTo()) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Takes user input for task information and adds it to the list.
     */
    public void inputTask() {
        String requirementName, date, assignee, reviewer;
        int taskType;
        double from, to;
        requirementName = input.getRequirementNameInput();
        taskType = input.getTaskTypeInput();
        date = input.getDate();
        from = input.getFromInput();
        to = input.getToInput(from);
        assignee = input.getAssigneeInput();
        reviewer = input.getReviewerInput();
        // Check for overlap
        if (checkDuplicate(date, assignee, from, to)) {
            System.out.println(Message.OVERLAPS);
        } else {
            Task task = new Task(taskType, requirementName, date, from, to, assignee, reviewer);
            listTask.add(task);
        }
    }

    /**
     * Deletes a task based on the entered ID.
     */
    public void deleteTask() {
        int id = input.getInt(Message.INPUT_ID, Message.WRONG, Message.WRONG, Message.WRONG, Integer.MIN_VALUE, Integer.MAX_VALUE);
        Task task = searchTaskById(id);
        if (task == null) {
            System.out.println(Message.NOT_FOUND);
            System.out.println(Message.DELETE_FAILED);
        } else {
            listTask.remove(task);
        }
    }

    /**
     * Displays the information of all tasks in the list.
     */
    public void displayTask() {
        for (Task task : listTask) {
            System.out.println(task);
        }
    }

    /**
     * Searches for a task by ID.
     *
     * @param id The ID of the task to be found
     * @return Task object or null if not found
     */
    private Task searchTaskById(int id) {
        for (Task task : listTask) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    /**
     * Adds sample data to the list of tasks.
     */
    public void tempData() {
        listTask.add(new Task(1, "Nguyen Huy Tam", "25-11-2023", 8.5, 17, "Dev", "Lead"));
        listTask.add(new Task(3, "Nguyen Viet Nam", "25-12-2023", 0, 0, "Web", "Dev"));
        listTask.add(new Task(4, "Nguyen Duc Anh", "21-11-2023", 0, 0, "Design", "Web"));
        listTask.add(new Task(2, "Nguyen Duc Hung", "05-11-2023", 0, 0, "BA", "Dev"));
    }
}
