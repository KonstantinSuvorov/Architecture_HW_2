package Rewards.Glass;

import Rewards.Abstraction.GameItem;

// Реализация награды Silver
public class GlassReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Glass"); // Вывод сообщения о получении серебра
    }
}
