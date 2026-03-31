package com.group11.project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WebUserRepo extends JpaRepository<WebUser, String> {
}
