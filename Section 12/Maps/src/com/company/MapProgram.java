package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A compiled high level, object-oriented, platform independent language");
        languages.put("Python", "An interpreted, object-oriented, platform independent language");
        languages.put("Algol", "An algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        languages.remove("Lisp");
        for (String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
