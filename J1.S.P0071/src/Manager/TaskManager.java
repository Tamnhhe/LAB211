/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Manager;

import GUI.Unity;
import Object.Task;
import Resource.Message;
import java.util.ArrayList;
/**
 *
 * @author Tamnhhe
 */
public class TaskManager {
    Unity input = new Unity();
    ArrayList<Task> listTask =  new ArrayList<>();
    // Function to check all atribute Overlaps
    public boolean checkDuplicate(String date, String assignee, double from, double to){
        
        for (Task task : listTask)
    }
    public void inputTask(){
        String requirementName, date, assignee, reviewer;
        int taskType;
        double from,to;
        requirementName = input.getRequirementNameInput();
        taskType = input.getTaskTypeInput();
        date = input.getDate();
        from = input.getFromInput();
        to = input.getToInput(from);
        assignee = input.getAssigneeInput();
        reviewer = input.getReviewerInput();
        //Check Duplicate
        if(checkD)
    }
    
}
