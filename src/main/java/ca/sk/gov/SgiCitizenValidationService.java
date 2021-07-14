package ca.sk.gov;

public class SgiCitizenValidationService {
    public static boolean validateAge(int age) {
        return age > 0 && age < 120;
    }
}
