package Core;

import Rewards.Abstraction.GameItem;

// Класс управления открытием наград
public class RewardManager {
    
    // Метод для открытия награды
    public void openReward(GameItem reward) {
        reward.open(); // Открытие награды
    }
}
