class Customer {
    private String name;
    private int id;
    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
    public String toString() {
        return "Customer Name: " + name + ", ID: " + id;
    }
}
class Employee extends Customer {
    private String dept;
    private double salary;
    public void setDept(String dept) { this.dept = dept; }
    public void setSalary(double salary) { this.salary = salary; }
    public String toString() {
        return super.toString() + ", Dept: " + dept + ", Salary: " + salary;
    }
}
class Manager extends Employee {
    private String team;
    private int experience;
    public void setTeam(String team) { this.team = team; }
    public void setExperience(int experience) { this.experience = experience; }
    public String toString() {
        return super.toString() + ", Team: " + team + ", Experience: " + experience + " yrs";
    }
}
public class day9task14 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("Yokesh");
        m.setId(1);
        m.setDept("IT");
        m.setSalary(50000);
        m.setTeam("DevOps");
        m.setExperience(5);
        System.out.println(m.toString());
    }
}
