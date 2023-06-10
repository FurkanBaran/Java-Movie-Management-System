package entity;

public class Rating {
   private int movieId;
   private String name;
   private String surname;
   private String relation;
   private int rating;

    public Rating(int movieId, String name, String surname, String relation, int rating)
    {
        this.movieId = movieId;
        this.name = name;
        this.surname = surname;
        this.relation = relation;
        this.rating = rating;
    }

    public Rating(String[] parsed) {
        this.movieId = Integer.parseInt(parsed[0]);
        this.name = parsed[1];
        this.surname = parsed[2];
        this.relation = parsed[3];
        this.rating = Integer.parseInt(parsed[4]);

    }

    public int getMovieId()
    {
        return movieId;
    }

    public void setMovieId(int movieId)
    {
        this.movieId = movieId;
    }

    public String getNameSurname()
    {
        return name + " " + surname;
    }

    public void setNameSurname(String nameSurname)
    {
        String[] parsed = nameSurname.split(" ");
        this.name = parsed[0];
        this.surname = parsed[1];
    }

    public String getRelation()
    {
        return relation;
    }

    public void setRelation(String relation)
    {
        this.relation = relation;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    @Override
    public String toString()
    {
        return "Rating{" +
                "movieId=" + movieId +
                ", nameSurname='" + name + " " + surname + '\'' +
                ", relation=" + relation +
                ", rating=" + rating +
                '}';
    }
}
