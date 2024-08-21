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

        int minIdx = 0;
        for (int i = 1; i < 5; i++) {
           if (agents[minIdx].score > agents[i].score) {
                minIdx = i;
           } 
        }

        System.out.print(agents[minIdx].codeName + " " + agents[minIdx].score);
    }
}