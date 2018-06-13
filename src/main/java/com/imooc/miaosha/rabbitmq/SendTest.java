package com.imooc.miaosha.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author JohnsonZheng
 */
@Service
public class SendTest
{
    @Autowired
    AmqpTemplate amqpTemplate;

    public void send()
    {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        amqpTemplate.convertAndSend("hello", context);
    }
}
