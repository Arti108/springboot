package com.niit.techno.crm.dao;

import com.niit.techno.crm.model.Address;
import com.niit.techno.crm.model.EliteUser;

public interface EliteDAO {

	void saveECustomer(Address add);
public EliteUser checkUser(EliteUser theUser);
}
