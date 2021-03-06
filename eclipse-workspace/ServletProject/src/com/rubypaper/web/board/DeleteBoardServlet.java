package com.rubypaper.web.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rubypaper.biz.board.BoardDAO;
import com.rubypaper.biz.board.BoardVO;

public class DeleteBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. 세션 체크
		HttpSession session = request.getSession();
		if (session.getAttribute("userId") == null) { // userId 이걸로 된 정보가 없으면 로그인 화면으로 이동
			response.sendRedirect("login.html");
		} else {
			// 1. 사용자 정보 삭제 
			String seq = request.getParameter("seq");
			
			// 2. DB 연동 처리 
			BoardVO vo = new BoardVO();
			vo.setSeq(Integer.parseInt(seq));
			
			BoardDAO boardDAO = new BoardDAO();
			boardDAO.deleteBoard(vo);
				
			// 3. 화면 네비게이션 
			response.sendRedirect("getBoardList.do");
			
		}	
	}
}
