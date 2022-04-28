package StrategyPattern;

public class BasicAuthentication implements IAuthenticationStrategy{
    public void authenticate(String username, String password){
        System.out.println("Basic Authentication");
    }
}