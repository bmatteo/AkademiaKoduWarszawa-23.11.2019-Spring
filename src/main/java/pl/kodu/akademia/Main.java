package pl.kodu.akademia;

import pl.kodu.akademia.model.Company;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company(1, "123", "123", "123", "NA");
        Company company2 = company1;

        company2.setId(2);

        System.out.println(company1.getId());
        System.out.println(company2.getId());


        String a = "A";
        String b = "A";

        b = b + "B";

        System.out.println(a);
        System.out.println(b);
    }
}
