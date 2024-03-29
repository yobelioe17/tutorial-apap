package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.ObatModel;


public interface ObatService {
    void addObat(ObatModel obat);

    void deleteObat(ObatModel obat);

    void deleteObatById(Long id);

    ObatModel getObatById(Long id);

    // Method untuk update obat
    ObatModel updateObat(ObatModel obatModel);
}