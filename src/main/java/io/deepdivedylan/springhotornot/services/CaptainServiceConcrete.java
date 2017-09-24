package io.deepdivedylan.springhotornot.services;

import io.deepdivedylan.springhotornot.dao.CaptainDAO;
import io.deepdivedylan.springhotornot.entities.Captain;
import io.deepdivedylan.springhotornot.rest.dto.CaptainDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Service("captainService")
@Transactional
public class CaptainServiceConcrete implements CaptainService {

    @Autowired(required = true)
    private CaptainDAO captainDAO;

    public CaptainDTO getCaptain(Long captainId) {
        Captain captain = captainDAO.getCaptain(captainId);
        CaptainDTO captainDTO = new CaptainDTO();
        captainDTO.setCaptainId(captain.getCaptainId());
        captainDTO.setCaptainImage(captain.getCaptainImage());
        captainDTO.setCaptainName(captain.getCaptainName());
        return(captainDTO);
    }

    public List<CaptainDTO> getAllCaptains() {
        List<Captain> results = captainDAO.getAllCaptains();
        List<CaptainDTO> captainDTOs = new LinkedList<CaptainDTO>();
        for(Captain captain: results) {
            CaptainDTO captainDTO = new CaptainDTO();
            captainDTO.setCaptainId(captain.getCaptainId());
            captainDTO.setCaptainImage(captain.getCaptainImage());
            captainDTO.setCaptainName(captain.getCaptainName());
            captainDTOs.add(captainDTO);
        }
        return(captainDTOs);
    }
}
