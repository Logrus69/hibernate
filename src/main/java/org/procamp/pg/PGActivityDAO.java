package org.procamp.pg;

import org.procamp.Activity;
import org.procamp.dao.ActivityDAO;
import org.procamp.exception.DAOSysException;

import java.util.List;

public class PGActivityDAO implements ActivityDAO {
    @Override
    public void createActivity(Activity vo) throws DAOSysException {

    }

    @Override
    public void deleteActivity(Long activityId) throws DAOSysException {

    }

    @Override
    public void updateActivity(Activity vo) throws DAOSysException {

    }

    @Override
    public Activity getActivity(Long activityId) throws DAOSysException {
        return null;
    }

    @Override
    public List<Activity> getActivityListByBuildingId(Long buildingId) throws DAOSysException {
        return null;
    }
}
