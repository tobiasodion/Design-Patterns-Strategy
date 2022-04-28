package StrategyPattern;

public class OpenIdAuthentication implements IAuthenticationStrategy {
    public void authenticate(String username, String password){
        System.out.println("OpenID Authentication");
    }
}
