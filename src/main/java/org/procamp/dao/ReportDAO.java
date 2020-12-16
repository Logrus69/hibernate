package org.procamp.dao;

import org.procamp.Report;
import org.procamp.User;
import org.procamp.exception.DAOSysException;

import java.util.List;

public interface ReportDAO {
    void createReport(Report vo) throws DAOSysException;
    void deleteReport(Long reportId) throws DAOSysException;
    void updateReport(Report vo) throws DAOSysException;
    User getReportById(Long reportId) throws DAOSysException;
    List<Report> getReportListByUserId(Long userId) throws DAOSysException;
}
