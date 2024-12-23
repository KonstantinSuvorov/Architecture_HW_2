package Rewards.Gold;

import Rewards.Abstraction.GameItem;

// Реализация награды Gold
public class GolgReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Gold"); // Вывод сообщения о получении золота
    }
}
