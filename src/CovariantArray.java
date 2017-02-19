/**
 * Created by clement on 2017/2/19.
 */
public class CovariantArray {

    public static void main(String[] args) {
        String[] arrayOfStrings = new String[]{"one", "two"};
        Object[] arrayOfObjects = arrayOfStrings;
        arrayOfObjects[0] = 1; // no compilation error, will throw a java.lang.ArrayStoreException at runtime
    }
}