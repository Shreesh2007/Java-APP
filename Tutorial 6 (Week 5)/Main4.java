interface Confidential {}
class Report {}
class PublicDocument {}
class FinancialReport implements Confidential {}
class PersonalDocument implements Confidential {}


public class Main4 {
    static void checkConfidential(Object document) {
        if (document instanceof Confidential) System.out.println("Document is Confidential.");
        else System.out.println("Document is Not Confidential.");
    }

    public static void main(String[] args) {
        Report r = new Report();
        PublicDocument p = new PublicDocument();
        FinancialReport f = new FinancialReport();
        PersonalDocument d = new PersonalDocument();
        checkConfidential(r);
        checkConfidential(p);
        checkConfidential(f);
        checkConfidential(d);
    }
}