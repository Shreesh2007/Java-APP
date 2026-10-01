public class HospitalEmergencyMonitoring {
    static class EmergencyAlert extends Thread {
        EmergencyAlert() { 
        super("EmergencyAlert"); }
        public void run() {
            for (int i = 1; i <= 3; i++)
                System.out.println(getName() + " | Priority: " + getPriority() + " | Critical alert check " + i);
        }
    }

    static class VitalMonitor extends Thread {
        VitalMonitor() { 
        super("VitalMonitor"); }
        public void run() {
            for (int i = 1; i <= 3; i++)
                System.out.println(getName() + " | Priority: " + getPriority() + " | Vital signs check " + i);
        }
    }

    static class ReportGenerator extends Thread {
        ReportGenerator() { 
        super("ReportGenerator"); }
        public void run() {
            for (int i = 1; i <= 3; i++)
                System.out.println(getName() + " | Priority: " + getPriority() + " | Generating routine report " + i);
        }
    }

    public static void main(String[] args) {
        EmergencyAlert emergency = new EmergencyAlert();
        VitalMonitor vital = new VitalMonitor();
        ReportGenerator report = new ReportGenerator();
        emergency.setPriority(Thread.MAX_PRIORITY);
        vital.setPriority(Thread.NORM_PRIORITY);
        report.setPriority(Thread.MIN_PRIORITY);
        emergency.start();
        vital.start();
        report.start();
    }
}
