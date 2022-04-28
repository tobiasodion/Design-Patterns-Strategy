package StrategyPattern;

public interface IAuthenticationStrategy {
    void authenticate(String username, String password);
}