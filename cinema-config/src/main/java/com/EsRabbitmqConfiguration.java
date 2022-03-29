package com;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EsRabbitmqConfiguration {
    public static final String NORMAL_QUEUE_NAME = "normal.queue";
    public static final String NORMAL_EX_NAME = "normal.ex";
    public static final String NORMAL_ROUTING_KEY = "normal.routing";


    public static final String DEAD_QUEUE_NAME = "dead.queue";
    public static final String DEAD_EX_NAME = "dead.ex";
    public static final String DEAD_ROUTING_KEY = "dead.routing";


    @Bean
    public DirectExchange normalEx(){
        DirectExchange directExchange = new DirectExchange(NORMAL_EX_NAME);
        return  directExchange;
    }

    @Bean
    public Queue normalQueue(){
        return QueueBuilder
                .durable(NORMAL_QUEUE_NAME)
                .withArgument("x-dead-letter-exchange",DEAD_EX_NAME)
                .withArgument("x-dead-letter-routing-key",DEAD_ROUTING_KEY)
                .build();
    }


    @Bean
    public Binding normalBinding(){
        return BindingBuilder
                .bind(normalQueue())
                .to(normalEx())
                .with(NORMAL_ROUTING_KEY);
    }


    @Bean
    public DirectExchange deadEx(){
        DirectExchange directExchange = new DirectExchange(DEAD_EX_NAME);
        return  directExchange;
    }

    @Bean
    public Queue deadQueue(){
        return QueueBuilder.durable(DEAD_QUEUE_NAME).build();
    }


    @Bean
    public Binding deadBinding(){
        return BindingBuilder
                .bind(deadQueue())
                .to(deadEx())
                .with(DEAD_ROUTING_KEY);
    }

}
