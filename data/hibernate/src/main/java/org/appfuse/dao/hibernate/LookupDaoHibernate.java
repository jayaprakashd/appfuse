package org.appfuse.dao.hibernate;

import java.util.List;

import org.appfuse.dao.LookupDao;
import org.appfuse.model.Role;

/**
 * Hibernate implementation of LookupDao.
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
public class LookupDaoHibernate extends UniversalDaoHibernate implements LookupDao {

    /**
     * @see org.appfuse.dao.LookupDao#getRoles()
     */
    public List<Role> getRoles() {
        log.debug("retrieving all role names...");

        return getHibernateTemplate().find("from Role order by name");
    }
}