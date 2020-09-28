package org.zviaghintseva.intro2.implement;

import org.zviaghintseva.intro2.interfaces.Receiver;

public class ReceiverImpl implements Receiver {
    @Override
    public String getMessage(String message) {
        return message;
    }
}
