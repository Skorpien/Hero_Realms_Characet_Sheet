package com.hrcard.domain;

import lombok.Data;

import java.util.List;

@Data
public class Ranger implements HeroClass {
    private CharacterClass characterClass = CharacterClass.Ranger;
    private final int hp = 58;
    private List<Card> skillsList;
    private List<Card> abilityList;
    private List<Card> treasureList;
}
