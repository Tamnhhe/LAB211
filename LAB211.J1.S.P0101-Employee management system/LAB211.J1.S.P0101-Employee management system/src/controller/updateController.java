package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Employee;
import view.updateView;

/*
 * @author HuynhPhan
 */
public class updateController implements ActionListener {

    private updateView updateView;
    private Employee employee;
    private ArrayList<Employee> list;

    public updateController(updateView updateView, Employee eOld, ArrayList<Employee> list) {
        this.updateView = updateView;
        this.employee = eOld;
        this.list = list;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btnName = e.getActionCommand();
        if (btnName.equals("Exit")) {
            this.updateView.dispose();
        } else if (btnName.equals("Clear")) {
            this.updateView.clear();
        } else if (btnName.equals("Update")) {
            ManagementEmployees me = new ManagementEmployees(list);
            Employee eNew = this.updateView.getInfoEmployee(list);
            if (eNew != null) {
                me.update(employee, eNew);
                 this.updateView.dispose();
                this.updateView.showMessage("Update Success!");
            } else {
                this.updateView.showMessage("Update failed!");
            }
        }
    }

}
