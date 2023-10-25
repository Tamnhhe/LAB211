package Run;

import java.util.ArrayList;
import javax.swing.UIManager;
import model.Employee;
import view.menuView;

/*
 * @author HuynhPhan
 */
public class Main {

    public static void main(String[] args) {
       
        ArrayList<Employee> list = new ArrayList<>();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
             new menuView(list).setVisible(true);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
}
