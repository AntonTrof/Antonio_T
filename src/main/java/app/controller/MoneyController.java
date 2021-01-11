package app.controller;

import app.service.moneyinfo;
import app.service.moneymove;
import app.service.kolichestvo.money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MoneyController {
    @Autowired
    private moneymove registry;

    @Autowired
    private moneyinfo info;

    @GetMapping("/car/{id}")
    public ResponseEntity<money> getmoney(@PathVariable("id") int id){
        return new ResponseEntity<>(info.getmoney(id), HttpStatus.OK);
    }

    @GetMapping("/money")
    public ResponseEntity<List<money>> getmoney(){
        return new ResponseEntity<>(info.getmoney(), HttpStatus.OK);
    }

    @PostMapping("/money/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody money ){
        registry.register(money);
    }

    @PostMapping("/money/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void unregister(@PathVariable("id") int id){
        registry.unregister(id);
    }
}
