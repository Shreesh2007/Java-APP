import java.util.Scanner;
class Candidate {
    int candidateId;
    String name;
    int aptitude;
    int technical;
    int communication;

    Candidate(int candidateId, String name, int aptitude, int technical, int communication) {
        this.candidateId = candidateId;
        this.name = name;
        this.aptitude = aptitude;
        this.technical = technical;
        this.communication = communication;
    }

    int getTotalScore() {
        return aptitude + technical + communication;
    }

    void display() {
        System.out.println(candidateId + " " + name + " " + getTotalScore());
    }
}

public class MainCandidate {
    public static void main(String[] args) {
        //Creating the Objects
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Candidate[] candidates = new Candidate[n];

        //Taking the User Input
            for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int aptitude = sc.nextInt();
            int technical = sc.nextInt();
            int communication = sc.nextInt();
            candidates[i] = new Candidate(id, name, aptitude, technical, communication);
        }

        // Sorting the candidates
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int score1 = candidates[j].getTotalScore();
                int score2 = candidates[j + 1].getTotalScore();
                if (score1 < score2 ||
                    (score1 == score2 &&
                     candidates[j].candidateId >
                     candidates[j + 1].candidateId)) {
                    Candidate temp = candidates[j];
                    candidates[j] = candidates[j + 1];
                    candidates[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            candidates[i].display();
        }
        sc.close();
    }
}