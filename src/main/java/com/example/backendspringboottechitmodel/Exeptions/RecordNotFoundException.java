package com.example.backendspringboottechitmodel.Exeptions;

public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException() {super(); }

    public RecordNotFoundException(String message) {super(message);}
}
