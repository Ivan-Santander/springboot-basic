package com.app.test11.controller;


import com.app.test11.model.Persona;
import com.app.test11.repo.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @Autowired
    private IPersonaRepo repo;
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        Persona p = new Persona();
        p.setId(2);
        p.setNombre("ARIS2");
        repo.save(p);
        return "greeting";

    }

    @GetMapping("/user")
    public String user(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "user";
    }

    @GetMapping("/listar")
    public String greeting(Model model) {
        model.addAttribute("personas", repo.findAll());
        return "greeting";
    }
}
