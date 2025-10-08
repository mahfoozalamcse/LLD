package BuildingBlock2;


public class EmailNotification extends Notification {
    public EmailNotification(String message) { super(message); }

    @Override
    public void send() {
        System.out.println("Sending Email: " + message);
    }
} 

