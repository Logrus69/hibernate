package org.procamp.dao;

import org.procamp.Activity;
import org.procamp.exception.DAOSysException;

import java.util.List;

public interface ActivityDAO {
    void createActivity(Activity vo) throws DAOSysException;
    void deleteActivity(Long activityId) throws DAOSysException;
    void updateActivity(Activity vo) throws DAOSysException;
    Activity getActivity(Long activityId) throws DAOSysException;
    List<Activity> getActivityListByBuildingId(Long buildingId) throws DAOSysException;
}
