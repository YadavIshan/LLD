package DP.ChainOfResponsibility.Route_Handler.handlers;

import DP.ChainOfResponsibility.Route_Handler.dto.Request;
import DP.ChainOfResponsibility.Route_Handler.dto.Response;

public class FinishingHandler implements RequestHandler{

    private RequestHandler nextHandler;

    public FinishingHandler() {
        this.nextHandler = null;
    }

    public FinishingHandler(RequestHandler nextHandler){
        this.nextHandler = nextHandler;
    }
    @Override
    public Response handle(Request request) {
        System.out.println("Finishing the request");
        return null;
    }   
}
