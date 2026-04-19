package DP.ChainOfResponsibility.Route_Handler.handlers;

import DP.ChainOfResponsibility.Route_Handler.dto.Request;
import DP.ChainOfResponsibility.Route_Handler.dto.Response;
import DP.ChainOfResponsibility.Route_Handler.services.TokenService;
import DP.ChainOfResponsibility.Route_Handler.services.TokenSerciceImpl;

public class AuthenticationHandler implements RequestHandler{

    private RequestHandler nextHandler;
    private TokenService tokenService;

    public AuthenticationHandler(RequestHandler nextHandler){
        this.nextHandler = nextHandler;
        this.tokenService = new TokenSerciceImpl();
    }
    
    @Override
    public Response handle(Request request) {
        if(tokenService.validateToken(request.getToken())){
            return this.nextHandler.handle(request);
        }
        return null;
    }
}
