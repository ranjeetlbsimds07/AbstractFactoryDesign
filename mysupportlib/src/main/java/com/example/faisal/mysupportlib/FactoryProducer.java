package com.example.faisal.mysupportlib;

/**
 * Created by faisal on 12/2/2015.
 */
public class FactoryProducer {
    public static AbstractFactory getInstance(String choice){
        if(choice.equals("Data")){
            return new DataFactory();
        }else if(choice.equals("Conn")){
            return new ConnectionFactory();
        }else {
            return null;
        }
    }
}
