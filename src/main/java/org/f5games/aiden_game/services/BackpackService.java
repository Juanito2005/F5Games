package org.f5games.aiden_game.services;

import java.util.List;

import org.f5games.aiden_game.models.Backpack;
import org.f5games.aiden_game.repository.BackpackRepository;

public class BackpackService {

    private final BackpackRepository backpackRepository;

    public BackpackService(BackpackRepository backpackRepository) {
        this.backpackRepository = backpackRepository;
    }

    public List<Backpack> getAll() {
        return backpackRepository.findAll();
    }

    public void insertOne(Backpack backpack) {
        backpackRepository.insertOne(backpack);
    }

    public void updateOne(Long objectId, Backpack backpack) {
        backpackRepository.updateOne(objectId, backpack);
    }

    public void deleteOne(Long objectId) {
        backpackRepository.deleteOne(objectId);
    }

}
