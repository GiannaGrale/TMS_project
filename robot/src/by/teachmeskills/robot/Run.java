package src.by.teachmeskills.robot;

import src.by.teachmeskills.robot.hands.SamsungHand;
import src.by.teachmeskills.robot.hands.SonyHand;
import src.by.teachmeskills.robot.hands.ToshibaHand;
import src.by.teachmeskills.robot.heads.SamsungHead;
import src.by.teachmeskills.robot.heads.SonyHead;
import src.by.teachmeskills.robot.heads.ToshibaHead;
import src.by.teachmeskills.robot.legs.SamsungLeg;
import src.by.teachmeskills.robot.legs.SonyLeg;
import src.by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot robot1 = new Robot(new ToshibaHead(2000), new SonyHand(1500), new SamsungLeg(1300));
        robot1.action();
        robot1.getPrice();

        Robot robot2 = new Robot(new SamsungHead(1800), new ToshibaHand(1400), new SonyLeg(1500));
        robot2.action();
        robot2.getPrice();

        Robot robot3 = new Robot(new SonyHead(2200), new SamsungHand(1550), new ToshibaLeg(1450));
        robot3.action();
        robot3.getPrice();


        if (robot1.getPrice() > robot2.getPrice() & robot1.getPrice() > robot3.getPrice()) {
            System.out.println("Самый дорогой робот под номером 1! \n");
        } else if (robot2.getPrice() > robot1.getPrice() & robot2.getPrice() > robot3.getPrice()) {
            System.out.println("Самый дорогой робот под номером 2! \n");
        } else {
            System.out.println("Самый дорогой робот под номером 3! \n");
        }
    }
}