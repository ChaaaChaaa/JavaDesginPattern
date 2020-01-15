package DIP;

public class CustomerBusinessLogic {
   ICustomerDataAccess _custDataAccess;

   public CustomerBusinessLogic(){
       _custDataAccess = DataAccessFactory.getCustomerDataAccessObj();
   }

   public String getCustomerName(int id){
       return _custDataAccess.getCustomerName(id);
   }
}
