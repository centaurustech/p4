/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Clasificatoria;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author eborja
 */
@Stateless
public class ClasificatoriaFacade extends AbstractFacade<Clasificatoria> {
    @PersistenceContext(unitName = "HUNJPAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClasificatoriaFacade() {
        super(Clasificatoria.class);
    }
    
}
