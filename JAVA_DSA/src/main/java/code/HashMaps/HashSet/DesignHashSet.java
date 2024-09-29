package code.HashMaps.HashSet;

import java.util.HashSet;
import java.util.Set;

public class DesignHashSet {
    class MyHashSet {
        private Set<Integer> set;

        public MyHashSet() {
            set = new HashSet<>();
        }

        public void add(int key) {
            set.add(key); // No need for 'this' since there's no naming conflict
        }

        public void remove(int key) {
            set.remove(key); // No need for 'this'
        }

        public boolean contains(int key) {
            return set.contains(key); // No need for 'this'
        }
    }

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */


/*
* Importance of this in Your Code
Clarity:

Using this clarifies that you are referring to the instance variable set. For example, in the add, remove, and contains methods, this.set explicitly indicates that you're accessing the instance variable.
Avoiding Naming Conflicts:

If you had a method parameter or a local variable named set, using this.set helps avoid ambiguity. For instance, if you had public void add(Set<Integer> set), calling this.set would refer to the instance variable while just set would refer to the method parameter.
Initialization:

In the constructor, you're trying to assign this.set = this.set;, which does not make sense and can be simplified to just set = new HashSet<>();. This line is effectively a no-op because you're assigning the instance variable to itself.
What Happens If You Don't Use this?
Same Name Variables:

If you don’t use this and have local variables or parameters with the same name as instance variables, the local variable or parameter will shadow the instance variable. This means that any assignment or reference will point to the local variable instead of the instance variable.
Ambiguity:

If you omit this, you might unintentionally modify or access the wrong variable, leading to bugs that can be difficult to track down.
* */
}
