# Comprehensive Java Project README: Hotel Reservation System

This document serves as a comprehensive guide to a Java project developed for managing a hotel reservation system. The project consists of several Java classes that work together to handle room bookings based on room type, availability, and customer requirements.

## Table of Contents

1. [Project Overview](#project-overview)
2. [Class Descriptions](#class-descriptions)
   - [Room Class](#room-class)
   - [RegularRoom Class](#regularroom-class)
   - [DeluxeRoom Class](#deluxeroom-class)
   - [JuniorSuite Class](#juniorsuite-class)
   - [Hotel Class](#hotel-class)
   - [HotelReservationSystem Class](#hotelreservationsystem-class)
3. [Usage](#usage)
4. [Example Usage](#example-usage)
5. [Conclusion](#conclusion)

## Project Overview

This Java project is designed to manage room reservations for a hotel. It allows for the creation of different types of rooms, handles customer reservations, and manages room availability. The system is capable of processing multiple bookings and provides a user interface for interaction.

## Class Descriptions

### Room Class

- **Purpose**: Represents a generic room with basic attributes such as room number and price per night.
- **Key Methods**:
  - `calculateTotalCharge(int numberOfNights)`: Calculates the total charge based on the number of nights and the price per night.
  - `setAvailable(boolean available)`: Sets the availability of the room.
  - `isAvailable()`: Returns the availability status of the room.

### RegularRoom Class

- **Inherits**: Room
- **Purpose**: Represents a regular room with a standard price per night.
- **Initialization**: Sets the price per night to $200.

### DeluxeRoom Class

- **Inherits**: Room
- **Purpose**: Represents a deluxe room with a higher price per night.
- **Initialization**: Sets the price per night to $300.

### JuniorSuite Class

- **Inherits**: Room
- **Purpose**: Represents a junior suite with a premium price per night.
- **Initialization**: Sets the price per night to $350.

### Hotel Class

- **Purpose**: Manages a collection of rooms and handles reservations.
- **Key Methods**:
  - `makeReservation(String roomType, String arrivalDate, String departureDate)`: Attempts to make a reservation based on room type and availability.

### HotelReservationSystem Class

- **Purpose**: Provides a graphical user interface for making reservations.
- **Key Methods**:
  - `submitBooking()`: Collects user input and attempts to make a reservation using the `Hotel` class.

## Usage

To use this system, compile and run the `HotelReservationSystem` class. The GUI will prompt the user to enter details such as customer name, room type, arrival date, and departure date. The system will then attempt to make a reservation and provide feedback on whether the booking was successful.

## Example Usage

1. **Starting the System**:
   - Run the `HotelReservationSystem` class.
   - The GUI will appear, allowing the user to input reservation details.

2. **Making a Reservation**:
   - Enter the customer's name, select a room type, and specify the arrival and departure dates.
   - Click the "Submit" button to attempt the reservation.
   - A message will appear indicating whether the reservation was successful or if no rooms were available.
