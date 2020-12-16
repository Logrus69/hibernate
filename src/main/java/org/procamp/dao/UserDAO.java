package org.procamp.dao;

import org.procamp.User;
import org.procamp.exception.DAOSysException;

import java.util.List;
import java.util.Set;

public interface UserDAO {
    void createUser(User vo) throws DAOSysException;
    void deleteUser(Long userId) throws DAOSysException;
    void updateUser(User vo) throws DAOSysException;
    User getUserById(Long userId) throws DAOSysException;
    List<User> getUserListByUserIdSet(Set<Long> userIdSet) throws DAOSysException;
}
