package com.monedafrontera.dao;
// Generated 5/11/2015 11:46:51 AM by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.monedafrontera.dto.Autovoz;

/**
 * Home object for domain model class Autovoz.
 * @see com.monedafrontera.dto.Autovoz
 * @author Hibernate Tools
 */
public class AutovozHome extends BaseHibernateDAO {

	private static final Log log = LogFactory.getLog(AutovozHome.class);


	public void persist(Autovoz transientInstance) {
		log.debug("persisting Autovoz instance");
		try {
			this.getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Autovoz instance) {
		log.debug("attaching dirty Autovoz instance");
		try {
			this.getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Autovoz instance) {
		log.debug("attaching clean Autovoz instance");
		try {
			this.getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Autovoz persistentInstance) {
		log.debug("deleting Autovoz instance");
		try {
			this.getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Autovoz merge(Autovoz detachedInstance) {
		log.debug("merging Autovoz instance");
		try {
			Autovoz result = (Autovoz) this.getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Autovoz findById(int id) {
		log.debug("getting Autovoz instance with id: " + id);
		try {
			Autovoz instance = (Autovoz) this.getSession().get("com.monedafrontera.dto.Autovoz", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Autovoz instance) {
		log.debug("finding Autovoz instance by example");
		try {
			List results = this.getSession().createCriteria("com.monedafrontera.dto.Autovoz")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
