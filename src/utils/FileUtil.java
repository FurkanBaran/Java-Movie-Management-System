package  utils;

import  entity.Movie;
import  entity.Rating;
import  entity.Star;

import java.io.*;
import java.util.ArrayList;

public final class FileUtil {
    private final File m_movieFile;
    private final File m_ratingFile;
    private final File m_starFile;

    private static FileUtil ms_fileUtil;

    private FileUtil()
    {
        m_ratingFile = new File("rating.txt");
        m_movieFile = new File("Movie.txt");
        m_starFile = new File("star.txt");

        //.... INIT
    }

    public static FileUtil getInstance()
    {
        if (ms_fileUtil == null)
            ms_fileUtil = new FileUtil();

        return ms_fileUtil;
    }

    public void readMovieFileAndWrite(ArrayList<Movie> movieAr)
    {
        try {
            FileReader fr = new FileReader(m_movieFile);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                String[] parsed = line.split(" ");
                movieAr.add(new Movie(parsed));
            }

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   

    public void readStarFileAndWrite(ArrayList<Star> starAr)
    {
        try {
            FileReader fr = new FileReader(m_starFile);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                String[] parsed = line.split(" ");
                starAr.add(new Star(parsed));
            }

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readRatingFileAndWrite(ArrayList<Rating> ratingAr)
    {
        try {
            FileReader fr = new FileReader(m_ratingFile);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                String[] parsed = line.split(" ");
                ratingAr.add(new Rating(parsed));
            }

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeRatingFile( Rating rating) throws IOException
    {
  

        try (FileWriter f = new FileWriter(m_ratingFile, true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {

            p.println(rating.getMovieId() + " " + rating.getNameSurname() + " " +
                    rating.getRelation() + " " + rating.getRating());

        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void writeMovieFile(Movie movie)
    {


        try (FileWriter f = new FileWriter(m_movieFile, true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {

            p.println(movie.getMovieId() + " " + movie.getTitle() + " " + movie.getYear() + " " + movie.getLength() + " " + movie.getGenre() +
                    " " + movie.getStudioName() + " " + movie.getProducerName()  + " " + movie.getShortDescription() +
                    " " + movie.getAvgRating() +  " " + movie.getNumWatched());

        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    public void writeMovieFile(ArrayList<Movie>  movieArr)
    {


        try (FileWriter f = new FileWriter(m_movieFile, false);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);)
        {
        	for (Movie movie: movieArr) {
        		 p.println(movie.getMovieId() + " " + movie.getTitle() + " " + movie.getYear() + " " + movie.getLength() + " " + movie.getGenre() +
                         " " + movie.getStudioName() + " " + movie.getProducerName()  + " " + movie.getShortDescription() +
                         " " + movie.getAvgRating() +  " " + movie.getNumWatched());
        	}
           

        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void writeStarFile(Star star)
    {
  


        try (FileWriter f = new FileWriter(m_starFile, true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {

            p.println(star.getMoviedId() + " " + star.getMovieTitle() + " " + star.getMovieYear()
                    + " " + star.getNameSurname());
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

}
