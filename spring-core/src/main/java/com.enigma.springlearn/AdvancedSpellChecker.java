package com.enigma.springlearn;

public class AdvancedSpellChecker {
    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            System.out.println("Checking Spelling using advanced checker");
            System.out.println("Spell Checking completed");
        } else {
            throw new RuntimeException("An exception occured while checking Spelling");
        }
    }
}
