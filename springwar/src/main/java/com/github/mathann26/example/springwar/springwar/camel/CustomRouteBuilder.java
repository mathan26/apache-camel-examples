package com.github.mathann26.example.springwar.springwar.camel;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomRouteBuilder extends RouteBuilder {


    @Override
    public void configure() throws Exception {

//        deadLetterChannel("jms:queue:DLQ");

        errorHandler(deadLetterChannel("jms:queue:DLQ")); // move to deadLetterQueue if error occurs

        log.info("CamelRouteBuilder configure");
        from("jms:queue:test")
                .description("Camel Listens to the Local JMS queue")
//              .throwException(new IllegalArgumentException("Forced"))
                .to("jms:queue:ExpiryQueue");
    }
}
