package org.procamp.pg;

import org.procamp.Activity;
import org.procamp.Building;
import org.procamp.dao.BuildingDAO;
import org.procamp.exception.DAOSysException;

import java.util.List;

public class PGBuildingDAO implements BuildingDAO {
    @Override
    public void createBuilding(Building vo) throws DAOSysException {

    }

    @Override
    public void deleteBuilding(Long buildingId) throws DAOSysException {

    }

    @Override
    public void updateBuilding(Building vo) throws DAOSysException {

    }

    @Override
    public Activity getBuilding(Long buildingId) throws DAOSysException {
        return null;
    }

    @Override
    public List<Activity> getBuildingListByReportId(Long reportId) throws DAOSysException {
        return null;
    }
}
