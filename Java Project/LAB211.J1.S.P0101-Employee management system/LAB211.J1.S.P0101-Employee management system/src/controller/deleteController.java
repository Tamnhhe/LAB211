
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Employee;
import view.deleteView;

/*
 * @author HuynhPhan
 */
public class deleteController implements ActionListener{
    private deleteView deleteView;
    private Employee employee;
    private ArrayList<Employee> list;
    public deleteController() {
    }

    public deleteController(deleteView deleteView, Employee employee, ArrayList<Employee> list) {
        this.deleteView = deleteView;
        this.employee = employee;
        this.list = list;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
         String buttonName = e.getActionCommand();
         if(buttonName.equals("Exit")){
             this.deleteView.dispose();
         } else if(buttonName.equals("Delete")){
             int result = JOptionPane.showConfirmDialog(null, "Are you sure remove?", "Confirm remove", JOptionPane.YES_NO_OPTION);
             if(result == JOptionPane.YES_OPTION){
                 ManagementEmployees me = new ManagementEmployees(list);
                    me.deleteEmployee(employee);
                    this.deleteView.dispose();
                    JOptionPane.showMessageDialog(null,"Remove Successful");
             }else {
                 return;
             }
            
         }
    }
    
    
}
