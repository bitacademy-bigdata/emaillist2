package com.bitdata2017.emaillist.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata2017.emaillist.dao.EmaillistDao;
import com.bigdata2017.emaillist.vo.EmaillistVo;

@WebServlet("/el")
public class EmaillistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding( "utf-8" );
		
		String actionName = request.getParameter( "a" );
		
		if( "form".equals( actionName ) ) {
			
		} else if( "insert".equals( actionName ) ) {
			
		} else {
			/* default 요청 처리 (list) */
			EmaillistDao dao = new EmaillistDao();
			List<EmaillistVo> list = dao.getList();			
			
			RequestDispatcher rd = request.getRequestDispatcher( "/WEB-INF/views/index.jsp" );
			rd.forward( request, response );
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
