package com.enigma.springlearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // IOC -> Masuk ke golongan desain principles bukan design pattern
        // Tightly coupled dan loosely coupled
        // Hubungan ketat & Hubungan renggang
//        AdvancedSpellChecker advancedSpellChecker = new AdvancedSpellChecker();
//        AdvancedSpellCheckerCharacter advancedSpellCheckerCharacter = new AdvancedSpellCheckerCharacter();
//        advancedSpellChecker.checkSpelling("Hey, this is first message");
//        BasicChecker basicChecker = new BasicChecker();
//        basicChecker.checkSpelling("Hey, this is first message");

        // DI -> salah design pattern di spring
//        EmailClient emailClient = new EmailClient();
//        emailClient.sendEmail("Hey, this is first message");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
    }
}
