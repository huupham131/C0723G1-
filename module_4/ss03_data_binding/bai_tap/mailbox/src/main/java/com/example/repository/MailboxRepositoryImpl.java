package com.example.repository;

import com.example.model.Mailbox;
import org.springframework.stereotype.Repository;

@Repository
public class MailboxRepositoryImpl implements IMailboxRepository{
    private static Mailbox mailbox = new Mailbox();
    static {
        mailbox.setLanguage("Chinese");
        mailbox.setPageSize(25);
        mailbox.setSpamsFilter(false);
        mailbox.setSignature("Thor \nKing,Asgard");
    }
    @Override
    public Mailbox getMailbox() {
        return mailbox;
    }

    @Override
    public void updateMailbox(Mailbox mailbox1) {
        mailbox.setLanguage(mailbox1.getLanguage());
        mailbox.setPageSize(mailbox1.getPageSize());
        mailbox.setSpamsFilter(mailbox1.isSpamsFilter());
        mailbox.setSignature(mailbox1.getSignature());
    }
}
