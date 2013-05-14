/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.mediaserver;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import se.nrm.mediaserver.entity.Image;
import se.nrm.mediaserver.entity.Media;

/**
 *
 * @author ingimar
 */
public class CreateTables {

    @PersistenceContext(unitName = "MysqlStatesPU")
    static EntityManager em;

    public static void main(String[] args) {
        Media media = new Image();
        em.persist(media);
    }
}
