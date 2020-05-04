package com.wangbo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR,reason = "wangboexception")
public class DefinedException extends Exception {
    int i = 1/0;
}
