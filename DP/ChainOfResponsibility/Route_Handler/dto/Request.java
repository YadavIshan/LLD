package DP.ChainOfResponsibility.Route_Handler.dto;

import java.util.Optional;

public class Request {
    private String requestType;
    private String route;
    Optional<Object> body;
    private String token;
    private String params;

    public Request(String requestType, String route, Optional<Object> body, String token, String params) {
        this.requestType = requestType;
        this.route = route;
        this.body = body;
        this.token = token;
        this.params = params;
    }

    public String getRequestType() {
        return requestType;
    }

    public String getRoute() {
        return route;
    }

    public Optional<Object> getBody() {
        return body;
    }

    public String getToken() {
        return token;
    }

    public String getParams() {
        return params;
    }

}
