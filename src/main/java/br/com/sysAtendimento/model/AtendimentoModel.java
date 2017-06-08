package br.com.sysAtendimento.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="attendances")
@Entity
public class AtendimentoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="member_id")
	private Integer memberId;
	
	@Column(name="justification")
	private String justification;
	
	@Column(name="date")
	private Calendar date;
	
	@Column(name="hour")
	private String hour;
		
	@Column(name="status")
	private String status;
	
	@Column(name="created")
	private Calendar created;
	
	@Column(name="canceled")
	private Calendar canceled;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Calendar getCreated(){
		return created;
	}
	
	public void setCreated(Calendar created){
		this.created = created;
	}

	public Calendar getCanceled() {
		return canceled;
	}	

	public void setCanceled(Calendar canceled) {
		this.canceled = canceled;
	}
}
