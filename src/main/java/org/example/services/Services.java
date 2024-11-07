package org.example.services;

import org.example.models.Opinion;
import org.example.models.Pelicula;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class Services {
    private SessionFactory sessionFactory;

    public Services(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void savePelicula(Pelicula pelicula) {
        sessionFactory.inTransaction((session) -> session.persist(pelicula));
    }

    public List<Opinion> findOpinionbyUser(String correo){
        Session session = sessionFactory.openSession();
        Query <Opinion> query=session.createQuery("from Opinion where usuario=:correo",Opinion.class);
        query.setParameter("correo", correo);
        query.list().forEach(System.out::println);
        return query.list();
    }

    public Pelicula PeliculafindbyId(Long id){
        Session session = sessionFactory.openSession();
        return session.get(Pelicula.class, id);
    }
    public Opinion findOpinionbyId(Long id){
        Session session = sessionFactory.openSession();
        return session.get(Opinion.class, id);
    }
    public void saveOpinion(Opinion opinion) {
        sessionFactory.inTransaction((session) -> session.persist(opinion));
    }
    /*public List<Pelicula> findByPuntuacion(Long puntuacion){
        Session session = sessionFactory.openSession();
        Query<Opinion> query = session.createQuery("FROM Pelicula WHERE ID=:pu", Pelicula.class);
        query.setParameter("puntuacion", puntuacion);
        query.list().forEach(System.out::println);
        return query.list();
    }*/




}
