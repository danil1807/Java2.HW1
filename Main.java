//Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса 
//(Изначально так и делал, но потом решил, что удобнее будет сформировать все в один класс участников).

// Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны
// выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль
// (успешно пробежал, не смог пробежать и т.д.).
//Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор
// препятствий.
//* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и
// прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.

public class Main {
    public static void main(String[] args) {

        Participant[] participants = new Participant[3];
        {
            participants[0] = new Man("Petya", 100, 2);
            participants[1] = new Cat("Barsik", 20, 3);
            participants[2] = new Robot("Walli", 10000, 1);
        }
        Obstacles[] obstacles = new Obstacles[3];
        {
            obstacles[0] = new Treadmill(50);
            obstacles[1] = new Treadmill(120);
            obstacles[2] = new Wall(4);
        }

        for  (int i = 0; i < participants.length; i++){
            for  (int j = 0; j < obstacles.length; j++){
                    participants[i].tryObstacle(obstacles[j]);
                }
            }
        }
    }


