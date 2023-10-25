
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Employee;
import view.tableEmployee;

/*
 * @author HuynhPhan
 */
public class SortController implements ActionListener{
    private tableEmployee tableEmployee1;
    private ArrayList<Employee> list;

    public SortController(tableEmployee tableEmployee1, ArrayList<Employee> list) {
        this.tableEmployee1 = tableEmployee1;
        this.list = list;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String btnName = e.getActionCommand();
        if(btnName == "Sort by Name"){
            ManagementEmployees me = new ManagementEmployees(list);
            me.sortEmployeeByName();
            this.tableEmployee1.showList(list);
        }
        else{
            this.tableEmployee1.dispose();
        }
    }
    
}
