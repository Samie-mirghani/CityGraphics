# CityGraphics

A Java Swing application that procedurally renders an interactive 2D cityscape with user-controlled weather and wildlife elements.

## Overview

CityGraphics is a graphical desktop application built with Java's AWT and Swing libraries. It renders a stylized urban landscape — complete with buildings, an ocean shoreline, clouds, and a sun — and gives users real-time control over dynamic scene elements. Users can specify the number of birds and rain particles to overlay onto the city, making each rendering unique.

The project demonstrates core object-oriented design principles including encapsulation, modular rendering, and event-driven GUI programming.

## Key Features

- **Procedural City Rendering** — Dynamically draws multiple buildings with proportionally scaled windows, doors, and door handles.
- **Interactive Scene Customization** — Users input the desired number of birds and rain drops via text fields, then generate the scene on demand.
- **Randomized Element Placement** — Birds and rain are positioned randomly across the canvas, producing a unique composition with every render.
- **Layered Environment Design** — The scene includes a sky gradient, sun, clouds, ocean waves, a cliff, and a recycling bin for rich visual depth.
- **Modular Architecture** — Each visual element (`Bird`, `Rain`, `City`) is encapsulated in its own class, promoting clean separation of concerns.
- **Event-Driven Interaction** — A `ButtonListener` action handler processes user input and triggers canvas repaints through Swing's event dispatch model.

## Tech Stack

| Component       | Technology           |
|-----------------|----------------------|
| Language        | Java                 |
| GUI Framework   | Java Swing / AWT     |
| Graphics Engine | `java.awt.Graphics2D` |
| Layout Manager  | `BorderLayout`, `FlowLayout` |
| Build Target    | JDK 8+               |

## System Architecture

```
┌─────────────────────────────────────────────────┐
│                  ProjectMain                     │
│          (Entry Point / JFrame Setup)            │
└──────────────────────┬──────────────────────────┘
                       │
                       ▼
┌─────────────────────────────────────────────────┐
│                    setup                         │
│     (JPanel with controls + DrawingPanel)        │
│                                                  │
│  ┌──────────────┐   ┌────────────────────────┐  │
│  │ Input Fields  │──▶│    buttonListener      │  │
│  │ + Draw Button │   │  (ActionListener)      │  │
│  └──────────────┘   └───────────┬────────────┘  │
│                                 │                │
│                                 ▼                │
│                    ┌────────────────────────┐    │
│                    │     DrawingPanel       │    │
│                    │ (Custom paintComponent) │    │
│                    └───────────┬────────────┘    │
└────────────────────────────────┼────────────────┘
                                 │
                                 ▼
┌─────────────────────────────────────────────────┐
│                     City                         │
│       (Scene Renderer + Object Manager)          │
│                                                  │
│   drawCity() ─▶ building(), drawBird(), drawRain │
│                                                  │
│   ┌──────────┐          ┌──────────┐            │
│   │   Bird   │          │   Rain   │            │
│   │ (Model)  │          │ (Model)  │            │
│   └──────────┘          └──────────┘            │
└─────────────────────────────────────────────────┘
```

**Data Flow:** `User Input → buttonListener → City.createBirds() / City.createRain() → DrawingPanel.repaint() → City.drawCity()`

## Setup & Installation

### Prerequisites

- **Java Development Kit (JDK)** 8 or higher

### Build & Run

```bash
# Clone the repository
git clone https://github.com/samie-mirghani/citygraphics.git
cd citygraphics

# Compile all source files
javac *.java

# Launch the application
java ProjectMain
```

### Usage

1. Enter the desired number of **birds** in the first text field.
2. Enter the desired number of **rain drops** in the second text field.
3. Click **"Draw Picture"** to render the cityscape with your chosen elements.

## Project Structure

```
CityGraphics/
├── ProjectMain.java   # Application entry point; initializes JFrame
├── setup.java         # UI layout, input handling, and drawing panel
├── City.java          # Scene composition and rendering logic
├── Bird.java          # Data model for bird coordinates
├── Rain.java          # Data model for rain drop coordinates
└── README.md
```

## Suggested Tags

`java` · `swing` · `awt` · `2d-graphics` · `gui-application` · `computer-graphics` · `interactive-visualization` · `object-oriented-programming`

## License

This project is provided for educational purposes.
