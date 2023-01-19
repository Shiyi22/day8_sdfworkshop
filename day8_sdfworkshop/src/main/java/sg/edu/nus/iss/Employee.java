package sg.edu.nus.iss;

public class Employee implements Comparable<Employee>{

    private String staffNo; 
    private String fullName; 
    private String department; 
    private String role; 
    private String emailAdd; 
    private Integer salary;
    
    // constructors 
    public Employee(String staffNo, String fullName, String department, String role, String emailAdd, Integer salary) {
        this.staffNo = staffNo;
        this.fullName = fullName;
        this.department = department;
        this.role = role;
        this.emailAdd = emailAdd;
        this.salary = salary;
    }
    // getters and setters 
    public String getStaffNo() {return staffNo;}
    public void setStaffNo(String staffNo) {this.staffNo = staffNo;}
    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}
    public String getDepartment() {return department;}
    public void setDepartment(String department) {this.department = department;}
    public String getRole() {return role;}
    public void setRole(String role) {this.role = role;}
    public String getEmailAdd() {return emailAdd;}
    public void setEmailAdd(String emailAdd) {this.emailAdd = emailAdd;}
    public Integer getSalary() {return salary;}
    public void setSalary(Integer salary) {this.salary = salary;}

    // to string 
    @Override
    public String toString() {
        return "Employee [staffNo=" + staffNo + ", fullName=" + fullName + ", department=" + department + ", role="
                + role + ", emailAdd=" + emailAdd + ", salary=" + salary + "]";
    }
    // manually write in the code for sorting (by name )
    @Override
    public int compareTo(Employee o) {
        return this.getFullName().compareTo(o.getFullName());
    } 

}
