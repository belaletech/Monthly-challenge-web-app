package com.etech.MonthlyChallenge;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChallengeService {

    private List<Challenge> challenges=new ArrayList<>();

    public ChallengeService()
    {
        Challenge challenge1=new Challenge(1L,"January","learn new programming language");
        challenges.add(challenge1);
    }

    public List<Challenge> getAllChallenges()
    {
        return challenges;
    }


    public boolean addChallenge(Challenge challenge)
    {
        if(challenge!=null)
        {
            challenges.add(challenge);
            return true;
        }
        else {
            return false;
        }
    }
}
