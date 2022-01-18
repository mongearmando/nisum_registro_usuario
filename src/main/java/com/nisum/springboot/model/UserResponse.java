package com.nisum.springboot.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
public class UserResponse implements Serializable {

	private UUID id;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date created;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date modified;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date last_login;
	private String token;
	private boolean isactive;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	public Date getLast_login() {
		return last_login;
	}
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public void mapper(User userCreated) {
		this.id = userCreated.getId();
		this.created= userCreated.getCreated();
		this.created= userCreated.getCreated();
		this.last_login= userCreated.getCreated();
		this.token = userCreated.getToken();
		this.isactive = userCreated.getIsactive();
	}

}