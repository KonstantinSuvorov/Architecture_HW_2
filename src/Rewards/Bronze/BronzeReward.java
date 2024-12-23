package Rewards.Bronze;

import Rewards.Abstraction.GameItem;

// Реализация награды Bronze
public class BronzeReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Bronze"); // Вывод сообщения о получении бронзы
    }
}
