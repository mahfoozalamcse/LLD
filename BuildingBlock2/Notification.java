package BuildingBlock2;
// 4. Abstract Classes & Methods
public abstract class Notification {
    
    protected String message;

    public Notification(String message) {
        this.message = message;
    }

    // abstract = must be implemented by subclass
    public abstract void send();
}



