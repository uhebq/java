package com.library.service;

import com.library.controller.MemberVo;
import com.library.dao.MemberDao;

// 15.
public class MemberService {
	MemberDao memberDao = new MemberDao();
	/**
	 * 로그인
	 * ID, PW를 입력받아서 사용자를 조회합니다.
	 * 
	 * @param id
	 * @param pw
	 * @return
	 */

	public MemberVo login(String id, String pw) {
		MemberVo memberVo = memberDao.login(id,pw);
		if(memberVo !=null) {
			System.out.println(memberVo.getName() + "님 환영합니다.");
			return memberVo;
		} else {
			System.out.println("비밀번호가 일치하지 않거나 없는 계정입니다.");
			return null;
		}
	}

	
	/**
	 * 사용자 등록
	 */
	// 20.
	public void insertMember(MemberVo memberVo) {
		int res = memberDao.insertMember(memberVo);
		if (res > 0) {
			System.out.println("입력되었습니다.");
			
		} else {
			System.out.println("입력중 오류가 발생되었습니다.");
		}
	}


	public void deleteMember(String id) {
		int res = memberDao.deleteMember(id);
		if (res > 0) {
			System.out.println("삭제되었습니다.");
			
		} else {
			System.out.println("삭제중 오류가 발생되었습니다.");
		}
		
	}
}
