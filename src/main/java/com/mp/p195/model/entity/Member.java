package com.mp.p195.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@SequenceGenerator(
        name="MEMBER_SEQ_GEN", sequenceName="MEMBER_SEQ", 
        initialValue=1, allocationSize=1 
)
@Table(name = "member")
public class Member {
	@Id
	@Column(name="mem_num")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "MEMBER_SEQ_GEN")
	private int mem_num;
	
	@Column (name="name") 
	private String name;
	
	@Column (name="id") 
	private String id;
	
	@Column (name="password") 
	private String password;
	
	@Column (name="email") 
	private String email;

	@Column (name="birth") 
	private String birth;
	
	@Column (name="gender") 
	private String gender;
	
	@Column (name="address") 
	private String address;
	
	@Column (name="ph_num") 
	private String ph_num;
	
}
