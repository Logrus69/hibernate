package org.procamp.dao;

import org.procamp.Activity;
import org.procamp.Building;
import org.procamp.exception.DAOSysException;

import java.util.List;

public interface BuildingDAO {
    void createBuilding(Building vo) throws DAOSysException;
    void deleteBuilding(Long buildingId) throws DAOSysException;
    void updateBuilding(Building vo) throws DAOSysException;
    Activity getBuilding(Long buildingId) throws DAOSysException;
    List<Activity> getBuildingListByReportId(Long reportId) throws DAOSysException;
}
