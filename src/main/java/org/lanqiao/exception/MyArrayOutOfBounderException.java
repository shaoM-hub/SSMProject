package org.lanqiao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE,reason = "数组下标越界")
public class MyArrayOutOfBounderException extends RuntimeException{

}
