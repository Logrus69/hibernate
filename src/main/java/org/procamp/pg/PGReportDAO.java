package org.procamp.pg;

import org.procamp.Report;
import org.procamp.User;
import org.procamp.dao.ReportDAO;
import org.procamp.exception.DAOSysException;

import java.util.List;

public class PGReportDAO implements ReportDAO {
    @Override
    public void createReport(Report vo) throws DAOSysException {

    }

    @Override
    public void deleteReport(Long reportId) throws DAOSysException {

    }

    @Override
    public void updateReport(Report vo) throws DAOSysException {

    }

    @Override
    public User getReportById(Long reportId) throws DAOSysException {
        return null;
    }

    @Override
    public List<Report> getReportListByUserId(Long userId) throws DAOSysException {
        return null;
    }
}
