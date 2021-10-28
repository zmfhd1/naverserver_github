package mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//sql-mapping.xml 주석해제
//메소드이름을 session.xxxx("emp.mapping파일 id", xxx);
//메소드 구현부 삭제
//EmpService, EmpServiceImpl 주석해제, dao호출메소드 수정
//컨트롤러  empdeptlist주석해제 후 실행

@Mapper
@Repository
public interface EmpDAO {
	
	public List<EmpVO> emplist();
//	public EmpVO empone(int id);
//	public void insertemp(EmpVO vo);
//	public void updateemp(EmpVO vo);
//	public void deleteemp(String name);
//	public int countemp();
//	public List<EmpVO>  empdeptlist(int [] dept_list);
}

//	@Autowired
//	SqlSession session ;//SqlSessionTemplate 객체 생성( spring-mybatis.xml파일 설정)


//	{
//	//sql 정의 태그 중에서 id=emplist 실행-결과
//		List<EmpVO> list = session.selectList("emp.emplist");
//		return list;
//	}
	
//	public EmpVO getEmpOne(int id) {
//		EmpVO vo = session.selectOne("emp.empone", id);
//		return vo;
//	//System.out.println(vo.getEmployee_id() + ":" + vo.getFirst_name() +":" + vo.getHire_date() +":" + vo.getSalary());
//	}
//	
//	public void insertEmp(EmpVO vo) {
//		session.insert("emp.insertemp", vo);
//	}
//	
//	public void updateEmp(EmpVO vo) {
//		session.update("emp.updateemp", vo);
//	}
//	
//	public void deleteEmp(String name) {
//		session.delete("emp.deleteemp", name);
//	}
//	
//	public int countEmp() {
//		int cnt = session.selectOne("emp.cnt");
//		return cnt;
//	}
//	
//	public List<EmpVO>  empDeptList(int [] dept_list) {
//		List<EmpVO> list = session.selectList("emp.empdeptlist" , dept_list);
//		return list;
//	}

//package mybatis;
//
//import java.util.List;
//
//import org.apache.ibatis.annotations.Mapper;
//import org.springframework.stereotype.Repository;
//
//@Mapper   //@Mapper-Scan
//@Repository //@cOMPONENT-SCAN
//public interface EmpDAO {
//	
//	public List<EmpVO> emplist();
//	
//	// 0> sql-mapping.xml 주석 해제
//	// 1> 메소드이름을 session.xxxx("emp.mapping 파일 id", xxx);
//	// 2> 메소드 구현부 삭제
//	// 3> EmpService, EmpSeviceImpl 주석해제. dao 호출메소드 수정 
//	// 4> 컨트롤러 /empdeptlist 주석 해제 후 실행
//	
///*	public EmpVO getEmpOne(int id) {
//		EmpVO vo = session.selectOne("emp.empone", id);
//		return vo;
//	//System.out.println(vo.getEmployee_id() + ":" + vo.getFirst_name() +":" + vo.getHire_date() +":" + vo.getSalary());
//	}
//	
//	public void insertEmp(EmpVO vo) {
//		session.insert("emp.insertemp", vo);
//	}
//	
//	public void updateEmp(EmpVO vo) {
//		session.update("emp.updateemp", vo);
//	}
//	
//	public void deleteEmp(String name) {
//		session.delete("emp.deleteemp", name);
//	}
//	
//	public int countEmp() {
//		int cnt = session.selectOne("emp.cnt");
//		return cnt;
//	}
//	
//	public List<EmpVO>  empDeptList(int [] dept_list) {
//		List<EmpVO> list = session.selectList("emp.empdeptlist" , dept_list);
//		return list;
//	}*/
//}

































