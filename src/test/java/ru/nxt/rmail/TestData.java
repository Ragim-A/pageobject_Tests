package ru.nxt.rmail;

import Utils.RandomGenerator;
import com.github.javafaker.Faker;
public class TestData {
    static Faker faker = new Faker();

    public final static
    String firstName = faker.gameOfThrones().dragon();
    static String lastName = faker.funnyName().name();
    static String Gender = RandomGenerator.randomGender();
    static String email = faker.internet().emailAddress();
    static String Tel = faker.number().digits(10);
    static String Subject = RandomGenerator.randomSubject();
    static String Hobbie = RandomGenerator.randomHobby();
    static String Adress = faker.chuckNorris().fact();
    static String State = "NCR";
    static String City = "Delhi";
    static String Date= String.valueOf(faker.number().numberBetween(1,28));
    static String Month= RandomGenerator.randomMonths();
    static String Year = String.valueOf(faker.number().numberBetween(1950,2000));
    static String FileName = RandomGenerator.randomFile();
}
