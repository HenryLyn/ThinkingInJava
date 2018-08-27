package top.linhuarui.thinking_in_java.chapter8.section4.s4;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Vector;

/**
* @author LHR
* @date 2018/8/27
* @desc Simple version of a Dictionary
* @version 1.0
* @modify
*   @date
*/
public class AssocArray extends Dictionary {
    private Vector keys = new Vector();
    private Vector values = new Vector();

    /**
     * Returns the number of entries (distinct keys) in this dictionary.
     *
     * @return the number of keys in this dictionary.
     */
    @Override
    public int size() {
        return keys.size();
    }

    /**
     * Tests if this dictionary maps no keys to value. The general contract
     * for the <tt>isEmpty</tt> method is that the result is true if and only
     * if this dictionary contains no entries.
     *
     * @return <code>true</code> if this dictionary maps no keys to values;
     * <code>false</code> otherwise.
     */
    @Override
    public boolean isEmpty() {
        return keys.isEmpty();
    }

    /**
     * Returns an enumeration of the keys in this dictionary. The general
     * contract for the keys method is that an <tt>Enumeration</tt> object
     * is returned that will generate all the keys for which this dictionary
     * contains entries.
     *
     * @return an enumeration of the keys in this dictionary.
     * @see Dictionary#elements()
     * @see Enumeration
     */
    @Override
    public Enumeration keys() {
        return keys.elements();
    }

    /**
     * Returns an enumeration of the values in this dictionary. The general
     * contract for the <tt>elements</tt> method is that an
     * <tt>Enumeration</tt> is returned that will generate all the elements
     * contained in entries in this dictionary.
     *
     * @return an enumeration of the values in this dictionary.
     * @see Dictionary#keys()
     * @see Enumeration
     */
    @Override
    public Enumeration elements() {
        return values.elements();
    }

    /**
     * Returns the value to which the key is mapped in this dictionary.
     * The general contract for the <tt>isEmpty</tt> method is that if this
     * dictionary contains an entry for the specified key, the associated
     * value is returned; otherwise, <tt>null</tt> is returned.
     *
     * @param key a key in this dictionary.
     *            <code>null</code> if the key is not mapped to any value in
     *            this dictionary.
     * @return the value to which the key is mapped in this dictionary;
     * @throws NullPointerException if the <tt>key</tt> is <tt>null</tt>.
     * @see Dictionary#put(Object, Object)
     */
    @Override
    public Object get(Object key) {
        int index = keys.indexOf(key);
        // indexOf() returns -1 if key not found:
        if (index == -1) {
            return null;
        }
        return values.elementAt(index);
    }

    /**
     * Maps the specified <code>key</code> to the specified
     * <code>value</code> in this dictionary. Neither the key nor the
     * value can be <code>null</code>.
     * <p>
     * If this dictionary already contains an entry for the specified
     * <tt>key</tt>, the value already in this dictionary for that
     * <tt>key</tt> is returned, after modifying the entry to contain the
     * new element. <p>If this dictionary does not already have an entry
     * for the specified <tt>key</tt>, an entry is created for the
     * specified <tt>key</tt> and <tt>value</tt>, and <tt>null</tt> is
     * returned.
     * <p>
     * The <code>value</code> can be retrieved by calling the
     * <code>get</code> method with a <code>key</code> that is equal to
     * the original <code>key</code>.
     *
     * @param key   the hashtable key.
     * @param value the value.
     * @return the previous value to which the <code>key</code> was mapped
     * in this dictionary, or <code>null</code> if the key did not
     * have a previous mapping.
     * @throws NullPointerException if the <code>key</code> or
     *                              <code>value</code> is <code>null</code>.
     * @see Object#equals(Object)
     * @see Dictionary#get(Object)
     */
    @Override
    public Object put(Object key, Object value) {
        keys.addElement(key);
        values.addElement(value);
        return key;
    }

    /**
     * Removes the <code>key</code> (and its corresponding
     * <code>value</code>) from this dictionary. This method does nothing
     * if the <code>key</code> is not in this dictionary.
     *
     * @param key the key that needs to be removed.
     * @return the value to which the <code>key</code> had been mapped in this
     * dictionary, or <code>null</code> if the key did not have a
     * mapping.
     * @throws NullPointerException if <tt>key</tt> is <tt>null</tt>.
     */
    @Override
    public Object remove(Object key) {
        int index = keys.indexOf(key);
        if (index == -1) {
            return null;
        }
        keys.removeElementAt(index);
        Object returnval = values.elementAt(index);
        values.removeElementAt(index);
        return returnval;
    }

    // Test it
    public static void main (String[] args) {
        AssocArray aa = new AssocArray();
        for (char c = 'a'; c <= 'z'; c++) {
            aa.put(String.valueOf(c), String.valueOf(c).toUpperCase());
        }
        char[] ca = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < ca.length; i++) {
            System.out.println("Uppercase: " + aa.get(String.valueOf(ca[i])));
        }
    }
}
