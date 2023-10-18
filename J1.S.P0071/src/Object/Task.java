
package Object;

import Resource.Message;

/**
 * Class representing a Task.
 * @author Tamnhhe1713108
 * Class SE1811
 * Subject J1.S.P0071
 * Version 1.0
 */
public class Task {

    private static int auto_Increment = 1;
    private int id;
    private int taskType;
    private String name, date;
    private double from, to;
    private String assignee, reviewer;

    /**
     * Constructs a Task object with specified attributes.
     *
     * @param taskType The type of the task
     * @param name The name of the task
     * @param date The date of the task
     * @param from The start time of the task
     * @param to The end time of the task
     * @param assignee The person assigned to the task
     * @param reviewer The person responsible for reviewing the task
     */
    public Task(int taskType, String name, String date, double from, double to, String assignee, String reviewer) {
        this.id = auto_Increment++;
        this.taskType = taskType;
        this.name = name;
        this.date = date;
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public Task() {
        id = auto_Increment++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTaskType() {
        return taskType;
    }

    public void setTaskType(int taskType) {
        this.taskType = taskType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    /**
     * Gets the string representation of task type.
     *
     * @return A string representing the task type
     */
    public String getTaskTypeString() {
        String result = null;
        switch (taskType) {
            case 1:
                result = "Code";
                break;
            case 2:
                result = "Test";
                break;
            case 3:
                result = "Design";
                break;
            case 4:
                result = "Review";
                break;
        }
        return result;
    }

    /**
     * Returns a formatted string representation of the Task.
     *
     * @return A formatted string containing task details
     */
    @Override
    public String toString() {
        return String.format("%-3s %-15s %-10s %-10s %-10s %-10s %-10s %-10s ", id, name, getTaskTypeString(), date, from, to, assignee, reviewer);

    }

}
