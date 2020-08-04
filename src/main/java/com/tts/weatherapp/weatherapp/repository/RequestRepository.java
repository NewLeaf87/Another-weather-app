package com.tts.weatherapp.weatherapp.repository;

import com.tts.weatherapp.weatherapp.model.Request;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
}