package org.procamp.exception;

public class DAOSysException extends RuntimeException {
    public DAOSysException (String msg) {
        super(msg);
    }
    public DAOSysException () {
        super();
    }
}

