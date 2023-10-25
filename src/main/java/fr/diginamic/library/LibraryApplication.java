package fr.diginamic.library;

import fr.diginamic.library.entities.Client;
import fr.diginamic.library.entities.Emprunt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LibraryApplication {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("database_config_library");

        // Créer une instance d’entityManager
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();

        // Réaliser une requête qui permet d’extraire un emprunt en fonction son id.
        Emprunt emprunt = manager.find(Emprunt.class, 4);

        // Affichez tous les livres associés
        emprunt.getLivres().forEach(livre -> {
            System.out.printf("%d. %s - %s%n", livre.getId(), livre.getAuteur(), livre.getTitre());
        });

        // Réaliser une requête qui permet d’extraire tous les emprunts d’un client donné.
        Client client = manager.find(Client.class, 2);
        client.getEmprunts().forEach(element -> {
            System.out.println(element.getLivres());
        });
    }
}
