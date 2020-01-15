package DIP;

public class CustomerDataAccess implements ICustomerDataAccess {
    public CustomerDataAccess(){

    }

    public String getCustomerName(int id){
        return "Dummy Customer Name";
    }
}
