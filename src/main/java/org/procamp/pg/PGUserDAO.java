package org.procamp.pg;

import org.procamp.User;
import org.procamp.dao.UserDAO;
import org.procamp.exception.DAOSysException;
import org.procamp.factory.EMFactory;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Set;

public class PGUserDAO implements UserDAO {

    EntityManager entityManager = EMFactory.getEntityManager();

    @Override
    public void createUser(User vo) throws DAOSysException {
        String sql = "INSERT INTO user_table (email, email_backup, last_name, tn, tn_backup, user_name) VALUES (:email,:email_backup,:last_name,:tn,:tn_backup,:user_name)";
        try {
            entityManager.createQuery(sql)
                    .setParameter("email", vo.getEmail())
                    .setParameter("email_backup", vo.getEmailBackup())
                    .setParameter("last_name", vo.getLastName())
                    .setParameter("tn", vo.getTn())
                    .setParameter("tn_backup", vo.getTnBackup())
                    .setParameter("user_name", vo.getUserName())
                    .executeUpdate();
        } catch (DAOSysException e) {
            throw new DAOSysException(e.getMessage());
        }
    }

    @Override
    public void deleteUser(Long userId) throws DAOSysException {

    }

    @Override
    public void updateUser(User vo) throws DAOSysException {

    }

    @Override
    public User getUserById(Long userId) throws DAOSysException {
        return null;
    }

    @Override
    public List<User> getUserListByUserIdSet(Set<Long> userIdSet) throws DAOSysException {
        return null;
    }
}
