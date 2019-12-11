package pl.kodu.akademia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.kodu.akademia.model.Company;
import pl.kodu.akademia.repository.CompaniesRepository;
import pl.kodu.akademia.services.CompanyService;

import java.util.List;
import java.util.Random;

@Controller
public class MyFirstController {

    @Autowired
    CompanyService companyService;

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }

    @RequestMapping(value = "/nip", method = RequestMethod.GET)
    public String nipForm() {
        return "nip";
    }

    @RequestMapping(value = "/nip", method = RequestMethod.POST)
    public String nipFormSubmit(@RequestParam() String nipParameter, Model model) {
        List<Company> wyszukaneFirmy = CompaniesRepository.getCompaniesByNip(nipParameter);
        model.addAttribute("mojaListaFirm", wyszukaneFirmy);
        return "result";
    }

    @RequestMapping(value = "/regon", method = RequestMethod.GET)
    public String regonForm() {
        return "regon";
    }

    @RequestMapping(value = "/regon", method = RequestMethod.POST)
    public String regonFormSubmit(@RequestParam() String regonParameter) {
        System.out.println(regonParameter);
        return "result";
    }

    @RequestMapping(value = "/newCompany", method = RequestMethod.GET)
    public String krsForm() {
        return "krs";
    }

    @RequestMapping(value = "/newCompany", method = RequestMethod.POST)
    public String krsFormSubmit(@RequestParam() String newCompanyName,
                                @RequestParam() String newCompanyKrs,
                                @RequestParam() String newCompanyNip,
                                @RequestParam() String newCompanyRegon) {
        /*Random random = new Random();
        int id = random.nextInt(8999) + 1000;
        Company newCompany = new Company(id, newCompanyNip,
                newCompanyRegon, newCompanyKrs, newCompanyName);

        CompaniesRepository.addNewCompany(newCompany);*/
        Company newCompany = new Company(10, newCompanyNip,
                newCompanyRegon, newCompanyKrs, newCompanyName);

        this.companyService.saveCompany(newCompany);

        return "result";
    }

    @RequestMapping(value = "/nazwa", method = RequestMethod.GET)
    public String nazwaForm() {
        return "nazwa";
    }

    @RequestMapping(value = "/nazwa", method = RequestMethod.POST)
    public String nazwaFormSubmit(@RequestParam() String nazwaParameter, Model model) {
        List<Company> wyszukaneFirmy = CompaniesRepository.getCompaniesByName(nazwaParameter);
        model.addAttribute("mojaListaFirm", wyszukaneFirmy);
        return "result";
    }

}
