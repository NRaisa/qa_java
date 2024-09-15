package com.example;

import java.util.List;

public class Alex extends Lion{
    private final String placeOfLiving = "Нью-Йоркский зоопарк";
    private final List<String> friends = List.of("Марти", "Глория", "Мелман");

    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return friends;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }
}
