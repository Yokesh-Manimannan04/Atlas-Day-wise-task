class Employee {
    private int pwd;
    protected int Salary;
    public int empid;
    Employee() {
        System.out.println("Employee constructor called");
        pwd = 1234; 
    }
    public void setPwd(int pwd) {
        this.pwd = pwd;
    }
    public int getPwd() {
        return pwd;
    }
}
class Hr extends Employee {
    Hr() {
        setPwd(1254);
        Salary = 50000;
        empid = 10001;
    }
    public void display() {
        System.out.println("Password (via getter): " + getPwd());
        System.out.println("Salary: " + Salary);
        System.out.println("Employee ID: " + empid);
    }
    public static void main(String[] args) {
        Hr obj = new Hr();
        obj.display();
    }
}
