package com.stackroute.Muzix.repository;


import com.stackroute.Muzix.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TrackRepository extends JpaRepository<Track, Integer>
{

}