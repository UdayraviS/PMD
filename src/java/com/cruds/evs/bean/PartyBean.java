package com.cruds.evs.bean;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EVS_TBL_Party")
public class PartyBean {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=6)
	private String partyId;
	
	@Column( length=20)
	private String partyName;
	
	@Column(length=20)
	private String leader;
	
	@Column(length=40)
	private String symbol;

	  @OneToMany(mappedBy="party",cascade = CascadeType.ALL) 
	  private Set<CandidateBean> candidate;
	  
	  
	  

	public PartyBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartyBean(String partyId, String partyName, String leader, String symbol) {
		super();
		this.partyId = partyId;
		this.partyName = partyName;
		this.leader = leader;
		this.symbol = symbol;
		
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getpartyName() {
		return partyName;
	}

	public void setpartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	

	@Override
	public String toString() {
		return "PartyBean [id=" + id + ", partyId=" + partyId + ", partyName=" + partyName + ", leader=" + leader + ", symbol="
				+ symbol + ",]";
	}

	
	
}
