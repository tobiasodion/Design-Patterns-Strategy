import StrategyPattern.*;

public class Main {
    public static void main(String[] args){
        AuthProgram basicAuth = new AuthProgram(new BasicAuthentication());
        AuthProgram oAuth = new AuthProgram(new OAuthAuthentication());
        AuthProgram openIdAuth = new AuthProgram(new OpenIdAuthentication());

        basicAuth.authenticate("tobias", "1234");
        oAuth.authenticate("tobias", "1234");
        openIdAuth.authenticate("tobias", "1234");
    }
}
