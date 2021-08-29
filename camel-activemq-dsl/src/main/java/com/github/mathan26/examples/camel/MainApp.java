package com.github.mathan26.examples.camel;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import javax.jms.ConnectionFactory;

public class MainApp {
    public static void main(String[] args) throws Exception {
//        SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();
//        CamelContext ctx = new DefaultCamelContext();
//
//        //configure jms component
//        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://0.0.0.0:61616");
//        ctx.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
//
//        try {
//            ctx.addRoutes(routeBuilder);
//            ctx.start();
//            Thread.sleep(5 * 60 * 1000);
//            ctx.stop();
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }

        ApplicationContext appContext = new ClassPathXmlApplicationContext(
                "camel-context.xml");
//        CamelContext camelContext = SpringCamelContext.springCamelContext(appContext, false);
//        try {
//            camelContext.start();
//        } finally {
//            camelContext.stop();
//        }
    }

}
