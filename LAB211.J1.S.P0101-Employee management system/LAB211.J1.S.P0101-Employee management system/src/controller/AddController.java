package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Employee;
import view.addView;

/*
 * @author HuynhPhan
 */
public class AddController implements ActionListener {

    private addView addView;
    private ManagementEmployees me;

    public AddController(addView addView, ManagementEmployees me) {
        this.addView = addView;
        this.me = me;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String titleButton = e.getActionCommand();
        if (titleButton.equals("ADD")) {
            Employee employee = this.addView.getInfoEmployee(me.getList());
            if (employee != null) {
                me.add(employee);
                addView.showMessage("Add Successful");
                this.addView.clear();
            }
        } else if (titleButton.equals("Clear")) {
            this.addView.clear();
            
        } else if (titleButton.equals("Exit")) {
            this.addView.dispose();
        }
    }

}
