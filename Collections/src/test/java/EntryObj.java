import java.util.Objects;

public class EntryObj
{
    int id;
    String name;
    EntryObj next;

    public EntryObj (int id, String name, EntryObj next)
    {
        this.id = id;
        this.name = name;
        this.next = next;
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

    public EntryObj getNext ()
    {
        return next;
    }

    public void setNext (EntryObj next)
    {
        this.next = next;
    }

    @Override public boolean equals (Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        EntryObj entryObj = (EntryObj) o;
        return Objects.equals(id, entryObj.id) && Objects.equals(name,
            entryObj.name) && Objects.equals(next, entryObj.next);
    }

    @Override public int hashCode ()
    {
        return this.getId()%10;
    }
}
