public class Cat extends Participant{

    private int runAbility;
    private int jumpAbility;
    private String name;
    boolean dead = false;

    public Cat(String name,int runAbility, int jumpAbility){
        this.name = name;
        this.runAbility = runAbility;
        this.jumpAbility = jumpAbility;
    }

    public void tryObstacle(Obstacles obstacles) {
        if(dead == false){
            if (obstacles.getDistance() != 0 && obstacles.getHeight() == 0) {
                run(obstacles);
            } else{
                jump(obstacles);
            }
        } else {
            System.out.println("Already dead :(");
        }
    }

    public boolean run (Obstacles obstacles){
        if (runAbility >= obstacles.getDistance()){
            System.out.printf("Cat %s has managed to overrun this treadmill %s meters long\n",name, obstacles.getDistance());
            return dead = false;
        } else {
            System.out.printf("Cat %s is dead because of the %s meters long treadmill :(\n", name, obstacles.getDistance());
            return dead = true;
        }
    }
    public boolean jump (Obstacles obstacles){
        if (jumpAbility >= obstacles.getHeight()){
            System.out.printf("Cat %s has managed to get over this wall %s meters high \n",name, obstacles.getHeight());
            return dead = false;
        } else{
            System.out.printf("Cat %s is dead because of this wall %s meters high \n",name, obstacles.getHeight());
            return dead = true;
        }
    }

    public void run (Treadmill treadmill){
        if (runAbility >= treadmill.getDistance()){
            System.out.printf("Cat %s has managed to overrun this treadmill\n",name);
        } else {
            System.out.printf("Cat %s is dead :(\n", name);
        }
    }
    public void jump (Wall wall){
        if (jumpAbility >= wall.getHeight()){
            System.out.printf("Cat %s has managed to get over this wall\n",name);
        } else{
            System.out.printf("Cat %s is dead :(\n", name);
        }
    }

    public int getRunAbility() {
        return runAbility;
    }

    public int getJumpAbility() {
        return jumpAbility;
    }
}
