package app.repository;

import app.service.kolichestvo.money;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface moneyRepository extends JpaRepository<money, Integer>{

}