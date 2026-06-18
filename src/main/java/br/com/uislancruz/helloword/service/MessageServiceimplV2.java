package br.com.uislancruz.helloword.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("v2")
public class MessageServiceimplV2 implements IMessageService{
    @Override
    public String sayCustomMessage(String original) {
        return original.replace(" ", "-");
    }
}
