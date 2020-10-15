package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.ResepModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResepInMemoryService implements ResepService {
    private List<ResepModel> listResep;

    // Constructor
    public ResepInMemoryService() {
        listResep = new ArrayList<>();
    }

    @Override
    public void addResep(ResepModel resep) {
        listResep.add(resep);
    }

    @Override
    public List<ResepModel> getResepList() {
        return listResep;
    }

    @Override
    public ResepModel getResepByNomorResep(Long noResep){
        for (ResepModel x: listResep){
            if(x.getNoResep() == noResep){
                return x;
            }
        }
        return null;
    }

    @Override
    public ResepModel updateResep(ResepModel resepModel){
        return null;
    }

    @Override
    public void deleteResep(ResepModel resep) { }



}



