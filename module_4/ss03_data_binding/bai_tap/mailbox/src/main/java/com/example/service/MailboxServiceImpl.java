package com.example.service;

import com.example.model.Mailbox;
import com.example.repository.IMailboxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailboxServiceImpl implements IMailboxService{
    @Autowired
    private IMailboxRepository mailboxRepository;
    @Override
    public Mailbox getMailbox() {
        return mailboxRepository.getMailbox();
    }

    @Override
    public void updateMailbox(Mailbox mailbox) {
         mailboxRepository.updateMailbox(mailbox);
    }
}
