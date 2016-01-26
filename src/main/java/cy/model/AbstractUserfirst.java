package cy.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * AbstractUserfirst entity provides the base persistence definition of the
 * Userfirst entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractUserfirst implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String pwd;
	private Date createdatetime;
	private Date modifydatetime;

	// Constructors

	/** default constructor */
	public AbstractUserfirst() {
	}

	/** full constructor */
	public AbstractUserfirst(String id, String name, String pwd,
			Date createdatetime, Date modifydatetime) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.createdatetime = createdatetime;
		this.modifydatetime = modifydatetime;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false, length = 36)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "pwd", nullable = false, length = 20)
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Column(name = "createdatetime", nullable = false, length = 19)
	public Date getCreatedatetime() {
		return this.createdatetime;
	}

	public void setCreatedatetime(Date createdatetime) {
		this.createdatetime = createdatetime;
	}

	@Column(name = "modifydatetime", nullable = false, length = 19)
	public Date getModifydatetime() {
		return this.modifydatetime;
	}

	public void setModifydatetime(Date modifydatetime) {
		this.modifydatetime = modifydatetime;
	}

}