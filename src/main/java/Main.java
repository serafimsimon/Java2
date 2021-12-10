import interfaces.Activity;
import models.*;


public class Main {


    public static void main(String[] args) {

        Man Man1 = new Man("Петя", 100, 1);
        Man Man2 = new Man("Коля", 300, 2);
        Robot Robot2 = new Robot("IC200", 1000, 10);
        Cat Cat2 = new Cat("Мурзик", 500, 5);

        /*Создаем массив участников */
        Activity[] teamMembers = new Activity[4];
        teamMembers[0] = Man1;
        teamMembers[1] = Man2;
        teamMembers[2] = Robot2;
        teamMembers[3] = Cat2;

        /*Создаем массив "бегать" для всех участников */
        int[] runArray;
        runArray = new int[4];
        runArray[0] = Man1.getRunway();
        runArray[1] = Man2.getRunway();
        runArray[2] = Robot2.getRunway();
        runArray[3] = Cat2.getRunway();

        /*Создаем массив "прыгать" для всех участников */
        int[] jumpArray;
        jumpArray = new int[4];
        jumpArray[0] = Man1.getJumpway();
        jumpArray[1] = Man2.getJumpway();
        jumpArray[2] = Robot2.getJumpway();
        jumpArray[3] = Cat2.getJumpway();

        /*Создаем команду */
        Team team = new Team(" 'Чемпионы' ", teamMembers);

        /*Выводим информацию о команде */
        System.out.println(team);
        System.out.println();

        /*Создаем массив препятствий*/
        Trial[] Barrier = new Trial[2];
        Barrier[0] = new Wall(5);
        Barrier[1] = new RunTrack(600);

        /*Создаем полосу препятствий */
        Course course1 = new Course(Barrier);


        /*Заставляем всех участников пройти полосу препятствий*/

        for (int i = 0; i < team.getTeamMembers().length; i++) {
            for (int j = 0; j < course1.getBarriers().length; j++) {
                if (Barrier[j] instanceof Wall) {
                    System.out.println(teamMembers[i]);

                    if (jumpArray[i] >= ((Wall) Barrier[j]).getWallsize()) {
                        ((Wall) Barrier[j]).doJumping(team.getTeamMembers()[i]);
                        System.out.println();

                        if (Barrier[j] instanceof RunTrack) {
                            System.out.println(teamMembers[i]);
                        }
                    } else {
                        System.out.println("Участник НЕ перепрыгнул через стену и выбывает из соревнования");
                        System.out.println();
                        break;}
                }
                if (Barrier[j] instanceof RunTrack) {
                       System.out.println(teamMembers[i]);

                    if (runArray[i] >= ((RunTrack) Barrier[j]).getRunTracksize()) {
                        ((RunTrack) Barrier[j]).doRunning(team.getTeamMembers()[i]);
                        System.out.println();
                        System.out.println("Участник " + teamMembers[i] + " успешно прошел полосу препятствий");
                        System.out.println();
                    } else {
                        System.out.println("Участник НЕ пробежал дистанцию и выбывает из соревнования");
                        System.out.println();
                    }

                }
            }
        }
    }
}


