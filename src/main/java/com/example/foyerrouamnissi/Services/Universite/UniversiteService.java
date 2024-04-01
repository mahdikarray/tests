package com.example.foyerrouamnissi.Services.Universite;


import com.example.foyerrouamnissi.DAO.Entities.Foyer;
import com.example.foyerrouamnissi.DAO.Entities.Universite;
import com.example.foyerrouamnissi.DAO.Repositories.FoyerRepository;
import com.example.foyerrouamnissi.DAO.Repositories.UniversiteRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {

UniversiteRepository universiteRepository ;
@Autowired
FoyerRepository foyerRepository;

    @Override
    public Universite addUniversite(Universite b) {
        return universiteRepository.save(b);
    }

    @Override
    public List<Universite> addUniversite(List<Universite> b) {
        return universiteRepository.saveAll(b);
    }

    @Override
    public Universite editUniversite(Universite b) {
        return universiteRepository.save(b);
    }

    @Override

    public List<Universite> findAll() {
        return universiteRepository.findAll();
    }
    @Override
    public Universite findById(long id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public void deleteById(long id) {
        universiteRepository.deleteById(id);

    }

    @Override
    public void delete(Universite b) {
        universiteRepository.delete(b);

    }











}
