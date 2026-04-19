package DP.ChainOfResponsibility.Route_Handler.controller;

import DP.ChainOfResponsibility.Route_Handler.dto.Request;
import DP.ChainOfResponsibility.Route_Handler.schema.Todo;
import DP.ChainOfResponsibility.Route_Handler.factory.RequestHandlerFactory;
import DP.ChainOfResponsibility.Route_Handler.handlers.RequestHandler;

public class TodoController {
    
    public Todo createTodo(Request request){
        RequestHandler requestHandler = RequestHandlerFactory.getHandlerForCreateTodo();
        requestHandler.handle(request);
        return new Todo();   
    }

}
