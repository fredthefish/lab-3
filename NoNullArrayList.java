import java.util.ArrayList

public class NoNullArrayList<T> extends ArrayList<T> {
  NoNullArrayList<T>() {
    super<T>()
  }
  NoNullArrayList<T>(int initialCapacity) {
    super<T>(initialCapacity)
  }
  
  public void add(T object) {
    if (object == null) 
      return IllegalArgumentException
    super.add(object)
  }
  public bool add(T object, int index) {
    if (object == null) 
      return IllegalArgumentException
    return super.add(object, index)
  }
  public T set(T object, int index) {
    if (object == null) 
      return IllegalArgumentException
    return super.set(object, index)
  }
}
