import java.util.List;

public interface SimpleList {
    int size();

    boolean isEmpty();

    boolean contains(Object e);

    void add(Object e);

    Object add(int i, Object e);

    Object set(int i, Object e);

    boolean remove(Object e);

    void addAll(List l);

    void clear();

    Object get(int i);

    int indexOf(Object o);
}