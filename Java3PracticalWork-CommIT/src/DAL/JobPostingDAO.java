package DAL;

import org.apache.ibatis.session.SqlSession;
import Model.JobPosting;
import DAL.MyBatisUtil;

public class JobPostingDAO {
	
	public JobPosting getById(Integer id) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  JobPosting jobPosting = session.selectOne("mybatis.maps.JobPostingMapper.selectJobPosting", id);
		  session.close();
		  return jobPosting;
	}
		
	public void insert(JobPosting jobPosting){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("mybatis.maps.JobPostingMapper.insertJobPosting", jobPosting);
		  session.commit();
		  session.close();
	}
	
	public void update(JobPosting jobPosting){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.JobPostingMapper.updateJobPosting", jobPosting);
		  session.commit();
		  session.close();
	}
	
	public void softDelete(JobPosting jobPosting){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.JobPostingMapper.softDeleteJobPosting", jobPosting);
		  session.commit();
		  session.close();
	}
	
	public void delete(Integer id){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.delete("mybatis.maps.JobPostingMapper.deleteJobPosting", id);
		  session.commit();
		  session.close();
		}
}
