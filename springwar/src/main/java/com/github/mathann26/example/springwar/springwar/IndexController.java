package com.github.mathann26.example.springwar.springwar;


import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@RestController
public class IndexController {

    private static Logger log = Logger.getLogger(IndexController.class.getName());

    @GetMapping("/greet")
    public String greet(){
        sendDataToQueue();
        log.info("WELCOME!");
        return "Hello world from wildfly!";
    }

    private void sendDataToQueue() {
        try {
            InitialContext ic = new InitialContext();
            ConnectionFactory cf = (ConnectionFactory)ic.lookup("ConnectionFactory");
            Queue orderQueue = (Queue)ic.lookup("java:/jms/queue/test");
            Connection connection = cf.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer producer = session.createProducer(orderQueue);
            MessageConsumer consumer = session.createConsumer(orderQueue);
            connection.start();
            TextMessage message = session.createTextMessage("This is an order");
            producer.send(message);
           log.info("Message send  successfully!");
        } catch (NamingException | JMSException e) {
            log.info("ERROR: "+e);
        }
    }
}
