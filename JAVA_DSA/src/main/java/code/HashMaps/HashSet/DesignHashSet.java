package code.HashMaps.HashSet;

import java.util.HashSet;
import java.util.Set;

public class DesignHashSet {
    class MyHashSet {
        Set<Integer> set = new HashSet<>();

        public MyHashSet() {
            set = this.set;
        }

        public void add(int key) {
            this.set.add(key);
        }

        public void remove(int key) {
            if (this.set.contains(key)) {
                this.set.remove(key);
            }

        }

        public boolean contains(int key) {
            return this.set.contains(key);
        }
    }

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
}
