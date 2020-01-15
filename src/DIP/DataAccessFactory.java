package DIP;

public class DataAccessFactory {
    public static ICustomerDataAccess getCustomerDataAccessObj() {
        return new CustomerDataAccess();
    }
}
