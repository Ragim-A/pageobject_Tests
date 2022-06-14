package ru.nxt.rmail;

import utils.RandomGenerator;
import com.github.javafaker.Faker;
public class TestData {
    static Faker faker = new Faker();

    public final

    static String firstName = faker.gameOfThrones().dragon();
    static String lastName = faker.funnyName().name();
    static String gender = RandomGenerator.randomGender();
    static String email = faker.internet().emailAddress();
    static String tel = faker.number().digits(10);
    static String subject = RandomGenerator.randomSubject();
    static String hobbie = RandomGenerator.randomHobby();
    static String adress = faker.chuckNorris().fact();
    static String state = "NCR";
    static String city = "Delhi";
    static String date= String.valueOf(faker.number().numberBetween(1,28));
    static String month= RandomGenerator.randomMonths();
    static String year = String.valueOf(faker.number().numberBetween(1950,2000));
    static String fileName = RandomGenerator.randomFile();
}
