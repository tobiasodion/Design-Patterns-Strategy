package StrategyPattern;

public class AuthProgram {
    private IAuthenticationStrategy authenticator;

    public AuthProgram(IAuthenticationStrategy authenticationStrategy){
        authenticator = authenticationStrategy;
    } 

    public void authenticate(String username, String password){
        authenticator.authenticate(username,password);
    }
}
