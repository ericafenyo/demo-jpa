package fr.diginamic.library.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "EMPRUNT")
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", length = 10)
    private int id;

    @Column(name = "DATE_DEBUT", nullable = false, length = 50)
    private LocalDateTime dateDebut;
    @Column(name = "DATE_FIN", nullable = false, length = 50)
    private LocalDateTime dateFin;

    @Column(name = "DELAI", nullable = false, length = 50)
    private int delai;

    @ManyToOne()
    @JoinColumn(name = "ID_CLIENT", nullable = false)
    private Client client;

    @ManyToMany(mappedBy = "emprunts")
    private List<Livre> livres;

    public Emprunt() { }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public int getDelai() {
        return delai;
    }

    public void setDelai(int delai) {
        this.delai = delai;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }
}
