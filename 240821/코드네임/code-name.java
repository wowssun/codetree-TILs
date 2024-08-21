import java.util.Scanner;

class AgentInfo {
    String codeName;
    int score;

    public AgentInfo(String codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AgentInfo [] agents = new AgentInfo[5];

        for (int i = 0; i < 5; i++) {
            String inputName = sc.next();
            int inputScore = sc.nextInt();
            agents[i] = new AgentInfo(inputName, inputScore);
        }

        int min = agents[0].score;
        int minIdx = 0;
        for (int i = 0; i < 5; i++) {
           if (agents[i].score < min) {
                minIdx = i;
           } else {
                minIdx = minIdx; 
           }
        }
        System.out.print(agents[minIdx].codeName + " " + agents[minIdx].score);

    }
}