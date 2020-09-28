package org.zviaghintseva.intro2.implement;

import org.zviaghintseva.intro2.interfaces.Receiver;
import org.zviaghintseva.intro2.interfaces.Sender;

public class SenderImpl implements Sender {
    private final Receiver receiver;

    public SenderImpl(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public String sendMessage(String message) {

        return receiver.getMessage("Wired data transmission: " + message);
    }
}
