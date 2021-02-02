//Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны
// выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль
// (успешно пробежал, не смог пробежать и т.д.).
//Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор
// препятствий.
//* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и
// прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.


public class Man extends Participant{
    private int runAbility;
    private int jumpAbility;
    private String name;
    boolean dead = false;


    public Man(String name,int runAbility, int jumpAbility){
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
            System.out.printf("%s has managed to overrun this treadmill %s meters long\n",name, obstacles.getDistance());
            return dead = false;
        } else {
            System.out.printf("%s is dead because of the %s meters long treadmill :(\n", name, obstacles.getDistance());
            return dead = true;
        }
    }

    public boolean jump (Obstacles obstacles){
        if (jumpAbility >= obstacles.getHeight()){
            System.out.printf("%s has managed to get over this wall %s meters high \n",name, obstacles.getHeight());
            return dead = false;
        } else{
            System.out.printf("%s is dead because of this wall %s meters high \n",name, obstacles.getHeight());
            return dead = true;
        }
    }


    public void run (Treadmill treadmill){
        if (runAbility >= treadmill.getDistance()){
            System.out.printf("%s has managed to overrun this treadmill\n",name);
        } else {
            System.out.printf("%s is dead :(\n", name);
        }
    }
    public void jump (Wall wall){
        if (jumpAbility >= wall.getHeight()){
            System.out.printf("%s has managed to get over this wall\n",name);
        } else{
            System.out.printf("%s is dead :(\n", name);
        }
    }


    public int getRunAbility() {
        return runAbility;
    }

    public int getJumpAbility() {
        return jumpAbility;
    }
}
