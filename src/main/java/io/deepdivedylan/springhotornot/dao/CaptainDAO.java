package io.deepdivedylan.springhotornot.dao;

import io.deepdivedylan.springhotornot.entities.Captain;

import java.util.List;

public interface CaptainDAO {
    public Captain getCaptain(Long captainId);
    public List<Captain> getAllCaptains();
}