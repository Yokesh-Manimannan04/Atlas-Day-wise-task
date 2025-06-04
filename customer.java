public class customer {
    String name;
    int id;
    public customer(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void displayInfo(){
        System.out.println("Customer Name:" + name );
        System.out.println("Customer ID:" + id);
    }
}
