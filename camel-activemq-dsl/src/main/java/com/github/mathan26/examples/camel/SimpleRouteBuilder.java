//package com.github.mathan26.examples.camel;
//
//import org.apache.camel.builder.RouteBuilder;
//
//public class SimpleRouteBuilder  extends RouteBuilder {
//    public void configure() throws Exception {
//        from("file:D:/inputFolder").split().tokenize("\n").to("jms:queue:javainuse");
//    }
//}
