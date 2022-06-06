package Utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerGenerator {
    private static Faker faker = new Faker(new Locale("pt-BR"));

    public static String getEmail(){
        return faker.internet().emailAddress();
    }

    public static String getFirstName(){
        return faker.name().firstName();
    }

    public static String getLastName(){
        return faker.name().lastName();
    }

    public static String getPassword(){
        return faker.pokemon().name();
    }

    public static String getAddress(){
        return faker.address().streetAddress();
    }

    public static String getCity(){
        return faker.address().city();
    }

    public static String getZipCode(){
        return faker.number().digits(5);
    }

    public static String getPhoneNumber(){
        return faker.phoneNumber().cellPhone();
    }
}
