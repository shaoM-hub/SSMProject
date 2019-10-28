package org.lanqiao.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class exception {
    @ExceptionHandler({ArithmeticException.class})
    public ModelAndView MyException(Exception ex){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("ex",ex);
        return modelAndView;
    }

//    @ExceptionHandler({ArrayIndexOutOfBoundsException.class})
//    public ModelAndView arrayIndexOut(Exception ex){
//        ModelAndView modelAndView = new ModelAndView("error");
//        modelAndView.addObject("ex",ex);
//        return modelAndView;
//    }

}
