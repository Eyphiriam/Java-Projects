# Comprehensive Java Project README: Mower Management System

This document serves as a comprehensive guide to a Java project developed for managing a database of various types of mowers, including commercial mowers, gas-powered mowers, lawn tractors, and push reel mowers. The project consists of several Java classes that work together to create a system for storing, retrieving, and searching for mowers based on various attributes such as type, manufacturer, and engine specifications.

## Table of Contents

1. [Project Overview](#project-overview)
2. [Class Descriptions](#class-descriptions)
   - [Mower Class](#mower-class)
   - [Engine Class](#engine-class)
   - [CommercialMower Class](#commercialmower-class)
   - [GasPoweredMower Class](#gaspoweredmower-class)
   - [LawnTractor Class](#lawntractor-class)
   - [PushReelMower Class](#pushreelmower-class)
   - [WalkBehindMower Class](#walkbehindmower-class)
   - [MowerWareHouse Class](#mowerwarehouse-class)
   - [Main Class](#main-class)
3. [Usage](#usage)
4. [Example Usage](#example-usage)
5. [Conclusion](#conclusion)

## Project Overview

This Java project is designed to manage a collection of mowers, allowing users to add mowers to a database and search through them based on different criteria. The system is implemented using Java with classes representing different components of the mower management system.

## Class Descriptions

### Mower Class

- **Purpose**: Represents a generic mower with basic attributes like manufacturer, year, serial number, and type.
- **Key Methods**:
  - `setManufacturer(String manufacturer)`: Sets the mower's manufacturer.
  - `setYear(int year)`: Sets the manufacturing year.
  - `setSerialNumber(String serialNumber)`: Sets the serial number.
  - `setType(String type)`: Sets the type of mower.

### Engine Class

- **Purpose**: Represents an engine with attributes such as manufacturer, horsepower, and number of cylinders.
- **Key Methods**:
  - `setManufacturer(String manufacturer)`: Sets the engine's manufacturer.
  - `setHorsePower(Double horsePower)`: Sets the horsepower.
  - `setCylinders(int cylinders)`: Sets the number of cylinders.

### CommercialMower Class

- **Inherits**: `LawnTractor`
- **Purpose**: Represents a commercial mower with specific attributes like operating hours and zero-turn radius capability.
- **Key Methods**:
  - `setOperatingHours(double operatingHours)`: Sets the operating hours.
  - `setZeroTurnRadius(boolean zeroTurnRadius)`: Sets whether the mower has a zero-turn radius.

### GasPoweredMower Class

- **Inherits**: `WalkBehindMower`
- **Purpose**: Represents a gas-powered mower that may be self-propelled.
- **Key Methods**:
  - `setEngine(Engine engine)`: Sets the engine.
  - `setSelfPropelled(boolean selfPropelled)`: Sets whether the mower is self-propelled.

### LawnTractor Class

- **Inherits**: `Mower`
- **Purpose**: Represents a lawn tractor with attributes like engine, model, and deck width.
- **Key Methods**:
  - `setEngine(Engine engine)`: Sets the engine.
  - `setModel(String model)`: Sets the model.
  - `setDeckWidth(double deckWidth)`: Sets the deck width.

### PushReelMower Class

- **Inherits**: `WalkBehindMower`
- **Purpose**: Represents a manually operated push reel mower.
- **Key Methods**:
  - `setNumWheels(int numWheels)`: Sets the number of wheels.

### WalkBehindMower Class

- **Inherits**: `Mower`
- **Purpose**: Base class for mowers that are operated by walking behind them.
- **Key Methods**:
  - `setCutWidth(double cutWidth)`: Sets the cutting width.
  - `setWheelDiameter(double wheelDiameter)`: Sets the wheel diameter.

### MowerWareHouse Class

- **Purpose**: Manages a collection of mowers, allowing for adding, removing, and searching mowers.
- **Key Methods**:
  - `addMower(Mower mower)`: Adds a mower to the collection.
  - `removeMower(Mower mower)`: Removes a mower from the collection.
  - `search(String type)`: Searches for mowers by type.

### Main Class

- **Purpose**: Provides the main method to run the application, handling file input and user interactions.

## Usage

To use this system:
1. Compile all Java classes.
2. Run the `Main` class.
3. Follow the on-screen prompts to interact with the mower database.

## Example Usage

```java
Engine engine = new Engine("Honda", 5.5, 1);
LawnTractor lawnTractor = new LawnTractor(engine, "Model X", 54.0);
MowerWareHouse wareHouse = new MowerWareHouse();
wareHouse.addMower(lawnTractor);
System.out.println(wareHouse);
```
