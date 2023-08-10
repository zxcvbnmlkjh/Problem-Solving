/*
public class BuilderDesignPattern {

    public static void main (String[] args)
    {
        User user1 = new User.UserBuilder()
            .set("Fake address 1234")
            .build();
    }
}
class User {

    private String name;
    private int id;
    private String address;

    User (UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.id = userBuilder.id;
        this.address = userBuilder.address;
    }

    public static class UserBuilder {

        private String name;
        private int id;
        private String address;

        UserBuilder () {

        }
        public void setName (String name)
        {
            this.name = name;
        }

        public void setId (int id)
        {
            this.id = id;
        }

        public void setAddress (String address)
        {
            this.address = address;
        }

        public User build() {
            return new User(this);
        }
    }
}
*/
