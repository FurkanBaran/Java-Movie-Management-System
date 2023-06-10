package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


import entity.Movie;
import entity.Rating;
import entity.Star;
import utils.FileUtil;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTextPane;

public class mainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FileUtil fileUtil;
	private JPanel contentPane;
	private JTextField addMname;
	private JTextField addMyear;
	private JTextField addMlen;
	private JTextField addMgenre;
	private JTextField addMstd;
	private JTextField addMprd;
	private JTextField addMdesc;
	private JTextField addSid;
	private JTextField addSname;
	private JTextField addSsname;
	private JTextField addRid;
	private JTextField addRname;
	private JTextField addRr;
	private JTextField addRrate;
	private JTextField addRsname;
	private JTextField SIDtitle;
	private JTextField SIDid;
	private JTextField addVid;
	private JTextField addVnew;
	private JTextField imgID;
	private JTextField starName;
	private JLabel starsMovies;
	private JLabel imgLabel ;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox ;
	private JLabel ratedMovie;
	private JTextPane sideList;
	private ArrayList<Movie> movieArrayList ;
	private ArrayList<Star> starArrayList ;
	private ArrayList<Rating> ratingArrayList;
	private ArrayList<String> movieListSide;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame frame = new mainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public mainFrame() {
		movieArrayList = new ArrayList<Movie>();
        starArrayList = new ArrayList<Star>();
        ratingArrayList = new ArrayList<Rating>();
        movieListSide=new ArrayList<String>();

        fileUtil = FileUtil.getInstance();

        fileUtil.readMovieFileAndWrite(movieArrayList);
        fileUtil.readStarFileAndWrite(starArrayList);
        fileUtil.readRatingFileAndWrite(ratingArrayList);
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1397, 833);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		sideList = new JTextPane();
		sideList.setEditable(false);
		sideList.setFont(new Font("Space Mono", Font.PLAIN, 15));
		sideList.setBounds(938, 75, 412, 690);
		contentPane.add(sideList);
	
		for (Movie movie:movieArrayList) {
			movieListSide.add(movie.toString());
		}sideList.setText(String.join("", movieListSide));
		
		
		JLabel newMovie = new JLabel("Add new Movie");
		newMovie.setFont(new Font("Tahoma", Font.PLAIN, 15));
		newMovie.setBounds(10, 16, 128, 31);
		contentPane.add(newMovie);
		
		JButton addMovie = new JButton("Add");

		addMovie.setBounds(811, 23, 89, 23);
		contentPane.add(addMovie);
		
		addMname = new JTextField();
		addMname.setBounds(147, 24, 57, 20);
		addMname.setText("XMovie");
		contentPane.add(addMname);
		addMname.setColumns(10);
		
		addMyear = new JTextField();
		addMyear.setBounds(214, 24, 67, 20);
		addMyear.setText("2020");
		contentPane.add(addMyear);
		addMyear.setColumns(10);
		
		addMlen = new JTextField();
		addMlen.setColumns(10);
		addMlen.setText("60");
		addMlen.setBounds(291, 24, 67, 20);
		contentPane.add(addMlen);
		
		addMgenre = new JTextField();
		addMgenre.setColumns(10);
		addMgenre.setText("Sci-Fi");
		addMgenre.setBounds(368, 24, 67, 20);
		contentPane.add(addMgenre);
		
		addMstd = new JTextField();
		addMstd.setColumns(10);
		addMstd.setText("XStudio");
		addMstd.setBounds(445, 24, 58, 20);
		contentPane.add(addMstd);
		
		addMprd = new JTextField();
		addMprd.setColumns(10);
		addMprd.setText("XProducer");
		addMprd.setBounds(513, 24, 76, 20);
		contentPane.add(addMprd);
		
		addMdesc = new JTextField();
		addMdesc.setColumns(10);
		addMdesc.setText("xDesc");

		addMdesc.setBounds(599, 24, 202, 20);
		contentPane.add(addMdesc);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(148, 0, 46, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setHorizontalAlignment(SwingConstants.LEFT);
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblYear.setBounds(214, 0, 56, 25);
		contentPane.add(lblYear);
		
		JLabel lblLength = new JLabel("Length");
		lblLength.setHorizontalAlignment(SwingConstants.LEFT);
		lblLength.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLength.setBounds(291, 0, 44, 25);
		contentPane.add(lblLength);
		
		JLabel lblGe = new JLabel("Genre");
		lblGe.setHorizontalAlignment(SwingConstants.LEFT);
		lblGe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGe.setBounds(369, 0, 63, 25);
		contentPane.add(lblGe);
		
		JLabel lblStudio = new JLabel("Studio");
		lblStudio.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStudio.setBounds(445, 0, 46, 25);
		contentPane.add(lblStudio);
		
		JLabel lblProducer = new JLabel("Producer");
		lblProducer.setHorizontalAlignment(SwingConstants.LEFT);
		lblProducer.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProducer.setBounds(522, 0, 67, 25);
		contentPane.add(lblProducer);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescription.setBounds(599, 0, 202, 25);
		contentPane.add(lblDescription);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 49, 890, 8);
		contentPane.add(separator);
		
		JLabel lblAddANew = new JLabel("Add new Star");
		lblAddANew.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddANew.setBounds(10, 75, 128, 19);
		contentPane.add(lblAddANew);
		
		JLabel lblMovieId = new JLabel("Movie ID");
		lblMovieId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMovieId.setBounds(147, 52, 125, 25);
		contentPane.add(lblMovieId);
		
		addSid = new JTextField();
		addSid.setText("1");
		addSid.setColumns(10);
		addSid.setBounds(147, 76, 57, 20);
		contentPane.add(addSid);
		
		addSname = new JTextField();
		addSname.setText("Jason");
		addSname.setColumns(10);
		addSname.setBounds(210, 76, 292, 20);
		contentPane.add(addSname);
		
		JLabel lblStarName = new JLabel("Star Name");
		lblStarName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStarName.setBounds(210, 52, 71, 25);
		contentPane.add(lblStarName);
		
		JButton addStar = new JButton("Add");

		addStar.setBounds(811, 75, 89, 23);
		contentPane.add(addStar);
		
		addSsname = new JTextField();
		addSsname.setText("Statham");
		addSsname.setColumns(10);
		addSsname.setBounds(512, 76, 286, 20);
		contentPane.add(addSsname);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 105, 890, 8);
		contentPane.add(separator_1);
		
		JLabel lblAddANew_2 = new JLabel("Add new Rating");
		lblAddANew_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddANew_2.setBounds(10, 128, 128, 19);
		contentPane.add(lblAddANew_2);
		
		addRid = new JTextField();
		addRid.setText("3");
		addRid.setColumns(10);
		addRid.setBounds(147, 129, 57, 20);
		contentPane.add(addRid);
		
		JLabel lblMovieId_1 = new JLabel("Movie ID");
		lblMovieId_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMovieId_1.setBounds(147, 105, 67, 25);
		contentPane.add(lblMovieId_1);
		
		JLabel lblStarName_1 = new JLabel("Person Name");
		lblStarName_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStarName_1.setBounds(210, 105, 135, 25);
		contentPane.add(lblStarName_1);
		
		addRname = new JTextField();
		addRname.setText("Mehmet");
		addRname.setColumns(10);
		addRname.setBounds(210, 129, 135, 20);
		contentPane.add(addRname);
		
		addRr = new JTextField();
		addRr.setText("Father");
		addRr.setColumns(10);
		addRr.setBounds(512, 129, 142, 20);
		contentPane.add(addRr);
		
		JButton addRating = new JButton("Add");

		addRating.setBounds(811, 128, 89, 23);
		contentPane.add(addRating);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 158, 890, 8);
		contentPane.add(separator_1_1);
		
		JLabel lblStarName_1_1 = new JLabel("Relation");
		lblStarName_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStarName_1_1.setBounds(512, 107, 110, 25);
		contentPane.add(lblStarName_1_1);
		
		JLabel lblStarName_1_2 = new JLabel("Star Surname");
		lblStarName_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStarName_1_2.setBounds(512, 52, 110, 25);
		contentPane.add(lblStarName_1_2);
		
		JLabel lblStarName_1_1_1 = new JLabel("Rating");
		lblStarName_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStarName_1_1_1.setBounds(659, 107, 110, 25);
		contentPane.add(lblStarName_1_1_1);
		
		addRrate = new JTextField();
		addRrate.setText("8");
		addRrate.setColumns(10);
		addRrate.setBounds(659, 129, 142, 20);
		contentPane.add(addRrate);
		
		JLabel lblStarName_1_3 = new JLabel("Person Surame");
		lblStarName_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStarName_1_3.setBounds(355, 107, 135, 25);
		contentPane.add(lblStarName_1_3);
		
		addRsname = new JTextField();
		addRsname.setText("Deniz");
		addRsname.setColumns(10);
		addRsname.setBounds(355, 131, 147, 20);
		contentPane.add(addRsname);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(915, 23, 13, 742);
		contentPane.add(separator_2);
		
		JLabel lblAddANew_2_1 = new JLabel("Show Movie ID");
		lblAddANew_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddANew_2_1.setBounds(10, 187, 128, 19);
		contentPane.add(lblAddANew_2_1);
		
		SIDtitle = new JTextField();
		SIDtitle.setText("title1");
		SIDtitle.setColumns(10);
		SIDtitle.setBounds(147, 188, 125, 20);
		contentPane.add(SIDtitle);
		
		JLabel lblMovieId_1_1 = new JLabel("Title");
		lblMovieId_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMovieId_1_1.setBounds(147, 160, 125, 25);
		contentPane.add(lblMovieId_1_1);
		
		JLabel lblMovieId_1_1_1 = new JLabel("Movie ID");
		lblMovieId_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMovieId_1_1_1.setBounds(381, 158, 71, 25);
		contentPane.add(lblMovieId_1_1_1);
		
		JButton btnShow = new JButton("Show>>");

		btnShow.setBounds(282, 187, 89, 23);
		contentPane.add(btnShow);
		
		SIDid = new JTextField();
		SIDid.setColumns(10);
		SIDid.setBounds(381, 188, 56, 20);
		contentPane.add(SIDid);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setBounds(471, 485, 13, 298);
		contentPane.add(separator_2_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(10, 217, 434, 13);
		contentPane.add(separator_1_1_1);
		
		JLabel lblAddANew_2_1_1 = new JLabel("Increase View Number");
		lblAddANew_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddANew_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddANew_2_1_1.setBounds(471, 173, 151, 46);
		contentPane.add(lblAddANew_2_1_1);
		
		addVid = new JTextField();
		addVid.setText("1");
		addVid.setColumns(10);
		addVid.setBounds(635, 188, 46, 20);
		contentPane.add(addVid);
		
		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setBounds(462, 217, 443, 23);
		contentPane.add(separator_1_1_1_1);

		JButton btnAddToView = new JButton("Add to View count");

		btnAddToView.setBounds(763, 187, 137, 23);
		contentPane.add(btnAddToView);
		
		addVnew = new JTextField();
		addVnew.setText("1");
		addVnew.setColumns(10);
		addVnew.setBounds(691, 188, 67, 20);
		contentPane.add(addVnew);
		
		JLabel lblMovieId_1_1_1_1 = new JLabel("Movie ID");
		lblMovieId_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMovieId_1_1_1_1.setBounds(632, 160, 71, 25);
		contentPane.add(lblMovieId_1_1_1_1);
		
		JLabel lblMovieId_1_1_1_1_1 = new JLabel("New Views");
		lblMovieId_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMovieId_1_1_1_1_1.setBounds(691, 160, 71, 25);
		contentPane.add(lblMovieId_1_1_1_1_1);
		
		JSeparator separator_1_1_1_2 = new JSeparator();
		separator_1_1_1_2.setBounds(10, 480, 876, 23);
		contentPane.add(separator_1_1_1_2);
		
		JLabel lblAddANew_2_1_2 = new JLabel("Show Movie Poster");
		lblAddANew_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddANew_2_1_2.setBounds(10, 327, 128, 19);
		contentPane.add(lblAddANew_2_1_2);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1_1.setBounds(452, 163, 9, 56);
		contentPane.add(separator_2_1_1);
		
		imgID = new JTextField();
		imgID.setText("1");
		imgID.setColumns(10);
		imgID.setBounds(248, 315, 89, 46);
		contentPane.add(imgID);
		
		JLabel lblMovieId_1_1_1_2 = new JLabel("Movie ID");
		lblMovieId_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMovieId_1_1_1_2.setBounds(175, 325, 76, 25);
		contentPane.add(lblMovieId_1_1_1_2);

		JSeparator separator_2_1_1_5 = new JSeparator();
		separator_2_1_1_5.setOrientation(SwingConstants.VERTICAL);
		separator_2_1_1_5.setBounds(144, 0, 9, 470);
		contentPane.add(separator_2_1_1_5);
	    
	    
	    imgLabel = new JLabel("");
		imgLabel.setBounds(553, 230, 310, 218);
		Border blackline = BorderFactory.createLineBorder(Color.black);
		imgLabel.setBorder(blackline);
		contentPane.add(imgLabel);
		JButton imgBtn = new JButton("Show>>");

		imgBtn.setBounds(346, 327, 89, 23);
		contentPane.add(imgBtn);
		ratedMovie = new JLabel("");
		ratedMovie.setHorizontalAlignment(SwingConstants.CENTER);
		ratedMovie.setFont(new Font("Tahoma", Font.PLAIN, 24));
		ratedMovie.setForeground(Color.RED);
		ratedMovie.setBounds(118, 633, 227, 56);
		contentPane.add(ratedMovie);
		ArrayList<String> genreList = new ArrayList<String>();
		 for (Movie movie : movieArrayList) {
			 if (!genreList.contains( movie.getGenre() ) ) {
				 genreList.add( movie.getGenre());      
		        }
		 }
		 
		this.comboBox = new JComboBox(genreList.toArray());
		
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setBounds(278, 524, 157, 22);
		contentPane.add(comboBox);
		
		JLabel lblAddANew_2_1_2_1 = new JLabel("Highest Rated Movie for this Genre:");
		lblAddANew_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddANew_2_1_2_1.setBounds(10, 524, 260, 19);
		contentPane.add(lblAddANew_2_1_2_1);
		
		JSeparator separator_1_1_1_3 = new JSeparator();
		separator_1_1_1_3.setBounds(10, 557, 434, 13);
		contentPane.add(separator_1_1_1_3);
		
		JLabel lblAddANew_2_1_2_1_1 = new JLabel("Movies of :");
		lblAddANew_2_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddANew_2_1_2_1_1.setBounds(485, 527, 104, 19);
		contentPane.add(lblAddANew_2_1_2_1_1);
		
		starName = new JTextField();
		starName.setText("Kemal Sunal");
		starName.setColumns(10);
		starName.setBounds(575, 526, 190, 20);
		contentPane.add(starName);
		
		starsMovies = new JLabel("");
		starsMovies.setHorizontalAlignment(SwingConstants.CENTER);
		starsMovies.setForeground(Color.RED);
		starsMovies.setFont(new Font("Tahoma", Font.PLAIN, 24));
		starsMovies.setBounds(494, 592, 412, 146);
		contentPane.add(starsMovies);
		
		JButton starBtn_1 = new JButton("Show>>");

		starBtn_1.setBounds(775, 524, 89, 23);
		contentPane.add(starBtn_1);
		
		JLabel lblAddANew_2_1_2_1_1_1 = new JLabel("Movie List:");
		lblAddANew_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddANew_2_1_2_1_1_1.setBounds(938, 26, 104, 19);
		contentPane.add(lblAddANew_2_1_2_1_1_1);
		
		JSeparator separator_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1.setBounds(938, 56, 443, 8);
		contentPane.add(separator_1_1_1_1_1);
		

		addMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent AddMovie) {
					addMovie();	
			}
		});
		addStar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStar();  			 
			}
		});
		addRating.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addRating();	       	
			}
		});
		btnAddToView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addViewCount() ;	
			}
		});
		imgBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPosterByID();	
			}
		});
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getIDfromTitle();

			}
		});
		imgBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPosterByID();	
			}
		});
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 getMaxMovieByGenre();
			}
		});
		starBtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showMovieByStar();
			}
		});

	}
	
	
	
	private void showMovieByStar() {
		String strName=starName.getText();

		if (strName.equals("")  ){return;}
		  ArrayList<String> movieList = new ArrayList<String>();

		  for (Star star : starArrayList) {							  

			  if(star.getNameSurname().split(" ")[0].equals(strName) || star.getNameSurname().equals(strName) ) {
				  String movieName=star.getMovieTitle();

					 if (!movieList.contains(movieName) ) {
						 movieList.add( movieName);      
				        }
				 }
		        
		    }
		  if(movieList.isEmpty()) {
		  JOptionPane.showMessageDialog(new JFrame(), "No movie found matching this Star!", "Error!",
			        JOptionPane.ERROR_MESSAGE);
        	return;	  	}
		  else {	  starsMovies.setText(String.join(", ", movieList));
		  }
	}
	
	
	private void getPosterByID() {
		String ids =imgID.getText();
		if (ids.equals("")  ){return;}
		
		int  id =Integer.parseInt(ids);
		
		  for (Movie movie : movieArrayList) {					 
		        if (movie.getMovieId()==id  ) {
		        	try {
		        		imgLabel.setIcon(new ImageIcon("poster"+id+".jpg"));
						      
						} catch (Exception x) {
				           x.printStackTrace();
				        }
		        	return;
		        }
		    }JOptionPane.showMessageDialog(new JFrame(), "No movie found matching this id!", "Error!",
			        JOptionPane.ERROR_MESSAGE);
        	return;	 
	}
	
	private void getMaxMovieByGenre() {
		double temp=0;
		String maxMovie="";
			String selGenre=comboBox.getSelectedItem().toString();
			
			for (Movie movie : movieArrayList) {
				if ( movie.getGenre()==selGenre ) {
					if (movie.getAvgRating()>temp) {
						temp=movie.getAvgRating();
						maxMovie=movie.getTitle();
					}
				}						
			}
		ratedMovie.setText(maxMovie+": "+String.format("%.2f", temp));
	}
	
	private void addViewCount() {
		String ids =addVid.getText();
		String newCounts =addVnew.getText();
		if (ids.equals("") ||  newCounts.equals("") ){return;}
		
		int  id =Integer.parseInt(ids);
		int  newCount =Integer.parseInt(newCounts);
		int found=0;
		  for (Movie movie : movieArrayList) {					 
		        if (movie.getMovieId()==id  ) {
		        	try {	
		        		int view=movie.getNumWatched();
		        		movie.setNumWatched(view+newCount);
						JOptionPane.showMessageDialog(null, "New view count for \"" + movie.getTitle() + "\" is: "+movie.getNumWatched() ,"Completed" , JOptionPane.INFORMATION_MESSAGE);
						found=1;
						fileUtil.writeMovieFile(movieArrayList);
						      
						} catch (Exception x) {
				           x.printStackTrace();
				        }
						break;
		        }
		    }
			if(found==1){
			movieListSide.clear(); /* Update side list*/
			for (Movie movie:movieArrayList) {
				movieListSide.add(movie.toString());
			}sideList.setText(String.join("", movieListSide));
			return;
		}
			JOptionPane.showMessageDialog(new JFrame(), "No movie found matching this id!", "Error!",
			        JOptionPane.ERROR_MESSAGE);
        	return;	  			 
	}
	
	
	private void getIDfromTitle() {
		String title=SIDtitle.getText();

		  for (Movie movie : movieArrayList) {
			  if (title.equals(movie.getTitle())  ) {
				  SIDid.setText(Integer.toString( movie.getMovieId()));
				  return;
			  }
		}JOptionPane.showMessageDialog(new JFrame(), "No ID found matching this Title!", "Error!",
		        JOptionPane.ERROR_MESSAGE);

		
	}
	
	private void addRating() {
			String rName=addRname.getText();
			String rSname=addRsname.getText();
			String rRel=addRr.getText();
			
			String rate =addRrate.getText();
			String mID =addRid.getText();
			if (rName.equals("") ||  rSname.equals("")||  rRel.equals("")||  rate.equals("")||  mID.equals("")  ){	
				JOptionPane.showMessageDialog(null, "Rating values are invalid. Please check them. ","Error" , JOptionPane.ERROR_MESSAGE);
				return;}
			
			int rRrate=Integer.parseInt(rate);
			int movieID=Integer.parseInt(mID);
			if(rRrate<1||rRrate>10) {JOptionPane.showMessageDialog(null, "Rate must be between 1 and 10. ","Error" , JOptionPane.ERROR_MESSAGE);
			return;}
			
			  for (Movie movie : movieArrayList) {
				  if (movieID == movie.getMovieId()) 
						try {	
							Rating newRating = new Rating (movieID, rName,rSname,rRel, rRrate);
							fileUtil.writeRatingFile(newRating);
							ratingArrayList.add(newRating);
							JOptionPane.showMessageDialog(null, "Rating added for this movie: " + movie.getTitle() ,"Completed" , JOptionPane.INFORMATION_MESSAGE);
						} catch (Exception x) {
				           x.printStackTrace();
				        }
			  	}
			  for (Movie movie : movieArrayList) {  
				int totalRateNum=0;
			    double totalRate=0;
			  
			    for (Rating RatingMovie : ratingArrayList) {					 
		        	if (RatingMovie.getMovieId() == movie.getMovieId()) {
		        		totalRateNum+=1;
		        		totalRate+=RatingMovie.getRating();
		        	}
			        if(totalRateNum==0) {
			        	movie.setAvgRating(1);
			        }else {
			        	movie.setAvgRating(totalRate/totalRateNum);
			        }				      		        
			    }
			  }	movieListSide.clear();
			 for (Movie movie:movieArrayList) 
					movieListSide.add(movie.toString());
				
			  sideList.setText(String.join("", movieListSide));
			  fileUtil.writeMovieFile(movieArrayList);
			  return;
	}
	
	private void addStar() {
		String sName=addSname.getText();
		String sSName=addSsname.getText();
		int movieID=Integer.parseInt(addSid.getText());
		
		  for (Movie movie : movieArrayList) {					 
		        if (movie.getMovieId()==movieID ) {
		        	try {	Star newStar = new Star (movieID,movie.getTitle(), movie.getYear(),sName, sSName);
		        			
							fileUtil.writeStarFile(newStar);
					        starArrayList.add(newStar);
					        JOptionPane.showMessageDialog(null, "Star added to this movie: " + movie.getTitle() ,"Completed" , JOptionPane.INFORMATION_MESSAGE);
					        
						} catch (Exception x) {
				           x.printStackTrace();
				        }
		        	return;
		        	
		        }
		        				        
		    }JOptionPane.showMessageDialog(new JFrame(), "No movie found matching this id!", "Error!",
			        JOptionPane.ERROR_MESSAGE);
        	return;	
	
	}
	
	public void addMovie() {
		int lastID=0;
		String line=addMname.getText();
		  for (Movie movie : movieArrayList) {
		        if (movie.getTitle().equals(line)) {
		        	JOptionPane.showMessageDialog(new JFrame(), "This movie is already in Movie List", "Error!",
					        JOptionPane.ERROR_MESSAGE);
		        	return;
		        }
	        	lastID=movie.getMovieId();
		    }	  
		
		
		 try {	
			 String title=addMname.getText();
	        	int year=Integer.parseInt(addMyear.getText());
	        	int len=Integer.parseInt(addMlen.getText());
	        	String genre=addMgenre.getText();
	        	String std=addMstd.getText();
	        	String prd=addMprd.getText();
	        	String desc=addMdesc.getText();
	        	Movie newMovieVar = new Movie(lastID+1 ,title,year ,len, genre ,std  ,prd ,desc, 1.0 ,0);
				fileUtil.writeMovieFile(newMovieVar);
		        movieArrayList.add(newMovieVar);
		        JOptionPane.showMessageDialog(null, "Movie added successfully!\n Movie ID is: "+(lastID+1), "Completed" , JOptionPane.INFORMATION_MESSAGE);
		        
		        /*UPDATE LIST*/
		        movieListSide.add(newMovieVar.toString());
		        sideList.setText(String.join("", movieListSide));
				  
			} catch (Exception x) {
	           x.printStackTrace();
	        }return;	
	}
		
	
	

}
