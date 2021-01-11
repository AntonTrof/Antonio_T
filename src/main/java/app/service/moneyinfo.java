package app.service;

import app.service.kolichestvo.money;

import java.util.List;

public interface moneyinfo {
    List<money> getmoney();
    money getmoney(int id);
}
