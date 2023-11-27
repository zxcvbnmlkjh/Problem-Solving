package BankingApp_LLD;

public class User
{
    private int id;
    private String name;
    private String city;
    private long amount;

    public User (int id, String name, String city, long amount)
    {
        this.id = id;
        this.name = name;
        this.city = city;
        this.amount = amount;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public long getAmount ()
    {
        return amount;
    }

    public void setAmount (long amount)
    {
        this.amount = amount;
    }
}
