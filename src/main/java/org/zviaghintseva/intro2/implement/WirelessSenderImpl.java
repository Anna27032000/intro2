package org.zviaghintseva.intro2.implement;

import org.zviaghintseva.intro2.interfaces.Receiver;
import org.zviaghintseva.intro2.interfaces.Sender;

public class WirelessSenderImpl implements Sender {
    private final Receiver receiver;

    public WirelessSenderImpl(Receiver receiver){
        this.receiver=receiver;

    }

    @Override
    public String sendMessage(String message) {
        return receiver.getMessage("Wireless data transmission: "+ message);
    }
}