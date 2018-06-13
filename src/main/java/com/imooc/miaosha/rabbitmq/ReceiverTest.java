package com.imooc.miaosha.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RabbitListener(queues = "hello")
public class ReceiverTest
{


    @RabbitHandler
    public void process(String hello)
    {
        System.out.println("Receiver : " + hello);
    }


}
