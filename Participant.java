public abstract class Participant {
    int runAbility;
    int jumpAbility;
    String name;
    boolean dead = false;

    public abstract void tryObstacle(Obstacles obstacle);
    public abstract boolean run (Obstacles obstacles);
    public abstract boolean jump (Obstacles obstacles);

}
