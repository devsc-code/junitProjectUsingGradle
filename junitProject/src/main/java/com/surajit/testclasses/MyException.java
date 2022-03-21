package com.surajit.testclasses;

public class MyException extends Exception{
    public String getMessage(){
        return "This is a custom Exception";
    }
}
