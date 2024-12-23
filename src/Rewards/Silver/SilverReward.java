package Rewards.Silver;

import Rewards.Abstraction.GameItem;

// Реализация награды Silver
public class SilverReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Silver"); // Вывод сообщения о получении серебра
    }
}
