package org.example.exercice1.conroller;

import org.example.exercice1.entities.Nombres;
import org.example.exercice1.service.ServiceCalcul;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/calculs")

public class CalculAPI {

    private final ServiceCalcul serviceCalcul;

    // Injection par constructeur
    public CalculAPI(ServiceCalcul serviceCalcul) {
        this.serviceCalcul = serviceCalcul;
    }

    @GetMapping
    public ResponseEntity<Map<String, Double>> calculsomme (@RequestParam double a, double b){
        Nombres nombres = new Nombres(a,b);
        double somme = serviceCalcul.SommeOperation(nombres);
        Map<String,Double> responsejson = new HashMap<>();
        responsejson.put("somme", somme);

        return ResponseEntity.ok(responsejson);

    }
}
