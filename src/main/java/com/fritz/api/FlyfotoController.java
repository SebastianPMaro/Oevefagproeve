package com.fritz.api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FlyfotoController {

    @GetMapping("/flyfoto")
    public List<Flyfoto> retrieveFlyfoto() {
        return Arrays.asList(
                new Flyfoto(1, "fnavn", "enavn", "Kartverksveien 21, 3511, Hønefoss", "test@test.no", 1999, 15, -15, 600)
        );
    }
    @PostMapping
    public String addFlyfoto(@RequestBody Flyfoto flyfoto){
        return "created";
    };

    @PutMapping
    public String updateFlyfoto(@RequestBody Flyfoto flyfoto){
        return "Updated";
    };
}
