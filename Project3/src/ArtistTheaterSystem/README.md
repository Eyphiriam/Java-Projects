# Comprehensive Java Project README: Artist Theater System

This document serves as a comprehensive guide to a Java project developed for managing a theater system, specifically designed for artist performances. The project consists of several Java classes that work together to handle seat reservations, ticket purchases, and user interactions through a graphical user interface (GUI).

## Table of Contents

1. [Project Overview](#project-overview)
2. [Class Descriptions](#class-descriptions)
   - [TheaterSystem Class](#theatersystem-class)
   - [TheaterSystemGUI Class](#theatersystemgui-class)
3. [Usage](#usage)
4. [Example Usage](#example-usage)
5. [Conclusion](#conclusion)

## Project Overview

This Java project is designed to manage seat reservations and ticket purchases for a theater. It allows for the creation of tickets, handling of seat availability, and provides a GUI for user interaction. The system is capable of processing multiple bookings and provides feedback on seat availability and purchase status.

## Class Descriptions

### TheaterSystem Class

- **Purpose**: Manages the theater's ticketing and seat reservation system.
- **Key Features**:
  - **Ticket Inner Class**: Represents a ticket with attributes such as date, time, and seat availability.
  - **NoSeatAvailableException**: Custom exception to handle scenarios where a seat is not available.
  - **buyTicket(int seatNumber)**: Attempts to purchase a ticket for a specified seat.
  - **returnTicket(int seatNumber)**: Returns a ticket, making the seat available again.
  - **isArtistTheaterFull()**: Checks if the theater is fully booked.

### TheaterSystemGUI Class

- **Purpose**: Provides a graphical user interface for interacting with the TheaterSystem.
- **Key Features**:
  - **Interactive Buttons**: Buttons for displaying shows, requesting shows, buying tickets, and returning tickets.
  - **Input Fields**: Fields for entering date, time, and selecting seat numbers.
  - **Output Area**: Displays information about available shows, confirmation of bookings, and errors.

## Usage

To use this system, compile and run the `TheaterSystemGUI` class. The GUI will prompt the user to enter details such as the date, time, and seat number for booking tickets. The system will then attempt to make a reservation or purchase and provide feedback on the operation's success.

## Example Usage

1. **Starting the System**:
   - Run the `TheaterSystemGUI` class.
   - The GUI will appear, allowing the user to interact with the theater system.

2. **Making a Reservation**:
   - Enter the date and time for the desired show.
   - Select a seat number and click "Request Show" to check availability.
   - If available, click "Buy Ticket" to purchase the ticket.
   - Feedback will be provided in the output area regarding the status of the booking.

3. **Returning a Ticket**:
   - Select the seat number of the ticket to be returned.
   - Click "Return Ticket" to make the seat available again.
   - Confirmation of the ticket return will be displayed in the output area.
