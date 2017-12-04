package Map;

import javax.persistence.*;

@Entity
@Table(name = "REVIEW", schema = "T00198379", catalog = "")
public class ReviewEntity {
    private short reviewId;
    private boolean rating;
    private String reviewcomment;

    @Id
    @Column(name = "REVIEW_ID")
    public short getReviewId() {
        return reviewId;
    }

    public void setReviewId(short reviewId) {
        this.reviewId = reviewId;
    }

    @Basic
    @Column(name = "RATING")
    public boolean isRating() {
        return rating;
    }

    public void setRating(boolean rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "REVIEWCOMMENT")
    public String getReviewcomment() {
        return reviewcomment;
    }

    public void setReviewcomment(String reviewcomment) {
        this.reviewcomment = reviewcomment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReviewEntity that = (ReviewEntity) o;

        if (reviewId != that.reviewId) return false;
        if (rating != that.rating) return false;
        if (reviewcomment != null ? !reviewcomment.equals(that.reviewcomment) : that.reviewcomment != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) reviewId;
        result = 31 * result + (rating ? 1 : 0);
        result = 31 * result + (reviewcomment != null ? reviewcomment.hashCode() : 0);
        return result;
    }
}
