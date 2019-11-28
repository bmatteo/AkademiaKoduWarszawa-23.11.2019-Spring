package pl.kodu.akademia.repository;

import pl.kodu.akademia.model.Company;

import java.util.ArrayList;
import java.util.List;

public class CompaniesRepository {
    private static List<Company> companiesList = new ArrayList<>();

    public static void addNewCompany(Company company) {
        companiesList.add(company);
    }

    static {
        Company c1 = new Company(1, "1231", "0981", "0192831", "ABC");
        Company c2 = new Company(2, "1232", "0982", "0192832", "BCD");
        Company c3 = new Company(3, "1233", "0983", "0192833", "CDE");
        Company c4 = new Company(4, "1234", "0984", "0192834", "DEF");
        Company c5 = new Company(5, "1235", "0985", "0192835", "EFG");
        Company c6 = new Company(6, "1236", "0986", "0192836", "FGH");
        Company c7 = new Company(7, "1237", "0987", "0192837", "GHI");
        Company c8 = new Company(8, "1238", "0988", "0192838", "HIJ");
        Company c9 = new Company(9, "1239", "0989", "0192839", "JIK");
        Company c10 = new Company(10, "12310", "09810", "01928310", "IKL");

        companiesList.add(c1);
        companiesList.add(c2);
        companiesList.add(c3);
        companiesList.add(c4);
        companiesList.add(c5);
        companiesList.add(c6);
        companiesList.add(c7);
        companiesList.add(c8);
        companiesList.add(c9);
        companiesList.add(c10);
    }

    public static List<Company> getCompaniesByNip(String nip) {
        List<Company> result = new ArrayList<>();
        for (Company company : companiesList) {
            if (company.getNip().equals(nip)) {
                result.add(company);
            }
        }

        return result;
    }

    public static List<Company> getCompaniesByRegon(String regon) {
        List<Company> result = new ArrayList<>();
        for (Company company : companiesList) {
            if (company.getRegon().equals(regon)) {
                result.add(company);
            }
        }

        return result;
    }

    public static List<Company> getCompaniesByKrs(String krs) {
        List<Company> result = new ArrayList<>();
        for (Company company : companiesList) {
            if (company.getKrs().equals(krs)) {
                result.add(company);
            }
        }

        return result;
    }

    public static List<Company> getCompaniesByName(String name) {
        List<Company> result = new ArrayList<>();
        for (Company company : companiesList) {
            if (company.getNazwa().equals(name)) {
                result.add(company);
            }
        }

        return result;
    }
}