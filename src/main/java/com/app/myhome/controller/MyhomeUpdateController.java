package com.app.myhome.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;

public class MyhomeUpdateController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		 Result result = new Result();
			/*
			 * MemberVO memberVO = new MemberVO(); MyhomeDAO myhomeDAO = new MyhomeDAO();
			 * HttpSession session = req.getSession();
			 * 
			 * // HttpServletRequest로부터 파라미터 받아오기 Long memberId =
			 * Long.valueOf(req.getParameter("id")); String memberNickname =
			 * req.getParameter("memberNickname"); String memberAddress =
			 * req.getParameter("memberAddress"); String memberPhone =
			 * req.getParameter("memberPhone");
			 * 
			 * // MemberVO에 값 세팅 memberVO.setId(memberId);
			 * memberVO.setMemberNickname(memberNickname);
			 * memberVO.setMemberAdress(memberAddress);
			 * memberVO.setMemberPhone(memberPhone);
			 * 
			 * // DAO를 통해 업데이트 수행 myhomeDAO.updateMember(memberVO);
			 */

	        // 결과 페이지 설정
	        result.setPath("../myhome/myhome-update.jsp");
	        return result;
	    }
}