package org.example;

import org.example.models.Opinion;
import org.example.models.Pelicula;
import org.example.services.Services;
import org.hibernate.SessionFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
        Services sc=new Services(sessionFactory);

        /*Ejercicio1*/
        /*
        Pelicula pelicula1=new Pelicula("La rata de Antonio");
        sc.savePelicula(pelicula1);*/

        /*Ejercicio2*/
        /*
        Opinion opinion=new Opinion();
        sc.findOpinionbyUser("user1@example.com");*/

        /*
        EJERCICIO3*/
        /*
        Pelicula pelicula2=sc.PeliculafindbyId(3L);
        Opinion opinion2=new Opinion("Muy buena peli","hugo@gmail.com",4L,pelicula2);
        sc.saveOpinion(opinion2);*/


    }
}