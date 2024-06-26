package com.example.foyerrouamnissi.Services.Foyer;


import com.example.foyerrouamnissi.DAO.Entities.Bloc;
import com.example.foyerrouamnissi.DAO.Entities.Chambre;
import com.example.foyerrouamnissi.DAO.Entities.Foyer;

import com.example.foyerrouamnissi.DAO.Entities.Universite;
import com.example.foyerrouamnissi.DAO.Repositories.FoyerRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.*;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {

    FoyerRepository foyerRepository;
   

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer); //on aj
    }

    @Override
    public List<Foyer> addFoyer(List<Foyer> foyer) {
        return foyerRepository.saveAll(foyer);
    }

    @Override
    public Foyer editFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);

    }

    @Override
    public List<Foyer> findAll() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer findById(long id) {
        return foyerRepository.findById(id).get();
    }

    @Override
    public void deleteById(long id) {
        foyerRepository.deleteById(id);
    }

    @Override
    public void delete(Foyer foyer) {
        foyerRepository.delete(foyer);
    }

   

}