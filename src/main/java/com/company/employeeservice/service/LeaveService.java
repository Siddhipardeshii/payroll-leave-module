package com.company.employeeservice.service;

import java.util.List;

import com.company.employeeservice.model.LeaveRequest;
import com.company.employeeservice.model.LeaveStatus;

public interface LeaveService {

    LeaveRequest applyLeave(Long empId, int days);

    void approveLeave(Long leaveId);

    void rejectLeave(Long leaveId);

    int getLeaveBalance(Long empId);

    LeaveStatus getLeaveStatus(Long leaveId);

    List<LeaveRequest> getAllLeaves();
}