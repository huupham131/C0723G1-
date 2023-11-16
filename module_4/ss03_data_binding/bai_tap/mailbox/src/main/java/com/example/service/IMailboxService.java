package com.example.service;

import com.example.model.Mailbox;

public interface IMailboxService {
    Mailbox getMailbox();
    void updateMailbox(Mailbox mailbox);
}
