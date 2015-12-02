package com.example.faisal.mysupportlib;

/**
 * Created by faisal on 12/2/2015.
 */
public abstract class AbstractFactory {
    abstract IConnection getConnection(String lib);
    abstract IData getData(String lib);
}
