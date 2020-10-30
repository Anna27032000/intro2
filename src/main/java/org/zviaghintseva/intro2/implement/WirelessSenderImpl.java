package org.zviaghintseva.intro2.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zviaghintseva.intro2.interfaces.Receiver;
import org.zviaghintseva.intro2.interfaces.Sender;

@Component
public class WirelessSenderImpl implements Sender {
    private final Receiver receiver;

    @Autowired
    public WirelessSenderImpl(Receiver receiver){
        this.receiver=receiver;

    }

    @Override
    public String sendMessage(String message) {
        return receiver.getMessage("Wireless data transmission: "+ message);
    }
}