public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    OrderedArrayList() {
        super();
    }
    OrderedArrayList(int initialCapacity) {
        super(initialCapacity);
    }
    public boolean add(T object) {
        if (object == null) 
            throw new IllegalArgumentException(); //This is redundant, but I have to do this to avoid the NullPointerException.
        for(int i = 0; i < super.size(); i++) {
            if (get(i).compareTo(object) >= 0) {
                super.add(i, object);
                return true;
            }
        }
        super.add(object);
        return true;
    }
    public void add(int index, T object) {
        add(object); //The index doesn't matter.
    }
    public T set(int index, T object) {
        T original = super.remove(index);
        add(object);
        return original;
    }    
}