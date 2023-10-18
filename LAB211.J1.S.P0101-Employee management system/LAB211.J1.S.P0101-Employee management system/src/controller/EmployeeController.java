package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Employee;
import view.addView;
import view.menuView;
import view.searchByIdView;
import view.tableEmployee;

/*
 * @author HuynhPhan
 */
public class EmployeeController implements ActionListener {

    private menuView viewMenu;
    ManagementEmployees me = new ManagementEmployees();
    private ArrayList<Employee> list = me.getList();

    public EmployeeController() {
    }

    public EmployeeController(menuView viewMenu) {
        this.viewMenu = viewMenu;
    }

// Listener Menu
    @Override
    public void actionPerformed(ActionEvent e) {
        String OriginListener = e.getActionCommand();

        if (OriginListener.equals("Add employees")) {
            new addView(me).setVisible(true);

        } else if (OriginListener.equals("Exit")) {
            this.viewMenu.dispose();
        } else {
            if (list.isEmpty()) {
                this.viewMenu.showMessage("List employees is empty");
                return;
            } else {
                if (OriginListener.equals("Search employees")) {
                    new searchByIdView("Search Employee", list, "Search").setVisible(true);

                } else if (OriginListener.equals("Update employees")) {
                    new searchByIdView("Update Employee", list, "Search").setVisible(true);

                } else if (OriginListener.equals("Remove employees")) {
                    new searchByIdView("Delete Employee", list, "Delete").setVisible(true);

                } else if (OriginListener.equals("Sort by salary")) {
                    me.sortEmployeeBySalary();
                    new tableEmployee(list).setVisible(true);

                } else if (OriginListener.equals("Export")) {
                    me.exportFile(list);
                    this.viewMenu.showMessage("Export file successful!");
                }
            }
        }
    }
}
