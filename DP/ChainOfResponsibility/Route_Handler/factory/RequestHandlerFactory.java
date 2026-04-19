package DP.ChainOfResponsibility.Route_Handler.factory;

import DP.ChainOfResponsibility.Route_Handler.handlers.RequestHandler;
import DP.ChainOfResponsibility.Route_Handler.handlers.ValidateParamsHandler;
import DP.ChainOfResponsibility.Route_Handler.handlers.ValidateBodyHandler;
import DP.ChainOfResponsibility.Route_Handler.handlers.AuthenticationHandler;
import DP.ChainOfResponsibility.Route_Handler.handlers.AuthorizationHandler;
import DP.ChainOfResponsibility.Route_Handler.handlers.FinishingHandler;

public class RequestHandlerFactory {
    public static RequestHandler getHandlerForCreateTodo(){
        return new ValidateParamsHandler(
            new ValidateBodyHandler(
                new AuthenticationHandler(
                    new AuthorizationHandler(
                        new FinishingHandler()
                    )
                )
            )
        );
    }
}
