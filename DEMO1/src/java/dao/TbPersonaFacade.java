/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.TbPersona;

/**
 *
 * @author arlet
 */
@Stateless
public class TbPersonaFacade extends AbstractFacade<TbPersona> {

    @PersistenceContext(unitName = "DEMO1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbPersonaFacade() {
        super(TbPersona.class);
    }
    
}
