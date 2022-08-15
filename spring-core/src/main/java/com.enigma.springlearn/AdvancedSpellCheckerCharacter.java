package com.enigma.springlearn;

public class AdvancedSpellCheckerCharacter {
    public void checkSpellingCharacter(String emailMessage) {
        if (emailMessage.contains(",")) {
            System.out.println("Checking Spelling using advanced checker");
            System.out.println("Spell Checking contain character");
        } else {
            throw new RuntimeException("An exception occured while checking Spelling");
        }
    }
}
