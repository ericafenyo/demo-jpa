package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnexionJpa {
  public static void main(String[] args) {
    // Créer une instance d’entityManagerFactory
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("database_config");

    // Créer une instance d’entityManager
    EntityManager manager = factory.createEntityManager();
    EntityTransaction transaction = manager.getTransaction();

    transaction.begin();

    // Extraire une région de votre choix à partir de son identifiant.
    Region region = manager.find(Region.class, 2);
    manager.detach(region);

    // Insérer une nouvelle région en base de données
    Region bono = new Region();
    bono.setNOM("Bono");
    manager.persist(bono);
    transaction.commit();
  }
}
