package view;

import com.toedter.calendar.JDateChooser;
import controller.AddController;
import controller.ManagementEmployees;
import java.awt.Font;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Employee;

/*
 * @author HuynhPhan
 */
public class addView extends JFrame {
//    Id, First Name, Last Name, Phone, Email, Address, DOB, Sex, Salary, Agency

    private JLabel title, idLabel, fiLabel, seLable, phoneLabel, emailLabel,
            addressLabel, dobLabel, sexLabel, salaryLabel, agencyLabel;
    private JTextField idField, fiField, seField, phoneField, emailField, addressField,dobField, salaryField, agencyField;
    private JRadioButton maleRadio, femaleRadio, otherRadio;
    private ButtonGroup bg;
    private JButton btnAdd,btnClear,btnExit;
    private JDateChooser JDateChooser;
    public addView(ManagementEmployees me) {
        initComponents(me);
    }
    ManagementEmployees me = new ManagementEmployees() ;
    public void initComponents(ManagementEmployees me) {
        //Tao tieu de
        JDateChooser = new JDateChooser();
        JDateChooser.setDateFormatString("dd-MM-yyyy");
        ImageIcon iconAdd = new ImageIcon(getClass().getResource("/image/add.png"));
        Image image = iconAdd.getImage();
        ImageIcon addIcon = new ImageIcon(image.getScaledInstance(40, 40,Image.SCALE_SMOOTH));
        
        title = new JLabel("Add employees",addIcon,JLabel.LEFT);
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
        btnAdd = new JButton("ADD");
        btnClear = new JButton("Clear");
        btnExit = new JButton("Exit");
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        otherRadio = new JRadioButton("Other");
        //
        idField = new JTextField();
        fiField = new JTextField();
        seField = new JTextField();
        phoneField = new JTextField();
        emailField = new JTextField();
        addressField = new JTextField();
        salaryField = new JTextField();
        agencyField = new JTextField();
        
        bg = new ButtonGroup();
        bg.add(maleRadio);bg.add(femaleRadio);bg.add(otherRadio);
        //Tao kich thuoc
        title.setBounds(130,20,200,40);
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
        JDateChooser.setBounds(130,330,200,40);
        salaryField.setBounds(130, 430, 200, 40);
        agencyField.setBounds(130, 480, 200, 40);
        //
        btnClear.setBounds(40,540,70,30);
        btnAdd.setBounds(190,540,70,30);
        btnExit.setBounds(320,540,70,30);
        
        // 
        AddController AddController = new AddController(this,me);
        btnAdd.addActionListener(AddController);
        btnClear.addActionListener(AddController);
        btnExit.addActionListener(AddController);
        //
        this.add(JDateChooser);
        this.add(maleRadio);this.add(femaleRadio);this.add(otherRadio);
        this.add(title);this.add(btnClear);this.add(btnAdd);this.add(btnExit);
        this.add(idLabel);this.add(fiLabel);this.add(seLable);this.add(phoneLabel);this.add(emailLabel);
        this.add(addressLabel);this.add(dobLabel);this.add(sexLabel);this.add(salaryLabel);this.add(agencyLabel);
        
        this.add(idField);this.add(fiField);this.add(seField);this.add(phoneField);this.add(emailField);
        this.add(addressField);this.add(salaryField);this.add(agencyField);
        //
        this.setTitle("Add employees");
        this.setSize(450, 630);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
    }
    
    public void showMessage(String message){
        JOptionPane.showMessageDialog(this, message);
    }
    public String formatDate(Date date){
        SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
        String dateFormat = simple.format(date);
        return dateFormat;
    }
    public String formatText(String text){
      String [] arrText = text.split("\\s+");
      String newText = "";
      if(arrText != null){
          for(int i = 0;i<arrText.length;i++){
              newText += Character.toUpperCase(arrText[i].charAt(0)) + arrText[i].substring(1)+" ";
          }
      }
      else newText = Character.toUpperCase(text.charAt(0)) + text.substring(1);
      return newText;
    }
    public boolean invalidID(ArrayList<Employee>list){
        if(idField.getText().trim().isEmpty()){
            showMessage("ID can't be empty");
            idField.requestFocus();
            return false;
        }
        for(Employee e : list){
            if(e.getId().equalsIgnoreCase(idField.getText())){
                showMessage("ID Employee existed in List");
                return false;
            }
        }
        return true;
    }
    
    public boolean invalid(JTextField jt,String title,String mess,String regex){
         if(jt.getText().trim().length() == 0){
            showMessage(title +" can't be empty");
            jt.requestFocus();
            return false;
        }
         else if(!jt.getText().trim().matches(regex)){
            showMessage(mess);
            jt.requestFocus();
            return false;
        }
        return true;
    }
    public boolean invalidFirstName(){
        String mess = "First name only containe alphabet";
        if(invalid(fiField, "First Name",mess, ".*[a-zA-Z]+")){
            return true;
        } return false;
    }
    
    public boolean invalidLastName(){
         String mess = "Last name only containe alphabet";
         if(invalid(seField, "Last Name",mess, ".*[a-zA-Z]+")){
            return true;
        } return false;
    }
    
    public boolean invalidPhone(){
        String mess = "Phone number only contains digit number and 10 digit numbers";
        if(invalid(phoneField, "Phone",mess, "^0[3-9]{1}\\d{8}$")){
            return true;
        } return false;
    }
    
    public boolean invalidEmail(){
        String mess= "Enter the correct email format\nExample: name@gmail.com";
        if(invalid(emailField, "Email", mess,"^[a-zA-Z0-9]+@([a-z]{2,6}\\.[a-z]{2,6}|[a-z]{2,6}\\.[a-z]{2,6}\\.[a-z]{2,6})*$")){
            return true;
        } return false;
    }
    
    public boolean invalidAddress(){
       if(addressField.getText().trim().length() == 0){
            showMessage("Address can't be empty");
            addressField.requestFocus();
            return false;
        }
       return true;
    }
    public boolean invalidDOB(){
       String mess= "Please select Date \nor Enter the correct DOB format dd-MM-yyyy\\n Example: 26-06-2003";
        if(JDateChooser.getDate() == null){
            showMessage(mess);
            JDateChooser.requestFocus();
            return false;
        }
        return true;
    }
    public boolean invalidSex(){
           String mess= "Select your gender";
        if(bg.getSelection() == null){
            showMessage(mess);
            JDateChooser.requestFocus();
            return false;
        }
        return true;
       
    }
    public boolean invalidSalary(){
            String mess= "Salary only contain digit number and least 100000";
        if(invalid(salaryField, "Salary", mess,"^[1-9]{1}[0-9]{5,8}")){
            return true;
        } return false;
       
    }
     public boolean invalidAgency(){
       if(agencyField.getText().trim().length() == 0){
            showMessage("Address can't be empty");
            agencyField.requestFocus();
            return false;
        }
       return true;
    }
     public Employee getInfoEmployee(ArrayList<Employee>list){
         if(!invalidID(list) || !invalidFirstName() || !invalidLastName() || !invalidPhone()|| 
                 !invalidEmail() || !invalidAddress() || !invalidDOB() || !invalidSex() || !invalidSalary() || !invalidAgency()) 
                 {
             return null;
         }
        try{
             String gender;
         if(maleRadio.isSelected()){
             gender = "male";
         }else if(femaleRadio.isSelected()){
             gender = "female";
         }else{
             gender = "other";
         }
         Employee e = new Employee(idField.getText().toUpperCase(), formatText(fiField.getText()),formatText(seField.getText()) 
                 , phoneField.getText(), emailField.getText(), 
                 formatText( addressField.getText()), formatDate(JDateChooser.getDate()),gender.toUpperCase(), agencyField.getText(), Double.parseDouble(salaryField.getText()));
         
         return e;
        }catch(NumberFormatException e){
            System.out.println(e);
        }
        return null;
     }
     
        public void clear(){
        idField.setText("");
        fiField.setText("");
        seField.setText("");
        phoneField.setText("");
        emailField.setText("");
        addressField.setText("");
        JDateChooser.setDate(null);
        salaryField.setText("");
        agencyField.setText("");
        bg.clearSelection();
    }
}
