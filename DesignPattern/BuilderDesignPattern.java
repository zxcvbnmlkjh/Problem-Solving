public class BuilderDesignPattern
{

    public static void main (String[] args)
    {
        User usr = new User.UserBuilder()
            .setAddress("Abohar")
            .setName("Priyanka")
            .build();

        User usr1 = new User.UserBuilder()
            .setAddress("Abohar")
            .setName("Priyanka")
            .build1();
        System.out.println(usr);
    }
}

class User
{

    private String name;
    private int id;
    private String address;

    @Override public String toString ()
    {
        return "User{" +
            "name='" + name + '\'' +
            ", id=" + id +
            ", address='" + address + '\'' +
            '}';
    }

    User (String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    private User (UserBuilder userBuilder)
    {
        this.name = userBuilder.name;
        this.id = userBuilder.id;
        this.address = userBuilder.address;
    }

    public static class UserBuilder
    {

        private String name;
        private int id;
        private String address;

        public UserBuilder setName (String name)
        {
            this.name = name;
            return this;
        }

        public UserBuilder setId (int id)
        {
            this.id = id;
            return this;
        }

        public UserBuilder setAddress (String address)
        {
            this.address = address;
            return this;
        }

        public User build ()
        {
            return new User(this);
        }

        public User build1 ()
        {
            return new User(this.name, this.id, this.address);
        }
    }
}
