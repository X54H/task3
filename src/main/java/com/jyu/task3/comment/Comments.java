package com.jyu.task3.comment;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Comments {
    @XmlElement(name="users")
    private List<Comment> commentList;

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
