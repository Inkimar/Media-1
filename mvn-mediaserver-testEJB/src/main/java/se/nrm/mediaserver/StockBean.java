package se.nrm.mediaserver;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import se.nrm.mediaserver.entity.Image;
import se.nrm.mediaserver.entity.Media;

/**
 *
 * @author ingimar
 */
@Stateless
public class StockBean {

    @PersistenceContext(unitName = "MysqlStatesPU")
    private EntityManager em;

    public double getStockprice(String symbol) {
        Media media = new Image();
        em.persist(media);
        if (symbol.equals("ABCD")) {
            return 2340.98;
        }

        if (symbol.equals(
                "ZYXV")) {
            return 654.45;
        }

        return 0.0;
    }
}
