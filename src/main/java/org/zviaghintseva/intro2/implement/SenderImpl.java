package org.zviaghintseva.intro2.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zviaghintseva.intro2.interfaces.Receiver;
import org.zviaghintseva.intro2.interfaces.Sender;
@Component
public class SenderImpl implements Sender {
    private final Receiver receiver;

    @Autowired
    public SenderImpl(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public String sendMessage(String message) {
        return receiver.getMessage("Wired data transmission: " + message);
    }
}
