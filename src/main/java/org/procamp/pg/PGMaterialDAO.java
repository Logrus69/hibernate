package org.procamp.pg;

import org.procamp.Material;
import org.procamp.dao.MaterialDAO;
import org.procamp.exception.DAOSysException;

import java.util.List;

public class PGMaterialDAO implements MaterialDAO {
    @Override
    public void createMaterial(Material vo) throws DAOSysException {

    }

    @Override
    public void deleteMaterial(Long materialId) throws DAOSysException {

    }

    @Override
    public void updateMaterial(Material vo) throws DAOSysException {

    }

    @Override
    public Material getMaterial(Long materialId) throws DAOSysException {
        return null;
    }

    @Override
    public List<Material> getMaterialListByActivity(Long activityId) throws DAOSysException {
        return null;
    }
}
