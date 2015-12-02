package com.example.faisal.mysupportlib;

/**
 * Created by faisal on 12/2/2015.
 */
public class DataFactory extends AbstractFactory{
    @Override
    IConnection getConnection(String lib) {
        return null;
    }

    @Override
    IData getData(String lib) {
        if(lib.equals("libone")){
            return new LibOneImplemantion();
        }else if(lib.equals("libtwo")){
            return new LibTwoImplemantion();
        }else {
            return null;
        }
    }
}
