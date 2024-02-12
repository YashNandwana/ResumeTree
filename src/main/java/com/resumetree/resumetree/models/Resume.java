package com.resumetree.resumetree.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Resumes")
public class Resume
{
    @Id
    @Indexed(unique = true)
    private String rid;
    @Indexed(unique = true)
    private String uid;
    @Indexed(unique = true)
    private String cid;
    private String alias;
    private Integer version;
    private String link;
    private Long visits;
    private String status;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Long getVisits() {
        return visits;
    }

    public void setVisits(Long visits) {
        this.visits = visits;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Resume() {
    }

    @Override
    public String toString() {
        return "Resume{" +
                "rid='" + rid + '\'' +
                ", uid=" + uid +
                ", cid=" + cid +
                ", alias='" + alias + '\'' +
                ", version=" + version +
                ", link='" + link + '\'' +
                ", visits=" + visits +
                ", status='" + status + '\'' +
                '}';
    }
}
