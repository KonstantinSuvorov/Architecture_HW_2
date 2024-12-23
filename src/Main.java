//package Core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Core.RewardManager;
import Rewards.Abstraction.GameItem;
import Rewards.Glass.GlassReward;
import Rewards.Gold.GolgReward;
import Rewards.Silver.SilverReward;
import Rewards.Bronze.BronzeReward;
import Rewards.Stone.StoneReward;

// Главный класс запуска программы
public class Main {
    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();

        // Список генераторов наград
        List<GameItem> rewards = new ArrayList<>();
        rewards.add(new GolgReward());     // Золото
        rewards.add(new SilverReward());   // Серебро
        rewards.add(new BronzeReward());   // Бронза
        rewards.add(new StoneReward());    // Кирпич
        rewards.add(new GlassReward());    // Стекло
        // Менеджер наград
        RewardManager manager = new RewardManager();

        // Цикл открытия наград
        for (int i = 0; i < 10; i++) {
            int index = Math.abs(random.nextInt() % 5); // Случайный выбор награды
            GameItem reward = rewards.get(index);

            // Открываем награду через менеджер
            manager.openReward(reward);
        }
    }

}
