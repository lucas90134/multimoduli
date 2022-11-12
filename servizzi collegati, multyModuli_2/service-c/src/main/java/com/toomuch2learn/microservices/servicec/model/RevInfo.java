package com.toomuch2learn.microservices.servicec.model;


import org.hibernate.envers.DefaultRevisionEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "revinfo")
public class RevInfo extends DefaultRevisionEntity {

  private static final long serialVersionUID = -7604731515258123883L;

  @Column(name="user_audit")
  private String userAudit;

  @Column(name = "date_audit")
  private Date dateAudit;

  public String getUserAudit() {
    return userAudit;
  }

  public void setUserAudit(String userAudit) {
    this.userAudit = userAudit;
  }

  public Date getDateAudit() {
    return dateAudit;
  }

  public void setDateAudit(Date dateAudit) {
    this.dateAudit = dateAudit;
  }
}

