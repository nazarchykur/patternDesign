package com.company.behavioral.mediator.example_1;

public interface ChatMediator {
    void sendMessage(String msg, User user);

    void addUser(User user);
}
