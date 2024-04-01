package com.example.foyerrouamnissi.RestControllers;

import com.example.foyerrouamnissi.DAO.Entities.Chambre;
import com.example.foyerrouamnissi.DAO.Entities.Etudiant;
import com.example.foyerrouamnissi.DAO.Entities.Foyer;
import com.example.foyerrouamnissi.DAO.Entities.Universite;
import com.example.foyerrouamnissi.Services.Bloc.IBlocService;

import com.example.foyerrouamnissi.DAO.Entities.*;
import com.example.foyerrouamnissi.Services.Chambre.IChambreService;
import com.example.foyerrouamnissi.Services.Foyer.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Map;

@RestController


@RequestMapping("/foyer")
@AllArgsConstructor
@CrossOrigin("*")
public class FoyerRestController {
    IFoyerService iFoyerService;
    IBlocService iBlocService;

    @GetMapping("/findAll")
    List<Foyer> findAll() {
        return iFoyerService.findAll();
    }


    @PostMapping("/add")
    Foyer add(@RequestBody Foyer b) {
        return iFoyerService.addFoyer(b);
    }

    @PutMapping("update")
    Foyer update(@RequestBody Foyer f){
        return iFoyerService.editFoyer( f);
    }
    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable("id") Long id) {
        iFoyerService.deleteById(id);
    }

    @GetMapping("/{id}")
    Foyer findById(@PathVariable("id") Long id) {
        return iFoyerService.findById(id);
    }
 /*   @GetMapping("getFoyerAndUniversity/{idFoyer}")
    Foyer getFoyerAndUniversity(@PathVariable("idFoyer") Long id) {
        return iFoyerService.getFoyerAndUniversity(id);
    }
*/

    //by zeineb
    @GetMapping("/{idBloc}/foyer")
    public Foyer getFoyerByBlocId(@PathVariable Long idBloc) {
        Foyer foyer = iBlocService.getFoyerByBlocId(idBloc);
        return foyer;
    }



}
