/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author Tamnhhe
 */
public class Task {
    private static int auto_Increment = 1;
    private int id;
    private int taskType;
    private String name,date;
    private double from,to;
    private String assignee, reviewer;

   

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
    
    public String getTaskTypeString(){
        String result = null;
        switch(taskType){
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
        return String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s ",id,name,getTaskTypeString(),date,from,to,assignee,reviewer);
    
    }
    
    


    
}
