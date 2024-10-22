package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.services.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {

    private final IFoyerService foyerService;

    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getAllFoyers() {
        return foyerService.retrieveAllFoyers();
    }

    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer getFoyerById(@PathVariable("foyer-id") Long foyerId) {
        return foyerService.retrieveFoyer(foyerId);
    }

    @PostMapping("/add-foyer")
    public Foyer createFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    @PutMapping("/modify-foyer")
    public Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.modifyFoyer(foyer);
    }

    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void deleteFoyer(@PathVariable("foyer-id") Long foyerId) {
        foyerService.removeFoyer(foyerId);
    }
}
