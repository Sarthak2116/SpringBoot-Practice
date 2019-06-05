package com.sarthak.landon.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sarthak.landon.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}