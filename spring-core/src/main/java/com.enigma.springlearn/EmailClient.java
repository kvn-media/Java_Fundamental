package com.enigma.springlearn;

public class EmailClient {
    // basic checker adalah service untuk melakukan pengecekan spelling
    // berarti disini email client ingin menggunakan basic checker untuk mengecek spelling
//    SpellChecker basicChecker = new BasicChecker();
    private  BasicChecker basicChecker;

    // DI
    EmailClient() {
        this.basicChecker = new BasicChecker();
    }
    public void sendEmail(String emailMessage) {
        basicChecker.checkSpelling(emailMessage);
    }
}
