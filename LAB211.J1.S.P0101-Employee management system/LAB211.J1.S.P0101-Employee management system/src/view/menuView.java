
package view;

import controller.EmployeeController;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import model.Employee;

/*
 * @author HuynhPhan
 */
public class menuView extends JFrame{

    private JButton addBtn, updateBtn,removeBtn,searchBtn,sortBtn,exitBtn,exportBtn;
    private JLabel title;
    
    public JButton getAddBtn() {
        return addBtn;
    }
    public menuView(ArrayList<Employee>list) {
        initComponents(list);
    }


    
    private void initComponents(ArrayList<Employee>list){
        // Khoi tao nut button
        Font font = new Font("Time News Romans", Font.BOLD, 18);
        title = new JLabel("Employee management system");
        title.setBounds(125, 20, 400, 40);
        title.setFont(font);
        
        ImageIcon image = new ImageIcon(getClass().getResource("/image/nen.jpg"));
        JLabel background = new JLabel("",image,JLabel.CENTER);
        background.setVerticalAlignment(SwingConstants.BOTTOM);
        setContentPane(background);
        addBtn = new JButton("Add employees");
        updateBtn = new JButton("Update employees");
        removeBtn = new JButton("Remove employees");
        searchBtn = new JButton("Search employees");
        sortBtn = new JButton("Sort by salary");
        exitBtn = new JButton("Exit");
        exportBtn = new JButton("Export");
        //tao kich thuoc cho button
        addBtn.setBounds(60, 80, 150, 40);
        updateBtn.setBounds(330, 80, 150, 40);
        removeBtn.setBounds(60, 160, 150, 40);
        searchBtn.setBounds(330, 160, 150, 40);
        sortBtn.setBounds(60, 240, 150, 40);
        exitBtn.setBounds(450, 320, 70, 30);
        exportBtn.setBounds(330, 240, 150, 40);
        //
            Cursor handCursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
            addBtn.setCursor(handCursor);
            updateBtn.setCursor(handCursor);
            removeBtn.setCursor(handCursor);
            searchBtn.setCursor(handCursor);
            sortBtn.setCursor(handCursor);
            exitBtn.setCursor(handCursor);
            exportBtn.setCursor(handCursor);
        //
        EmployeeController listener = new EmployeeController(this);
        addBtn.addActionListener(listener);
        searchBtn.addActionListener(listener);
        updateBtn.addActionListener(listener);
        removeBtn.addActionListener(listener);
        sortBtn.addActionListener(listener);
        exitBtn.addActionListener(listener);
        exportBtn.addActionListener(listener);
        //
        ImageIcon menuIcon = new ImageIcon(getClass().getResource("/image/menu.png"));
        this.setIconImage(menuIcon.getImage());
        this.add(title);
        this.add(addBtn);this.add(updateBtn);this.add(removeBtn);this.add(searchBtn);
        this.add(sortBtn);this.add(exitBtn);this.add(exportBtn);
        //
        this.setTitle("Employee management system");
        this.setSize(550, 400);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }
    public void showMessage(String message){
        JOptionPane.showMessageDialog(this, message);
    }
    
}
