package com.fundguide.melona.board.community.repository.like;

import com.fundguide.melona.board.community.entity.Community_like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityLikeRepository extends JpaRepository<Community_like, Long>, CommunityLikeCustom {

}
