package pkg;

    public class Movie{
        private String movieName;
        private double rating;
        private int numRatings;
        private double revenue;

        public Movie(){
            movieName = "Avengers";
            rating = 8;
            numRatings = 33;
            revenue = 623357910;
        }
        public Movie(String a, double b, int c, double d){
            movieName = a;
            rating = b;
            numRatings = c;
            revenue = d;
        }
        public void movieToString(){
            System.out.println("Movie: "+movieName);
            System.out.println("Rating: "+rating);
            System.out.println("Number of Ratings: "+numRatings);
            System.out.println("Revenue: "+revenue);
            System.out.println();
        }

        public String getMovieName(){
            return movieName;
        }
        public double getRevenue(){
            return revenue;
        }
        public double getRating(){
            return rating;
        }
        public void addRating(double a){
            rating = ((rating*numRatings)+a)/(numRatings+1);
        }
        public boolean compareRatings(Movie a){
            if(this.rating>a.getRating()){
                return true;
            }
            else{
                return false;
            }
        }
        public Movie pirateMovie(){
            Movie a = new Movie(movieName, rating, numRatings, revenue);
            return a;
        }
    }

