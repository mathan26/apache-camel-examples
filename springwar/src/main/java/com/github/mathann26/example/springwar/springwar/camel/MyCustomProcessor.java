package com.github.mathann26.example.springwar.springwar.camel;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.apache.camel.Exchange;

//@Log4j2
//@Log4j
public class MyCustomProcessor implements org.apache.camel.Processor {
    @Override
    public void process(Exchange exchange) throws Exception {

//        log.info(exchange.getException().getMessage());
    }
}
