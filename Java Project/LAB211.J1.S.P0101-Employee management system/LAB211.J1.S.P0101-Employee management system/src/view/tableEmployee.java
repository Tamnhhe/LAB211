package view;

import controller.SortController;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Employee;

/*
 * @author HuynhPhan
 */
public class tableEmployee extends JFrame{

    private JTable table;
    private JButton btnSortByName, btnExit;
    
    private Object[] columns = new String[]{"ID employee", "Full Name", "Phone Number", "Email", "Address", "Date of birth", "Sex", "Salary", "Agency"};
    private Object data = new Object[][]{};
    public tableEmployee() {
    }

    public JTable getTable() {
        return table;
    }
    
    public tableEmployee(ArrayList<Employee> list) {
        initComponents(list);
    }
    //    Id, First Name, Last Name, Phone, Email, Address, DOB, Sex, Salary, Agency

    private void initComponents(ArrayList<Employee> list) {
        DefaultTableModel model = new DefaultTableModel((Object[][]) data, columns);
        table = new JTable(model);
        table = new JTable(new DefaultTableModel((Object[][]) data, columns));
        table.setAutoCreateRowSorter(true);
        JScrollPane jp = new JScrollPane(table);
        btnSortByName = new JButton("Sort by Name");
        btnExit = new JButton("Exit");
        btnSortByName.setBounds(100, 400, 200, 40);
        btnExit.setBounds(750, 400, 50, 40);
        // add listener
        SortController sortControll = new SortController(this, list);
        btnSortByName.addActionListener(sortControll);
        btnExit.addActionListener(sortControll);
        //
        this.add(btnExit);
        this.add(btnSortByName);
        this.add(jp,BorderLayout.CENTER);
        this.setTitle("List Employees");
        this.setSize(900, 500);
        this.setTitle("Table employees");
        this.setLocationRelativeTo(this);
        showList(list);
    }

    public void showList(ArrayList<Employee> list) {

        int size = list.size();
        Object[][] employees = new Object[size][9];
        for (int i = 0;i<size;i++) {
            employees[i][0] = list.get(i).getId();
            employees[i][1] = list.get(i).getFirstName() +" "+ list.get(i).getLastName();
            employees[i][2] = list.get(i).getPhone();
            employees[i][3] = list.get(i).getEmail();
            employees[i][4] = list.get(i).getAddress();
            employees[i][5] = list.get(i).getBirth();
            employees[i][6] = list.get(i).getSex();
            employees[i][7] = String.format("%.1f", list.get(i).getSalary());
            employees[i][8] = list.get(i).getAgency();
        }
        table.setModel(new DefaultTableModel(employees, columns));
    }
}
