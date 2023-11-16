package com.example.repository;

import com.example.model.Mailbox;

public interface IMailboxRepository {
    Mailbox getMailbox();
    void updateMailbox(Mailbox mailbox);
}
