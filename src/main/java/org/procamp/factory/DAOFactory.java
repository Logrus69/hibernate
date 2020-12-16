package org.procamp.factory;

import org.procamp.dao.*;
import org.procamp.exception.DAOSysException;

public abstract class DAOFactory implements AutoCloseable{

    public static final int JPQL_POSTGRES = 1;
    public static final int HIBERNATE_POSTGRES = 2;

    public static DAOFactory getDAOFactory(int whichFactory) {

        switch (whichFactory) {
            case HIBERNATE_POSTGRES:
                //return new PGHIBDAOFactory();
            case JPQL_POSTGRES:
            default:
                return new PGDAOFactory();
        }
    }

    public abstract void startTransaction() throws DAOSysException;

    public abstract void commitTransaction() throws DAOSysException;

    public abstract void rollbackTransaction() throws DAOSysException;

    public abstract void releaseConnections() throws DAOSysException;

    public abstract void  flush () throws DAOSysException;

    public abstract ActivityDAO getActivityDAO();

    public abstract BuildingDAO getBuildingDAO();

    public abstract UserDAO getUserDAO();

    public abstract MaterialDAO getMaterialDAO();

    public abstract ReportDAO getReportDAO();
}
