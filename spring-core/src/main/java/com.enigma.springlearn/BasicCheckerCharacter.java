package com.enigma.springlearn;

public class BasicCheckerCharacter implements SpellChecker {

    @Override
    public void checkSpelling(String emailMessage) {
        if (emailMessage.contains(",")) {
            System.out.println("Checking Spelling using advanced checker");
            System.out.println("Spell Checking contain character");
        } else {
            throw new RuntimeException("An exception occured while checking Spelling");
        }
    }
}
