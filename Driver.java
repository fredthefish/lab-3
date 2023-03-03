public class Driver {
    public static void main(String[] args) {
        NoNullArrayList<String> nonull = new NoNullArrayList<String>(2);
        try {
            nonull.add(null);
        } catch (IllegalArgumentException e) {
            System.out.println("You cannot add a null to a nonullarraylist.");
        }
        System.out.println("Adding world to the nonullarraylist, and inserting hello into index 0:");
        nonull.add("World");
        nonull.add(0, "Hello");
        System.out.println(nonull);
        try {
            nonull.set(0, null);
        } catch (IllegalArgumentException e) {
            System.out.println("You cannot set a null in a nonullarraylist.");
        }

        OrderedArrayList<Integer> ordered = new OrderedArrayList<Integer>();
        ordered.add((Integer)1);
        ordered.add((Integer)2);
        ordered.add((Integer)0);
        ordered.add((Integer)(-1));
        System.out.println("Adding 1, 2, 0, and -1 to a orderedarraylist:"+ ordered);
        ordered.add(1, 5);
        System.out.println("Inserting 5 in the middle of the orderedarraylist: "+ ordered);
        System.out.println("Setting the first index of the orderedarraylist to 4, its current value is: " + ordered.set(0, 4));
        System.out.println("Orderedarraylist: "+ ordered);
        try {
            ordered.add(null);
        } catch (IllegalArgumentException e) {
            System.out.println("As a subclass of NoNullArrayList, you cannot add a null to a OrderedArrayList.");
        }
    }
}
