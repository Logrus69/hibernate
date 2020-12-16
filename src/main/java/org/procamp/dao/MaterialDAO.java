package org.procamp.dao;

import org.procamp.Material;
import org.procamp.exception.DAOSysException;

import java.util.List;

public interface MaterialDAO {
    void createMaterial(Material vo) throws DAOSysException;
    void deleteMaterial(Long materialId) throws DAOSysException;
    void updateMaterial(Material vo) throws DAOSysException;
    Material getMaterial(Long materialId) throws DAOSysException;
    List<Material> getMaterialListByActivity(Long activityId) throws DAOSysException;
}
