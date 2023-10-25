package Object;

/**
 * Class representing a Task.
 *
 * @author Tamnhhe173108
 * Class SE1811
 * Subject J1.S.P0071
 * Version 1.0
 */
public class Task {
    
    /**
     * Auto increasing id
     */
    private static int IDlasttask = 1;
    
    /**
     * The ID of the task
     */
    private int id;
    
    /**
     * The type of the task
     */   
    private int taskType;
    
    /**
     * The name of the task
     */  
    private String name;
    
    /**
     * The date of the task
     */
    private String date;
    
    /**
     * The start time of the task
     */
    private double from;
    
    /**
     * The end time of the task
     */
    private double to;
    
    /**
     * The assignee of the task
     */
    private String assignee;
    
    /**
     * The reviewer of the task
     */
    private String reviewer;
    
    public Task(int taskType, String name, String date, double from, double to, String assignee, String reviewer) {
        this.id = IDlasttask++;
        this.taskType = taskType;
        this.name = name;
        this.date = date;
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public Task() {
        id = IDlasttask++;
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

    @Override
    public String toString() {
        return String.format("%-3s %-15s %-15s %-15s %-15s %-15s %-15s %-15s ", id, name, getTaskTypeString(), date, from, to, assignee, reviewer);

    }

}
