package DP.ChainOfResponsibility.Route_Handler.handlers;

import DP.ChainOfResponsibility.Route_Handler.dto.Request;
import DP.ChainOfResponsibility.Route_Handler.dto.Response;

public class ValidateParamsHandler implements RequestHandler{

    private RequestHandler nextHandler;

    public ValidateParamsHandler(RequestHandler nextHandler){
        this.nextHandler = nextHandler;
    }
    @Override
    public Response handle(Request request) {
        this.nextHandler.handle(request);
        return null;
    }
}
