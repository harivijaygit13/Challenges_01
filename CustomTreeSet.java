import java.util.TreeSet;
class CustomElement implements Comparable<CustomElement> {
    Integer value;

    CustomElement(Integer value) {
        this.value = value;
    }

    @Override
    public int compareTo(CustomElement o) {
        if (this.value == null) return -1; // nulls go last
        if (o.value == null) return 1;
        return this.value.compareTo(o.value);
    }

    @Override
    public String toString() {
        return value == null ? "null" : value.toString();
    }
}

public class CustomTreeSet {
    public static void main(String[] args) {
        TreeSet<CustomElement> treeSet = new TreeSet<>();

        treeSet.add(new CustomElement(3));
        treeSet.add(new CustomElement(1));
        treeSet.add(new CustomElement(2));
        treeSet.add(new CustomElement(4));
        treeSet.add(new CustomElement(null));

        // Printing the TreeSet
        System.out.println("TreeSet with custom elements: " + treeSet);
    }
}



