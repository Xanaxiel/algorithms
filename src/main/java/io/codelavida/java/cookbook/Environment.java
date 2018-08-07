package io.codelavida.java.cookbook;

import java.util.Map;
import java.util.Set;

import static java.lang.System.out;

/**
 * Interacting with the environment
 */
public class Environment {

    public static void main(String args[]) {
        Set<Map.Entry<String, String>> envs = System.getenv().entrySet();
        envs.forEach((me) -> out.println(me.getKey() + " = " + (me.getValue())));
        System.getProperties().list(System.out);
    }
}
