package com.hrcard.domain;

import lombok.Data;

import java.util.List;

@Data
public class HeroCard {
    private String heroName;
    private int hp;
    private HeroClass heroClass;
    private List<Card> abilityCards;
    private List<Card> skillCards;
    private List<Treasure> treasures;
}
