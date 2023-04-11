package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.library.controller.MemberVo;
import com.library.dao.conn.DBUtil;

// 14.
public class MemberDao {
	public MemberVo login(String id, String pw) {
		
		// 매개변수를 ?로 입력
		String sql = "select * from member where id = ? and pw = ?";
		
		try (Connection conn = DBUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			){
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String name = rs.getString("name");
				String adminYN = rs.getString("adminYN");
				
				MemberVo memberVo = new MemberVo(id, "", name, adminYN);
				System.out.println("id : " + id);
				return memberVo;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// id/pw가 일치하는 사용자를 찾을 수 없음
		return null;
	}
	
	// 21.
	public int insertMember(MemberVo memberVo) {
		String sql = "insert into member values (?, ?, ?, ?)";
		try(Connection conn = DBUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setString(1, memberVo.getId());
			pstmt.setString(2, memberVo.getPw());
			pstmt.setString(3, memberVo.getName());
			pstmt.setString(4, memberVo.getAdminYN());
			
			int res = pstmt.executeUpdate();
			return res;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
		return 0;
	}
	
	/**
	 * 데이터베이스에 등록된 사용자 정보를 삭제합니다.
	 * Statement
	 *  - 쿼리 자체를 String 문자열로 넣어주기 때문에
	 *  	문자가 값으로 들어가는 경우 '' 처리를 해줘야 합니다.
	 * 
	 * PreparedStatement
	 * - Statement 클래스보다 기능이 향상된 클래스
	 * - 코드의 안정성과 가독성이 높다.
	 * - 인자 값으로 전달이 가능
	 * - 매개변수를 ?로 설정(?에 '' 처리를 하지 않습니다.)
	 * 		setString(index, 값);
	 * 		setInt(index, 값);
	 * 
	 * @param id
	 * @return
	 */
	public int deleteMember(String id) {
		String sql = "delete from member where id = ? ";
		
		try(Connection conn = DBUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setString(1, id);
			
			int res = pstmt.executeUpdate();
			return res;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
}
