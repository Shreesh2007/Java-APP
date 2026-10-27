interface BasicSecurity {
    void login();
    void logout();
}

interface AdvancedSecurity extends BasicSecurity {
    void fingerprintAuthentication();
    void faceRecognition();
}

class BankingApplication implements AdvancedSecurity {
    @Override public void login() {
        System.out.println("Basic login successful.");
    }
    @Override public void logout() {
        System.out.println("Logged out successfully.");
    }
    @Override public void fingerprintAuthentication() {
        System.out.println("Fingerprint authentication successful.");
    }
    @Override public void faceRecognition() {
        System.out.println("Face recognition successful.");
    }
}

public class Main3 {
    public static void main(String[] args) {
        BankingApplication app = new BankingApplication();
        app.login();
        app.fingerprintAuthentication();
        app.faceRecognition();
        app.logout();
    }
}