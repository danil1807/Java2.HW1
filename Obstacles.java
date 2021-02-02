public abstract class Obstacles  {
    int height;
    int distance;
    int obstacle;

    public Obstacles(Wall height){
        this.height = obstacle;
    }

    public Obstacles(Treadmill distance){
        this.distance = obstacle;
    }

    public Obstacles(int obstacle) {
        this.obstacle = obstacle;
    }

    public int getObstacle() {
        return obstacle;
    }

    public int getHeight() {
        return height;
    }

    public int getDistance() {
        return distance;
    }
}
