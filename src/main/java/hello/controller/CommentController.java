package hello.controller;

import hello.entity.Comment;
import hello.entity.Topic;
import hello.service.CommentService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping("/comments")
    public List<Comment> getAllComments()
    {
        return commentService.getAllComments();
    }

    @PostMapping("/addComment")
    public  void postcomment(@RequestParam Integer c_id, @RequestParam Integer emp_id,@RequestParam Integer t_id, @RequestParam String cmnt)
    {
        commentService.addComment(c_id,emp_id,t_id,cmnt);
    }

    @DeleteMapping("/deletecomment")
    public  void deleteComment(@RequestParam Integer c_id)
    {
        commentService.deleteComment(c_id);
    }

    @PutMapping("/updatecomment")
    public void updateComment(@RequestParam Integer c_id , @RequestParam Integer emp_id,@RequestParam Integer t_id, @RequestParam String cmnt)
    {
        commentService.updateComment(c_id,emp_id,t_id,cmnt);
    }



}
