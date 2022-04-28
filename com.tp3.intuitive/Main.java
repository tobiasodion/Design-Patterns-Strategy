import IntuitiveAlgorithm.*;

public class Main {
    public static void main(String[] args){
        AuthProgram basicAuth = new AuthProgram("Basic");
        AuthProgram oAuth = new AuthProgram("OAuth");
        AuthProgram digestAuth = new AuthProgram("Digest");
  
        basicAuth.authenticate("tobias", "1234");
        oAuth.authenticate("tobias", "1234");
        digestAuth.authenticate("tobias", "1234");
    }
}
