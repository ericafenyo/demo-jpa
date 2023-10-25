package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REGION")
public class Region {

  @Id()
  @Column(name = "ID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int ID;

  @Column(name = "NOM", nullable = false)
  private String NOM;

  public Region() { }

  @Override
  public String toString() {
    return "Region{" +
        "ID=" + ID +
        ", NOM='" + NOM + '\'' +
        '}';
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public String getNOM() {
    return NOM;
  }

  public void setNOM(String NOM) {
    this.NOM = NOM;
  }
}
