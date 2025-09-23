package customer;

public class Customer implements ICustomer{
    private int id;
    private String name;


    public Customer(int id, String name){
        this.id=id;
        this.name=name;


    }
    public Customer(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "ID: " + id + "Name: " + name;
    }
}