package com.example.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class Reviewservice {
    @Autowired
    private Reviewrepository reviewrepo;

@Autowired
    private MongoTemplate mongotemplate;

    public Review createnew(String body,String imdb){
        Review review =new Review(body);
        reviewrepo.insert(review);
mongotemplate.update(Movies.class)
        .matching(Criteria.where("imdbId").is(imdb))
        .apply(new Update().push("reviewIds").value(review))
        .first();
return review;
    }
}
