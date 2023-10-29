package dev.seta.eapi.dao.review;

import dev.seta.eapi.dao.review.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<Review, String> {
}