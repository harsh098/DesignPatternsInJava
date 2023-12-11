public class MailService {
    public void sendmail(String mail){
        this.authenticate();
        this.connect(1);
        System.out.printf("\n%s\n", mail);
        this.disconnect();
    }

    private void disconnect() {
        System.out.println("Disconnecting");
    }

    private void authenticate() {
        System.out.println("Authenticating....");
    }

    private void connect(int timeout) {
        System.out.println("Connecting...");
    }

}
