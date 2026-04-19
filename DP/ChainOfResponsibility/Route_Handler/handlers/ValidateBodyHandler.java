package DP.ChainOfResponsibility.Route_Handler.handlers;

import DP.ChainOfResponsibility.Route_Handler.dto.Request;
import DP.ChainOfResponsibility.Route_Handler.dto.Response;

public class ValidateBodyHandler implements RequestHandler{

    private RequestHandler nextHandler;

    public ValidateBodyHandler(RequestHandler nextHandler){
        this.nextHandler = nextHandler;
    }
    @Override
    public Response handle(Request request) {
        this.nextHandler.handle(request);
        return null;
    }
}
