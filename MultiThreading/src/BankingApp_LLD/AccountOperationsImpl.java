package BankingApp_LLD;

import java.util.HashMap;
import java.util.Map;

public class AccountOperationsImpl implements AccountOperations
{
    Map<Integer, User> userMap = new HashMap<>();

    @Override public String deposit (int userId, Long amount)
    {
        User userObj = userMap.get(userId);
        synchronized (userObj) {
            userObj.setAmount(userObj.getAmount() + amount);
            return "Amount Deposited Successfully and Total balance is:  " + userObj.getAmount()
                + "  Thread name" + Thread.currentThread().getName();
        }
    }

    @Override public String withdraw (int userId, Long amount)
    {
        User userObj = userMap.get(userId);
        synchronized (userObj) {
            long balance = userObj.getAmount();
            if (balance >= amount) {
                userObj.setAmount(userObj.getAmount() - amount);
                return "Amount Withdrawn Successfully nd Rem Balance is ==" + userObj.getAmount()
                    + "  Thread name" + Thread.currentThread().getName();
            }
            return "Not Sufficient Balance";
        }
    }

    @Override
    public String createAccount (User user) {
        userMap.put(user.getId(), user);
        return "Account Created";
    }

    @Override public Long getBalance (int userId)
    {
        User userObj = userMap.get(userId);
        return userObj.getAmount();
    }
}
