/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.TbInventarioVacunas;

/**
 *
 * @author arlet
 */
@Stateless
public class TbInventarioVacunasFacade extends AbstractFacade<TbInventarioVacunas> {

    @PersistenceContext(unitName = "DEMO1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbInventarioVacunasFacade() {
        super(TbInventarioVacunas.class);
    }
    
}
