package com.app.myhome.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.Action;
import com.app.Result;
import com.app.dao.MemberDAO;
import com.app.dao.MyhomeDAO;
import com.app.vo.MemberVO;

public class MyhomeLikesListController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		MyhomeDAO myhomeDAO = new MyhomeDAO();
		MemberVO membrVO = new MemberVO();
		MemberDAO memberDAO = new MemberDAO();
		HttpSession session = req.getSession();

		   
			String memberEmail = (String)session.getAttribute("buyerEmail");
//			System.out.println(memberEmail);
			Long memberId = memberDAO.findBuyerByEmail(memberEmail);
		
		
//		req.setAttribute("member", member);
		result.setRedirect(true);
		result.setPath("../myhome/myhome-likes.jsp");

		return result;
	}

}
