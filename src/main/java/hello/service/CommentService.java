package hello.service;

import hello.entity.Comment;
import hello.entity.Employee;
import hello.entity.Topic;
import hello.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public  List<Comment> getAllComments()
    {
        return (List<Comment>) commentRepository.findAll();
    }


    public void addComment(Integer c_id, Integer emp_id, Integer t_id, String cmnt) {
        Employee emp = new Employee();
        emp.setEmp_id(emp_id);
        Topic t= new Topic();
        t.setT_id(t_id);
        Comment a = new Comment(emp,t,c_id,cmnt);

        commentRepository.save(a);
    }

    public void deleteComment(Integer c_id)
    {
        commentRepository.deleteById(c_id);
    }

    public boolean updateComment(Integer c_id,Integer emp_id, Integer t_id, String cmnt)
    {
        Employee emp = new Employee();
        emp.setEmp_id(emp_id);
        Topic t= new Topic();
        t.setT_id(t_id);
        Comment a = new Comment(emp,t,c_id,cmnt);
        Comment tmp= new Comment();
        commentRepository.save(a);
        if (tmp!=null)
            return true;
        else
            return  false;

    }



}
