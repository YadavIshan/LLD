package DP.ChainOfResponsibility.Route_Handler.handlers;

import DP.ChainOfResponsibility.Route_Handler.dto.Request;
import DP.ChainOfResponsibility.Route_Handler.dto.Response;

public class AuthorizationHandler implements RequestHandler{

    private RequestHandler nextHandler;

    public AuthorizationHandler(RequestHandler nextHandler){
        this.nextHandler = nextHandler;
    }
    @Override
    public Response handle(Request request) {
        this.nextHandler.handle(request);
        //Authorization logic goes here
        return null;
    }
}
