package com.example.rabbitmq.dummy;

import com.example.rabbitmq.publisher.Publisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DummyService {

    @Autowired
    private Publisher publisher;

    public void sendToRabbit(String message){
        System.out.println("Message will be send..." + message);
        this.publisher.send(message);
    }



}
