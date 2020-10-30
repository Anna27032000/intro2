package org.zviaghintseva.intro2.implement;

import org.springframework.stereotype.Component;
import org.zviaghintseva.intro2.interfaces.Receiver;
@Component
public class ReceiverImpl implements Receiver {
    @Override
    public String getMessage(String message) {
        return message;
    }
}
