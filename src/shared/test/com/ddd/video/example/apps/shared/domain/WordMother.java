package com.ddd.video.example.apps.shared.domain;

import com.github.javafaker.Faker;

import java.util.UUID;

public class WordMother {

    public static String create() {
        return WordMother.randomName();
    }

    public static String randomName() {
        return Faker.instance().name().fullName();
    }

    public static String randomId() { return UUID.randomUUID().toString(); }

    public static String randomDuration () {
        return Faker.instance().rickAndMorty().character().toUpperCase();
    }

}
