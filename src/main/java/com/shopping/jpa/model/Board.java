package com.shopping.jpa.model;

import javax.persistence.*;

@Entity
public class Board {

    @Id
    @GeneratedValue
    private Integer seq;

    @Column
    @ManyToOne
    private Board parent;

    @Column
    @ManyToOne
    private Code category;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private Integer viewCount;

    @Column
    private Date regDT;

    @Column
    private Member regMember;

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Board getParent() {
        return parent;
    }

    public void setParent(Board parent) {
        this.parent = parent;
    }

    public Code getCategory() {
        return category;
    }

    public void setCategory(Code category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Date getRegDT() {
        return regDT;
    }

    public void setRegDT(Date regDT) {
        this.regDT = regDT;
    }

    public Member getRegMember() {
        return regMember;
    }

    public void setRegMember(Member regMember) {
        this.regMember = regMember;
    }
}
