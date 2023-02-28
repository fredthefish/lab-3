import java.util.ArrayList;
import java.lang.IllegalArgumentException;

public class NoNullArrayList<T> extends ArrayList<T> {
  NoNullArrayList() {
    super();
  }
  NoNullArrayList(int initialCapacity) {
    super(initialCapacity);
  }
  
  public boolean add(T object) {
    if (object == null) 
      throw new IllegalArgumentException();
    return super.add(object);
  }
  public void add(int index, T object) {
    if (object == null) 
      throw new IllegalArgumentException();
    super.add(index, object);
  }
  public T set(int index, T object) {
    if (object == null)
      throw new IllegalArgumentException();
    return super.set(index, object);
  }
}
