package org.procamp.delegate;

import org.procamp.User;
import org.procamp.dao.UserDAO;
import org.procamp.factory.DAOFactory;
import org.procamp.factory.PGDAOFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class UserDelegate extends PGDAOFactory {

    public void createUser(User vo) {
        DAOFactory daoFactory = getDAOFactory(1);
        try {
            super.startTransaction();
            UserDAO dao = daoFactory.getUserDAO();
            super.commitTransaction();
            dao.createUser(vo);
        } catch (Exception e) {
            super.rollbackTransaction();
        } finally {
            super.flush();
        }
    }

    public void deleteUser(Long userId) {
        DAOFactory daoFactory = getDAOFactory(1);
        try {
            super.startTransaction();
            UserDAO dao = daoFactory.getUserDAO();
            super.commitTransaction();
            dao.deleteUser(userId);
        } catch (Exception e) {
            super.rollbackTransaction();
        } finally {
            super.flush();
        }
    }

    public void updateUser(User vo) {
        DAOFactory daoFactory = getDAOFactory(1);
        try {
            super.startTransaction();
            UserDAO dao = daoFactory.getUserDAO();
            super.commitTransaction();
            dao.updateUser(vo);
        } catch (Exception e) {
            super.rollbackTransaction();
        } finally {
            super.flush();
        }
    }

    public User getUser(long userId) {
        DAOFactory daoFactory = getDAOFactory(1);
        User user = null;
        try {
            super.startTransaction();
            UserDAO dao = daoFactory.getUserDAO();
            super.commitTransaction();
            user = dao.getUserById(userId);
        } catch (Exception e) {
            super.rollbackTransaction();
        } finally {
            super.flush();
        }
        return user;
    }

    public List<User> getUserByUserIdSet(Set<Long> userIdSet) {
        if (Objects.isNull(userIdSet) || userIdSet.isEmpty()) return new ArrayList<>();
        DAOFactory daoFactory = getDAOFactory(1);
        List<User> userList = new ArrayList<>();
        try {
            super.startTransaction();
            UserDAO dao = daoFactory.getUserDAO();
            super.commitTransaction();
            userList = dao.getUserListByUserIdSet(userIdSet);
        } catch (Exception e) {
            super.rollbackTransaction();
        } finally {
            super.flush();
        }
        return  userList;
    }
}
