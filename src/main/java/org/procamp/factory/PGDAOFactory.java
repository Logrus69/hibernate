package org.procamp.factory;

import org.procamp.dao.*;
import org.procamp.exception.DAOSysException;
import org.procamp.pg.*;

import javax.persistence.EntityManager;

public class PGDAOFactory extends DAOFactory {

    EntityManager entityManager = EMFactory.getEntityManager();
    boolean inTransaction = false;

    @Override
    public void startTransaction() throws DAOSysException {
        if (inTransaction) {
            throw new DAOSysException();
        } else
            entityManager.getTransaction().begin();
        inTransaction = true;
    }

    @Override
    public void commitTransaction() throws DAOSysException {
            if (!inTransaction) {
                throw new DAOSysException();
            } else
                entityManager.getTransaction().commit();
        inTransaction = false;
    }

    @Override
    public void rollbackTransaction() throws DAOSysException {
        if (!inTransaction) {
            throw new DAOSysException();
        } else
            entityManager.getTransaction().rollback();
        inTransaction = false;
    }

    @Override
    public void releaseConnections() throws DAOSysException {
        entityManager.close();
    }

    @Override
    public void flush() throws DAOSysException {
        entityManager.flush();
    }

    @Override
    public void close() throws Exception {

    }


    @Override
    public ActivityDAO getActivityDAO() {
        return new PGActivityDAO();
    }

    @Override
    public BuildingDAO getBuildingDAO() {
        return new PGBuildingDAO();
    }

    @Override
    public UserDAO getUserDAO() {
        return new PGUserDAO();
    }

    @Override
    public MaterialDAO getMaterialDAO() {
        return new PGMaterialDAO();
    }

    @Override
    public ReportDAO getReportDAO() {
        return new PGReportDAO();
    }
}
