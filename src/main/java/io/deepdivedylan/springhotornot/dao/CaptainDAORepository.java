package io.deepdivedylan.springhotornot.dao;

import io.deepdivedylan.springhotornot.entities.Captain;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("captainDAO")
@Transactional
public class CaptainDAORepository implements CaptainDAO {

    @PersistenceContext
    public EntityManager admirality;

    @Transactional(readOnly = true)
    public Captain getCaptain(Long captainId) {
        try {
            String query = "SELECT captainId, captainImage, captainName FROM captain WHERE captainId = " + captainId;
            return((Captain)admirality.createQuery(query).getSingleResult());
        } catch(Exception exception) {
            return(null);
        }
    }

    @Transactional(readOnly = true)
    public List<Captain> getAllCaptains() {
        return(admirality.createQuery("SELECT captainId, captainImage, captainName FROM captain").getResultList());
    }
}