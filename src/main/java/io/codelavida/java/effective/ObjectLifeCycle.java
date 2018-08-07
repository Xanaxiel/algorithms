package io.codelavida.java.effective;

/*
 * This class contains code from the chapter 2 of 'Effective Java` book.
 */
public class ObjectLifeCycle {
    private ObjectLifeCycle() {

    }

    /*
     * ITEM 1: consider static factory methods instead of constructors.
     *
     * Advantages:
     *  - Unlike constructors static factory methods have names
     *  - Unlike constructors they are not required to create new instances, every time they are invoked.
     *  - Unlike constructors they can return object of any subtype
     *
     */
    class MyClass {
        private MyClass() {

        }

        public MyClass makeMyClass() {
            return new MyClass();
        }
    }


}
