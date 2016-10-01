package com.jyu.task3.comment;

import com.jyu.task3.user.Users;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javax.swing.UIManager.get;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Comments {

    @XmlElement(name="comments")
    private List<Comment> commentList;

    private static Map<String, Comments> map = new HashMap<>();
    private static Comments instance;


    public synchronized static Comments getInstance(String name){
        instance = map.get(name);
        if(instance == null) {
            instance = new Comments();
            map.put(name, instance);
            return instance;
        }
        return instance;
    }



    public Comments() {
        this.commentList = new ArrayList<Comment>();
    }

    public synchronized List<Comment> getCommentList() {
        return new ArrayList<Comment>(commentList);
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public synchronized void  add(Comment c){
        commentList.add(c);
    }

}
