package app.service;

import app.repository.moneyRepository;
import app.service.kolichestvo.money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataBasemoney implements moneyinfo {

    @Autowired
    private moneyRepository repository;


    @Override
    public List<money> getmoney() {
        return repository.findAll();
    }

    @Override
    public money getmoney(int id) {
        return repository.findById(id).get();
    }
}
