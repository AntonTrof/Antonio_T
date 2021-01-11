package app.service.kolichestvo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class money {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String kolichestvo;
    private String naminal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKolichestvo() {
        return kolichestvo;
    }

    public void setKolichestvo(String kolichestvo) {
        this.model = kolichestvo;
    }

    public String getNaminal() {
        return naminal;
    }

    public void setNaminal(String naminal) {
        this.naminal = naminal;
    }
}
