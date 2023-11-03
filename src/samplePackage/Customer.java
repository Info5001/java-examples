package samplePackage;

public class Customer {
    int index;
    String name;
    int spending;
    
    public Customer(int index, String name, int spending) {
        this.index = index;
        this.name = name;
        this.spending = spending;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSpending() {
        return spending;
    }
    public void setSpending(int spending) {
        this.spending = spending;
    }

    public void print(int i){
        System.out.println(i+". " + name + " - " + spending);
    }


}
