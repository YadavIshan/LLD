package DP.ChainOfResponsibility.Route_Handler.handlers;

import DP.ChainOfResponsibility.Route_Handler.dto.Request;
import DP.ChainOfResponsibility.Route_Handler.dto.Response;

public interface RequestHandler {
    /**
     * What to do in handler goes here
     * @param request
     * @return
     */
    Response handle(Request request);
}
