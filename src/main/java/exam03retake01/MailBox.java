package exam03retake01;

import javax.script.ScriptEngine;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public List<Mail> getMails() {
        return mails;
    }

    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public List<Mail> findByCriteria(String criteria) {
        List<Mail> result = new ArrayList<>();
        String temp = nameOrEmail(criteria);
        for (Mail mail : mails) {
            if (criteria.startsWith("from:")) {
                if (mail.getFrom().getName().equals(temp) || mail.getFrom().getEmail().equals(temp)) {
                    result.add(mail);
                }
            } else if (criteria.startsWith("to:")) {
                if (validTo(mail, temp)) {
                    result.add(mail);
                }
            } else if (mail.getSubject().contains(criteria) || mail.getMessage().contains(criteria)) {
                result.add(mail);
            }
        }
        return result;
    }


    private boolean validTo(Mail mail, String str) {
        for (Contact contact : mail.getTo()) {
            if (contact.getName().equals(str) || contact.getEmail().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private String nameOrEmail(String criteria) {
        String temp = "";
        if (criteria.startsWith("from:")) {
            temp = criteria.substring(5);
        }
        if (criteria.startsWith("to:")) {
            temp = criteria.substring(3);
        }
        return temp;
    }
}
