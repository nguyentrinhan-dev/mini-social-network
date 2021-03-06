package com.nhan.minisocial.core.service;

import com.nhan.minisocial.core.entity.Vote;
import com.nhan.minisocial.core.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteService {

    @Autowired
    private VoteRepository voteRepository;

    public Vote getVote(long voteId) {
        return voteRepository.getOne(voteId);
    }

    public long countVoteByArticleIdAndVote(long id, byte vote){
        return voteRepository.countVoteByArticleIdAndVote(id, vote);
    }

    public Vote update(long id, byte type) {
        Vote vote = voteRepository.getOne(id);
        vote.setVote(type);
        return voteRepository.save(vote);
    }

    public long countVoteByArticleId(long id) {
        return voteRepository.countVotesByArticleId(id);
    }

    public Vote save(Vote vote) {
        return voteRepository.save(vote);
    }
}
