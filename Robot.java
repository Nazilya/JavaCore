package lesson1;

public class Robot implements Participant {
    public boolean lost;
    private final int runLimit;
    private final int jumpLimit;

    public Robot(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }
    @Override
    public boolean getStatus() {
        return this.lost;
    }
    @Override
    public void run(RunningTrack runningTrack) {
        if (runningTrack.length <= runLimit) {
            System.out.printf("Robot overcame an obstacle - %s\n", runningTrack);
        } else {
            System.out.printf("Robot can't overcame an obstacle - %s\n", runningTrack);
            lost = true;
        }
    }
    @Override
    public void jump(Wall wall) {
        if (wall.height <= jumpLimit) {
            System.out.printf("Robot overcame an obstacle - %s\n", wall);
        } else {
            System.out.printf("Robot can't overcame an obstacle - %s\n", wall);
            lost = true;
        }
    }
}
