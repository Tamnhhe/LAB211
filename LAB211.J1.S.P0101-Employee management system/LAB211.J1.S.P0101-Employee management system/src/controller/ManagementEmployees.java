package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.Employee;

/*
 * @author HuynhPhan
 */
public class ManagementEmployees {

    private ArrayList<Employee> list;

    public ManagementEmployees() {
    }

    public ArrayList<Employee> getList() {
        if (list == null) {
            list = new ArrayList<>();
        }
        return list;
    }

    public ManagementEmployees(ArrayList<Employee> list) {
        if (list == null) {
            list = new ArrayList<>();
        } else {
            this.list = list;
        }
    }

    public Employee searchEmployee(String id) {
        for (Employee x : list) {
            if (id.equalsIgnoreCase(x.getId())) {
                return x;
            }
        }
        return null;
    }

    public void add(Employee e) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(e);
    }

    public void deleteEmployee(Employee e) {
        list.remove(e);
    }

    public void show() {
        for (Employee i : list) {
            System.out.println(i.toString());
        }
    }

    public void update(Employee eOld, Employee eNew) {
        eOld.setFirstName(eNew.getFirstName());
        eOld.setLastName(eNew.getLastName());
        eOld.setPhone(eNew.getPhone());
        eOld.setEmail(eNew.getEmail());
        eOld.setAddress(eNew.getAddress());
        eOld.setBirth(eNew.getBirth());
        eOld.setSex(eNew.getSex());
        eOld.setSalary(eNew.getSalary());
        eOld.setAgency(eNew.getAgency());
    }

    public ArrayList<Employee> listSearchByName(String xName) {
        ArrayList<Employee> listSearchByName = new ArrayList<>();
        boolean isFind = false;
        for (Employee e : list) {
            String fullName = e.getFirstName() + " " + e.getLastName();
            if (fullName.toLowerCase().contains(xName.toLowerCase())) {
                listSearchByName.add(e);
                isFind = true;
            }
        }
        if (!isFind) {
            return null;
        }
        return listSearchByName;
    }

    public void sortEmployeeBySalary() {
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getSalary() != o2.getSalary()) {
                    if (o1.getSalary() > o2.getSalary()) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
            }
        ;
    }

    );
    }
    
    public void sortEmployeeByName() {
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getFirstName().compareTo(o2.getFirstName()) != 0) {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                } else {
                    return o1.getLastName().compareTo(o2.getLastName());
                }
            }
        ;
    }

    );
    }
    
    public void exportFile(ArrayList<Employee> list) {
        try {
            FileOutputStream fileOutput = new FileOutputStream("employees.dat");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            for (Employee e : list) {
                objectOutput.writeObject(e);
            }
            objectOutput.close();
            fileOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
