package ArtistTheaterSystem;

import java.util.HashSet;
import java.util.Set;

public class TheaterSystem {

	 public class NoSeatAvailableException extends Exception {
	        /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public NoSeatAvailableException(String message) {
	            super(message);
	        }
	    }
	 private HashSet<Integer> purchasedSeats = new HashSet<>();

	    public class Ticket {
	        private String date;
	        private String time;
	        private int numberOfSeats;
	        private int[] seatNumbers;
	        private boolean[] seatAvailability;

	        public Ticket(String date, String time) {
	            this.setDate(date);
	            this.setTime(time);
	            this.numberOfSeats = 30; // Predetermined 
	            initializeSeats();
	        }

	        private void initializeSeats() {
	        	
	            seatNumbers = new int[numberOfSeats];
	            seatAvailability = new boolean[numberOfSeats];
	            for (int i = 0; i < numberOfSeats; i++) {
	                seatNumbers[i] = i + 1; // Seat numbers start from 1
	                seatAvailability[i] = true; // All seats are available at first
	            }
	        }

	        public String getDate() {
	            return date;
	        }

	        public void setDate(String date) {
	            this.date = date;
	        }

	        public String getTime() {
	            return time;
	        }

	        public void setTime(String time) {
	            this.time = time;
	        }
	    }

	    private Ticket ticket;

	    public TheaterSystem(String date, String time) {
	        this.ticket = new Ticket(date, time);
	    }
	    
	    public boolean checkseat(int seatNum) {
	    	boolean isSeatAvailable = false;
	        for (Integer seat : purchasedSeats) {
	            if (seat == seatNum) {
	                isSeatAvailable = true;
	                break; // Found a match, no need to continue checking
	            }
	        }
			return isSeatAvailable;
	    }
	    public boolean isTheaterFull() {
	    	    // Check if all seats have been purchased
	    	    for (int i = 1; i <= ticket.numberOfSeats; i++) {
	    	        if (purchasedSeats.contains(i)) {
	    	        	System.out.print((i));
	    	            return false; // At least one seat is available
	    	        }
	    	    }
	    	    return true; // All seats have been purchased
	    	}
	        
	    public Set<Integer> getPurchasedSeats() {
	        return purchasedSeats;
	    }
	    
	  
	    
	    public void requestseat(int seatNumber) throws NoSeatAvailableException {
	    	purchasedSeats.add(seatNumber);
	    	
	    }
	    public boolean isArtistTheaterFull() {
	        return purchasedSeats.size() >= 30;
	    }
	    
	    public void buyTicket(int seatNumber) throws NoSeatAvailableException {
	    	if (seatNumber < 1 || seatNumber > ticket.numberOfSeats) {
	            throw new NoSeatAvailableException("Invalid Seat Number");
	        }
	        int index = seatNumber - 1;
	        if (!ticket.seatAvailability[index]) {
	            throw new NoSeatAvailableException("No seats available for the requested ticket! Choose a different show.");
	        }
	        ticket.seatAvailability[index] = false;
	    }

	    public void returnTicket(int seatNumber) {
	        if (seatNumber < 1 || seatNumber > ticket.numberOfSeats) {
	            System.out.println("Invalid Seat Number");
	            return;
	        }
	        purchasedSeats.remove(seatNumber);
	        int index = seatNumber - 1;
	        ticket.seatAvailability[index] = true;
	        System.out.println("Ticket returned for seat number " + seatNumber); //debugging
	    }

	    public static void main(String[] args) {
	        TheaterSystem theater = new TheaterSystem("April 20", "1:00 PM");
	        try {
	            theater.buyTicket(1);
	            theater.buyTicket(1); // This should throw an exception
	        } catch (NoSeatAvailableException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}