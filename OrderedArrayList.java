public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    OrderedArrayList() {
        super();
    }
    OrderedArrayList(int initialCapacity) {
        super(initialCapacity);
    }
    public boolean add(T object) {
        for(int i = 0; i < this.length; i++) {
            if (object.compareTo(get(i)) > 0) {
                super.add(i, object);
                return true;
            }
        }
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