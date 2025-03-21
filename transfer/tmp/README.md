# Temporary Data and Webserver

This folder contains temporary data and a webserver used for communication with the EDC).

## Folder Structure

- **data/**: 
  - This folder contains JSON files with simulated measurement series used for communication with the EDC.
  - These data are used to test and simulate the interaction with the EDC.

- **webserver/**: 
  - The webserver provides API routes to retrieve and return the content from the JSON files in the `data/` folder.
  - The API allows HTTP requests to fetch the simulated data and interact with the GUI.

## Usage

- The EDC, which is included in this repository, uses the simulated measurement series from the `data/` folder.
- The GUI can access the data via the webserver and interact with the EDC to process and display the measurement series.

The data in this folder is temporary and may be updated or replaced in future versions of the project.
