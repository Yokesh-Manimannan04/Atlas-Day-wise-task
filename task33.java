class Customer {
    int cost;
    String items;

    void purchase_list() {
        cost = 40;
        items = "Tomatoes";
    }
}

class Mart extends Customer {
    int cost;
    String items;

    void billing() {
        this.items = "onions";
        this.cost = 30;
    }

    public static void main(String[] args) {
        Mart m = new Mart();
        m.purchase_list();
        m.billing();
        System.out.println("Child Items: " + m.items);
        System.out.println("Child Cost: " + m.cost);
        System.out.println("%%%%%%%%%%%%%%%%%%%%");

        System.out.println("Parent Items: " + ((Customer)m).items);
        System.out.println("Parent Cost: " + ((Customer)m).cost);
    }
}
