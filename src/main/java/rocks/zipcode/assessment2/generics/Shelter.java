package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T extends Ageable> implements Iterable<Ageable>{

    ArrayList<Ageable> aliveObject;


    public Shelter() {
        aliveObject = new ArrayList<>();
       // throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return aliveObject.size();
    }

    public void add(T object) {
       aliveObject.add(object);
    }

    public Boolean contains(Object object) {
        return aliveObject.contains(object);
    }

    public void remove(Object object) {
        aliveObject.remove(object);
    }

    public Object get(Integer index) {
        return aliveObject.get(index);
    }

    public Integer getIndexOf(Object ageable) {

        return aliveObject.indexOf(ageable);
    }

    @Override
    public Iterator<Ageable> iterator(){
        return aliveObject.iterator();
    }
}