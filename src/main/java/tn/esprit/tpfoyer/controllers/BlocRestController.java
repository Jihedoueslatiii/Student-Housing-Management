    package tn.esprit.tpfoyer.controllers;



    import lombok.AllArgsConstructor;
    import org.junit.jupiter.api.Tag;
    import org.springframework.web.bind.annotation.*;
    import tn.esprit.tpfoyer.entities.Bloc;
    import tn.esprit.tpfoyer.services.IBlocService;


    import java.util.List;

    @RestController
    @AllArgsConstructor
    @RequestMapping("/bloc")
    public class BlocRestController {

        private final IBlocService blocService;

        @GetMapping("/retrieve-all-blocs")
        public List<Bloc> getBlocs() {
            return blocService.retrieveAllBlocs();
        }

        @GetMapping("/retrieve-bloc/{bloc-id}")
        public Bloc retrieveBloc(@PathVariable("bloc-id") Long bId) {
            return blocService.retrieveBloc(bId);
        }

        @PostMapping("/add-bloc")
        public Bloc addBloc(@RequestBody Bloc bloc) {
            return blocService.addBloc(bloc);
        }

        @DeleteMapping("/remove-bloc/{bloc-id}")
        public void removeBloc(@PathVariable("bloc-id") Long blocId) {
            blocService.removeBloc(blocId);
        }

        @PutMapping("/modify-bloc")
        public Bloc modifyBloc(@RequestBody Bloc bloc) {
            return blocService.modifyBloc(bloc);
        }


    }
