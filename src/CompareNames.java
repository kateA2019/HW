public class CompareNames {
    private String name1;
    private String name2;

    public CompareNames(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    public boolean nameComparator() {
        if (name1.equals(name2)) return true;
        return false;
    }

    public static void main(String[] args) {
        CompareNames names = new CompareNames("Katerina", "Kate");
        System.out.println("Is " + names.name1 + "  equals " + names.name2 + "? >> " + names.nameComparator());
    }
}