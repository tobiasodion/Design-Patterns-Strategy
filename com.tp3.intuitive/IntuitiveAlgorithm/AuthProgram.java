package IntuitiveAlgorithm;

public class AuthProgram {
    private String authenticator;

    public AuthProgram(String authenticationStrategy){
        authenticator = authenticationStrategy;
    } 

    public void authenticate(String username, String password){
        if (authenticator == "Basic"){
            BasicAuthentication basicAuth = new BasicAuthentication();
            basicAuth.authenticate(username, password);
        }

        if (authenticator == "OAuth"){
            OAuthAuthentication oAuth = new OAuthAuthentication();
            oAuth.authenticate(username, password);
        }

        if (authenticator == "Digest"){
            DigestAuthentication digestAuth = new DigestAuthentication();
            digestAuth.authenticate(username, password);
        }
    }
}
