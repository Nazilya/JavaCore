package lesson1;

public class HomeWork {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new RunningTrack(200),
                new Wall(3),
                new RunningTrack(400),
                new Wall(5),
                new RunningTrack(800),
                new Wall(6)
        };
        Participant[] participants = {
                new Human(500,3),
                new Human(600,4),
                new Cat(300,6),
                new Cat(200,7),
                new Robot(700,8),
                new Robot(1000,10)
        };
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!participant.getStatus()) {
                    participant.overcomeObstacle(obstacle);
                }
            }
            System.out.println("\n");
        }
    }
}
