package com.app.test11.rest;

import com.app.test11.model.Persona;
import com.app.test11.repo.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class DemoRestController {
    @Autowired
    private IPersonaRepo repo;

    @GetMapping
    public List<Persona> read(){
        return repo.findAll();
    }

    @PostMapping
    public void create(@RequestBody Persona per){
        repo.save(per);
    }

    @PutMapping
    public void update(@RequestBody Persona per){
        repo.save(per);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Integer id){
        repo.deleteById(id);
    }
}
