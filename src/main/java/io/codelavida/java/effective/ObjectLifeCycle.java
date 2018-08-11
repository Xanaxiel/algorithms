package io.codelavida.java.effective;

/*
 * This class contains code from the chapter 2 of 'Effective Java` book.
 */
public class ObjectLifeCycle {
    private ObjectLifeCycle() {

    }

    public static void main(String[] args) {
        ItemOne itemOne = ItemOne.makeItemOne();
        ItemTwo itemTwo = new ItemTwo.Builder("required", 10.0)
                .fieldTwo(5)
                .fieldThree(false)
                .fieldFour("value")
                .build();
    }


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
class ItemOne {
    private ItemOne() {

    }

    static ItemOne makeItemOne() {
        return new ItemOne();
    }
}

/*
 * ITEM 2: consider a builder when faced with many constructor parameters
 */

class ItemTwo {
    private String fieldOne;
    private int fieldTwo;
    private boolean fieldThree;
    private String fieldFour;
    private double fieldFive;

    ItemTwo(Builder builder) {
        this.fieldOne = builder.fieldOne;
        this.fieldTwo = builder.fieldTwo;
        this.fieldThree = builder.fieldThree;
        this.fieldFour = builder.fieldFour;
        this.fieldFive = builder.fieldFive;
    }

    static class Builder {
        //required fields
        private final String fieldOne;
        private final double fieldFive;

        // optional fields
        private int fieldTwo = 0;
        private boolean fieldThree = false;
        private String fieldFour = "default";

        Builder(String fieldOne, double fieldFive) {
            this.fieldOne = fieldOne;
            this.fieldFive = fieldFive;
        }


        Builder fieldTwo(int val) {
            this.fieldTwo = val;
            return this;
        }

        Builder fieldThree(boolean val) {
            this.fieldThree = val;
            return this;
        }

        Builder fieldFour(String val) {
            this.fieldFour = val;
            return this;
        }

        ItemTwo build() {
            return new ItemTwo(this);
        }

    }

}