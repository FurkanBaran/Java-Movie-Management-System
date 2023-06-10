package entity;

public class Star {
    private int moviedId;
    private String movieTitle;
    private int movieYear;
    private String name;
    private String surname;

    public Star(int moviedId, String movieTitle, int movieYear, String name, String surname)
    {
        this.moviedId = moviedId;
        this.movieTitle = movieTitle;
        this.movieYear = movieYear;
        this.name = name;
        this.surname = surname;
    }

    public Star (String[] parsed) {
        moviedId = Integer.parseInt(parsed[0]);
        movieTitle = parsed[1];
        movieYear = Integer.parseInt(parsed[2]);
        name = parsed[3];
        surname = parsed[4];
    }

    public int getMoviedId()
    {
        return moviedId;
    }

    public void setMoviedId(int moviedId)
    {
        this.moviedId = moviedId;
    }

    public String getMovieTitle()
    {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle)
    {
        this.movieTitle = movieTitle;
    }

    public int getMovieYear()
    {
        return movieYear;
    }

    public void setMovieYear(int movieYear)
    {
        this.movieYear = movieYear;
    }

    public String getNameSurname()
    {
        return name + " " + surname;
    }

    public void setNameSurname(String nameSurname)
    {
        String[] parsed = nameSurname.split(" ");
        name = parsed[0];
        surname = parsed[1];
    }

    @Override
    public String toString()
    {
        return "Star{" +
                "moviedId=" + moviedId +
                ", movieTitle='" + movieTitle + '\'' +
                ", movieYear=" + movieYear +
                ", nameSurname='" + name + " " + surname + '\'' +
                '}';
    }
}
