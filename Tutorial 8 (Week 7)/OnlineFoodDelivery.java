public class OnlineFoodDelivery {
    static class OrderProcessing extends Thread {
        OrderProcessing() { super("OrderProcessing"); }
        public void run() {
            for (int i = 1; i <= 3; i++)
                System.out.println(getName() + " | Priority: " + getPriority() + " | Processing customer order " + i);
        }
    }

    static class DeliveryTracking extends Thread {
        DeliveryTracking() { super("DeliveryTracking"); }
        public void run() {
            for (int i = 1; i <= 3; i++)
                System.out.println(getName() + " | Priority: " + getPriority() + " | Tracking delivery location " + i);
        }
    }

    static class Notification extends Thread {
        Notification() { super("Notification"); }
        public void run() {
            for (int i = 1; i <= 3; i++)
                System.out.println(getName() + " | Priority: " + getPriority() + " | Sending notification " + i);
        }
    }
    public static void main(String[] args) {
        OrderProcessing order = new OrderProcessing();
        DeliveryTracking tracking = new DeliveryTracking();
        Notification notification = new Notification();
        order.setPriority(Thread.MAX_PRIORITY);
        tracking.setPriority(Thread.NORM_PRIORITY);
        notification.setPriority(Thread.MIN_PRIORITY);
        order.start();
        tracking.start();
        notification.start();
    }
}
