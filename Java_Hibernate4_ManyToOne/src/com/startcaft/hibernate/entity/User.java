package com.startcaft.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_User")
public class User {	//һ��Group�������User��һ��Userֻ������һ��Group��GroupΪһ��һ����UserΪ���һ����
	
	private int id;
	private String name;
	private Group group;
	
	/*
	 * @ManyToOne ע������ӳ�� ���һ ��ϵ����һ��һ���Ͳ���Ҫ������ϵ�ˡ�
	 * @JoinColumn ע��������������С�
	 */
	@ManyToOne
	@JoinColumn(name="groupId")
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="user_name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}