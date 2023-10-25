
package view;

import controller.ManagementEmployees;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Employee;

/*
 * @author HuynhPhan
 */
public class searchByIdView extends JFrame implements ActionListener{
    private JButton search, exit;
    private JLabel titleUp,idLabel;
    private JTextField idField;
    public searchByIdView(String title, ArrayList<Employee> list,String opt) {
        initComponents(title,list,opt);
    }

    public searchByIdView()  {
    }
    
    private void initComponents(String title,ArrayList<Employee> list,String opt){
        Font font = new Font("Time News Romans", Font.BOLD, 16);
        ImageIcon searchIcon = new ImageIcon(getClass().getResource("/image/Search.png"));
        titleUp = new JLabel(title,searchIcon,JLabel.LEFT);
        titleUp.setFont(font);
        if(title == "Search Employee"){
            idLabel = new JLabel("Enter name");
        }else {
            idLabel = new JLabel("Enter ID");
        }
        idField = new JTextField();
        search = new JButton(opt);
        exit = new JButton("Exit");
                
        titleUp.setBounds(110, 30,200, 40);
        idLabel.setBounds(30, 100,100, 40);
        idField.setBounds(100, 100,200, 40);
        search.setBounds(140, 160,100, 40);
        exit.setBounds(300, 200,50, 30);
        exit.addActionListener(this);
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(list.isEmpty()){
                    showMessage("List employees is empty");
                    return;
                }
                ManagementEmployees mn = new ManagementEmployees(list);
                if(title.equals("Search Employee")){
                     ArrayList<Employee> listSearch = mn.listSearchByName(idField.getText().trim());
                    if(listSearch != null){
                       new tableEmployee(listSearch).setVisible(true);
                    } 
                    else{
                        new searchByIdView().showMessage("Name not in List Employees");
                    }
                }
                    
                else{
                   Employee employee = mn.searchEmployee(idField.getText().trim());
                    if(employee == null){
                        showMessage("Employee ID not exist!");
                        return ;
                    }
                    else{
                        if(title.equals("Delete Employee")){
                           new deleteView(employee,list).setVisible(true);
                            }
                        else if(title.equals("Update Employee")){
                           new updateView(employee,list).setVisible(true);
                       } 
                    }
                }
            }
        });
         
        //
        
        this.add(titleUp);this.add(idField);this.add(idLabel);this.add(search);this.add(exit);
        this.setTitle(title);
        this.setSize(400,300);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
    }

     public void showMessage(String message){
        JOptionPane.showMessageDialog(this, message);
    }
//     public static void main(String[] args) {
//         ArrayList<Employee> list = new ArrayList<>();
//        new searchByIdView("Update employee", list,"Search").setVisible(true);
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exit){
           this.dispose();
        }
    }
}
