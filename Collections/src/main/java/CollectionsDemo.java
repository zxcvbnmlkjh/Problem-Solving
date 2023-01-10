import java.util.*;

public class CollectionsDemo
{
    public static void main(String[] args) {

        List list = new LinkedList();
        list.add("Priyanka");
        list.add("Sneha");
        list.add("Ankita");
        list.add("xyz");
        list.add("low");
        list.add("qwww");
        list.add("rrtt");

        System.out.println("Normal linkedlist value is:"+ list);

        List arrayList = new ArrayList();
        arrayList.add("Priyanka");
        arrayList.add("Anki");
        arrayList.add("Vani");
        arrayList.add("Vani");
        arrayList.add("Vani");
        arrayList.add("Vani");
        arrayList.add("Vani");
        arrayList.add("Vani");
        arrayList.add("Vani");
        arrayList.add("Vani");
        arrayList.add("Vani");
        System.out.println("ArrayList value is:"+ arrayList);

        ArrayList<Integer> arrayList1 = new ArrayList<>();

        String[] str = new String[4];
        int[] arr = new int[5];
        //Employee[] empArr = new Employee[5];

        Set set = new HashSet<>();
        set.add("Pinku");
        set.add("Vani");
        set.add("sdsldks");
        set.add("keowie");
        System.out.println("Set Value is"+ set);

        Set linkSet = new LinkedHashSet();
        linkSet.add("Pinku");
        linkSet.add("Vani");
        linkSet.add("sdsldks");
        linkSet.add("keowie");
        System.out.println("linkSet Value is"+ linkSet);
        Collections.sort(list);


    }
}
