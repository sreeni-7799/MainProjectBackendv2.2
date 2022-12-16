package com.experion.mainbackend.service;

import com.experion.mainbackend.dto.ChittalPost;
import com.experion.mainbackend.dto.ChittalPostResponse;

public interface ChittalService {

    ChittalPostResponse addChittal(ChittalPost request);

}
