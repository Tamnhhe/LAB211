
package view;

import controller.deleteController;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Employee;

/*
 * @author HuynhPhan
 */
public class deleteView extends JFrame{
    
    private JLabel title, idLabel, fiLabel, seLable, phoneLabel, emailLabel,
            addressLabel, dobLabel, sexLabel, salaryLabel, agencyLabel;
    private JTextField idField, fiField, seField, phoneField, emailField, addressField, dobField, salaryField, agencyField;
    private JRadioButton maleRadio, femaleRadio, otherRadio;
    private ButtonGroup bg;
    private JButton btnDelete, btnExit;

    public deleteView(Employee e , ArrayList<Employee> list) {
        initComponents(e,list);
    }
    
    private void initComponents(Employee e,ArrayList<Employee> list){
        // initialization
        ImageIcon deleteIcon = new ImageIcon(getClass().getResource("/image/delete.png"));
        title = new JLabel("Delete employees",deleteIcon,JLabel.LEFT);
        Font font = new Font("Time News Romans", Font.BOLD, 18);
        title.setFont(font);
        idLabel = new JLabel("ID employee");
        fiLabel = new JLabel("First name");
        seLable = new JLabel("Last name");
        phoneLabel = new JLabel("Phone number");
        emailLabel = new JLabel("Email");
        addressLabel = new JLabel("Address");
        dobLabel = new JLabel("Date of birth");
        sexLabel = new JLabel("Sex");
        salaryLabel = new JLabel("Salary");
        agencyLabel = new JLabel("Agency");
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        otherRadio = new JRadioButton("Other");
        //
        btnDelete = new JButton("Delete");
        btnExit = new JButton("Exit");
        //
        idField = new JTextField(e.getId());
        idField.setEditable(false);
        fiField = new JTextField(e.getFirstName());
        seField = new JTextField(e.getLastName());
        phoneField = new JTextField(e.getPhone());
        emailField = new JTextField(e.getEmail());
        addressField = new JTextField(e.getAddress());
        dobField = new JTextField(e.getBirth());
        salaryField = new JTextField(String.format("%.1f", e.getSalary()));
        agencyField = new JTextField(e.getAgency());
        
        bg = new ButtonGroup();
        bg.add(maleRadio);bg.add(femaleRadio);bg.add(otherRadio);
        if(e.getSex().equals("male")){
            maleRadio.setSelected(true);
            femaleRadio.setEnabled(false);
            otherRadio.setEnabled(false);

        }else if(e.getSex().equals("female")){
            femaleRadio.setSelected(true);
            maleRadio.setEnabled(false);
            otherRadio.setEnabled(false);
        }else{
           femaleRadio.setEnabled(false);
            maleRadio.setEnabled(false);
            otherRadio.setSelected(true);
        }
        //Tao kich thuoc
        title.setBounds(130,30,200,40);
        maleRadio.setBounds(130,380,70,40);
        femaleRadio.setBounds(200,380,70,40);
        otherRadio.setBounds(270,380,70,40);
        idLabel.setBounds(30, 80, 100, 40);
        fiLabel.setBounds(30, 130, 100, 40);
        seLable.setBounds(250, 130, 100, 40);
        phoneLabel.setBounds(30, 180, 100, 40);
        emailLabel.setBounds(30, 230, 100, 40);
        addressLabel.setBounds(30, 280, 100, 40);
        dobLabel.setBounds(30, 330, 100, 40);
        sexLabel.setBounds(30, 380, 100, 40);
        salaryLabel.setBounds(30, 430, 100, 40);
        agencyLabel.setBounds(30, 480, 100, 40);
        //
        idField.setBounds(130, 80, 200, 40);
        fiField.setBounds(130, 130, 100, 40);
        seField.setBounds(330, 130, 100, 40);
        phoneField.setBounds(130, 180, 200, 40);
        emailField.setBounds(130, 230, 200, 40);
        addressField.setBounds(130, 280, 200, 40);
        dobField.setBounds(130, 330, 200, 40);
        salaryField.setBounds(130, 430, 200, 40);
        agencyField.setBounds(130, 480, 200, 40);
        //
        btnDelete.setBounds(150,540,100,30);
        btnExit.setBounds(320,540,70,30);
        //add listener
        deleteController deleteController = new deleteController(this, e,list);
        btnDelete.addActionListener(deleteController);
        btnExit.addActionListener(deleteController);

        //disable
        fiField.setEditable(false);
        seField.setEditable(false);
        phoneField.setEditable(false);
        emailField.setEditable(false);
        addressField.setEditable(false);
        dobField.setEditable(false);
        salaryField.setEditable(false);
        agencyField.setEditable(false);
        //
        this.add(maleRadio);this.add(femaleRadio);this.add(otherRadio);
        this.add(title);this.add(btnDelete);this.add(btnExit);
        this.add(idLabel);this.add(fiLabel);this.add(seLable);this.add(phoneLabel);this.add(emailLabel);
        this.add(addressLabel);this.add(dobLabel);this.add(sexLabel);this.add(salaryLabel);this.add(agencyLabel);
        
        this.add(idField);this.add(fiField);this.add(seField);this.add(phoneField);this.add(emailField);
        this.add(addressField);this.add(dobField);this.add(salaryField);this.add(agencyField);
        //
        this.setTitle("Delete Employess");
        this.setSize(450, 630);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

}
    

