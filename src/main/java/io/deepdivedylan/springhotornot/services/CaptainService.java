package io.deepdivedylan.springhotornot.services;

import io.deepdivedylan.springhotornot.rest.dto.CaptainDTO;

import java.util.List;

public interface CaptainService {
    public CaptainDTO getCaptain(Long captainId);
    public List<CaptainDTO> getAllCaptains();
}
