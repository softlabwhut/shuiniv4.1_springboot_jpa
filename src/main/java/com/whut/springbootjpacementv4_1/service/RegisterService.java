package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.bean.Result;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface RegisterService {

    Result userRegister(HttpServletRequest request, HttpSession session);
}
