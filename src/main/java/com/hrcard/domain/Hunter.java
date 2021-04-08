package com.hrcard.domain;

import lombok.Data;

import java.util.List;

@Data
public class Hunter implements HeroClass {
    private final int hp = 58;
    private List<Card> skillsList;
    private List<Card> abilityList;
    private List<Card> treasureList;
}
