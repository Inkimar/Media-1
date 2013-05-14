/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.mediaserver;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import se.nrm.mediaserver.entity.Media;

/**
 *
 * @author ingimar
 */
@Stateless
public class MediaBean {

    @PersistenceContext(unitName = "MysqlStatesPU")
    private EntityManager em;

    public void saveMedia(Media media) {
        em.persist(media);
    }
}
