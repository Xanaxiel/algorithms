package io.codelavida.fsm;

import java.util.BitSet;

/**
 * An automaton with all its states and transitions. The states are represented
 * as integers.
 */
public class Automaton {

    private int[] states;

    private int[] transitions;

    private int nextState;

    private int currState = -1;

    private int nextTransition;

    private final BitSet isAccept;

    private boolean deterministic = true;

    public Automaton() {
        this(2, 2);
    }

    public Automaton(int numStates, int numTransitions) {
        // for each state reference to transitions array and count
        // of how many transitions leave the state
        states = new int[numStates * 2];
        isAccept = new BitSet(numStates);
        // min, max and dest in sequence
        transitions = new int[numTransitions * 3];
    }

    public int createState() {
        growStates();
        int state = nextState / 2;
        states[nextState] = -1;
        nextState += 2;
        return state;
    }

    public void setAccept(int state) {

    }

    private void growStates() {

    }

}
