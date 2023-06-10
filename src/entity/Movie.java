package entity;

public class Movie {
    private int movieId;
    private String title;
    private int year;
    private int length;
    private String genre;
    private String studioName;
    private String producerName;
    private String shortDescription;
    private double avgRating;
    private int numWatched;

    public Movie(String[] parsed) {
        movieId = Integer.parseInt(parsed[0]);
        title = parsed[1];
        year = Integer.parseInt(parsed[2]);
        length = Integer.parseInt(parsed[3]);
        genre = parsed[4];
        studioName = parsed[5];
        producerName = parsed[6];
        shortDescription = parsed[7];
        avgRating = Double.parseDouble(parsed[8]);
        numWatched = Integer.parseInt(parsed[9]);
    }

    public Movie(int movieId, String title, int year, int length, String genre, String studioName, String producerName, String shortDescription, double avgRating, int numWatched)
    {
        this.movieId = movieId;
        this.title = title;
        this.year = year;
        this.length = length;
        this.genre = genre;
        this.studioName = studioName;
        this.producerName = producerName;
        this.shortDescription = shortDescription;
        this.avgRating = avgRating;
        this.numWatched = numWatched;
    }

    public int getMovieId()
    {
        return movieId;
    }

    public void setMovieId(int movieId)
    {
        this.movieId = movieId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public String getStudioName()
    {
        return studioName;
    }

    public void setStudioName(String studioName)
    {
        this.studioName = studioName;
    }

    public String getProducerName()
    {
        return producerName;
    }

    public void setProducerName(String producerName)
    {
        this.producerName = producerName;
    }

    public String getShortDescription()
    {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription)
    {
        this.shortDescription = shortDescription;
    }

    public double getAvgRating()
    {
        return avgRating;
    }

    public void setAvgRating(double avgRating)
    {
        this.avgRating = avgRating;
    }

    public int getNumWatched()
    {
        return numWatched;
    }

    public void setNumWatched(int numWatched)
    {
        this.numWatched = numWatched;
    }

    @Override
    public String toString()
    {
        return 
                movieId + ": " + title + " | " + year +  " | " + String.format("%.2f", avgRating) +" | " + numWatched +   "\n";
    }
}
