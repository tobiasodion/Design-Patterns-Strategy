package StrategyPattern;

public class OAuthAuthentication implements IAuthenticationStrategy {
    public void authenticate(String username, String password){
        System.out.println("OAuth Authentication");
    }
}
