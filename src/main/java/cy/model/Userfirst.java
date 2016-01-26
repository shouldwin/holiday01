package cy.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Userfirst entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "userfirst", catalog = "cy")
public class Userfirst extends AbstractUserfirst implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Userfirst() {
	}

	/** full constructor */
	public Userfirst(String id, String name, String pwd,
			Date createdatetime, Date modifydatetime) {
		super(id, name, pwd, createdatetime, modifydatetime);
	}

}
