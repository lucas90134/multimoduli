package com.toomuch2learn.microservices.serviceb.util;

import com.toomuch2learn.microservices.serviceb.dto.PaginationParams;
import org.springframework.data.domain.PageRequest;

public interface PaginationGenericService {
    <T> PageRequest getPagination(String key, PaginationParams request);

}
