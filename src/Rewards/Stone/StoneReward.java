package Rewards.Stone;

import Rewards.Abstraction.GameItem;

// Реализация награды Silver
public class StoneReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Stone"); // Вывод сообщения о получении серебра
    }
}
