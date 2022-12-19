package com.experion.mainbackend.service;

import com.experion.mainbackend.dto.ChittalPost;
import com.experion.mainbackend.dto.ChittalPostResponse;
import com.experion.mainbackend.dto.UserJoinedChitty;

public interface ChittalService {

    ChittalPostResponse addChittal(ChittalPost request);
    UserJoinedChitty getChitty(UserJoinedChitty chittyDetails);

}
