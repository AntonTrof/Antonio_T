package app.service;

import app.repository.moneyRepository;
import app.service.kolichestvo.money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Databasemoneymove implements moneymove {

    @Autowired
    private moneyRepository registryRepository;

    @Override
    public void register(money ) {
        if(registryRepository.findById(moneyinfo.getId()).isPresent()){
            throw new RuntimeException("Runtime exception");
        }
        registryRepository.save(moneyinfo);
    }

    @Override
    public void unregister(int id) {
        if(!registryRepository.findById(id).isPresent()){
            throw new RuntimeException("Runtime exception");
        }
        registryRepository.deleteById(id);
    }
}
