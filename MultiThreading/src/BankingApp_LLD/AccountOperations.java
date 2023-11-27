package BankingApp_LLD;

public interface AccountOperations
{
     String deposit (int userId, Long amount);

     String withdraw (int userId, Long amount);

     String createAccount (User user);

     Long getBalance (int userId);

}
