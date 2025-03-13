Fantasy Baseball Helper
by: Jacob Moore

Welcome to Fantasy Baseball Helper – a web-based application designed to assist fantasy baseball players in making smarter draft decisions.
This project provides tools for managing player targets, batting and pitching projections, and more, to help you dominate your fantasy baseball league.

Overview
Fantasy Baseball Helper is a Spring Boot-based web application with the following features:
	•	Manage player targets with draft round expectations and notes.
	•	View and manage batter and pitcher projections.
	•	Display detailed statistics for batters and pitchers.
	•	User-friendly interface powered by Thymeleaf templates.
Features
	•	Player Targets: Add, update, delete, and view player targets for fantasy baseball drafts.
	•	Batting Stats: Display and analyze batting statistics for players.
	•	Pitching Stats: Display and analyze pitching statistics.
	•	Projections: View batting and pitching projections for the 2025 season.
	•	Responsive UI: The user interface is built using HTML, CSS, and Thymeleaf, providing a clean and intuitive experience.
Technologies Used
	•	Spring Boot: The application is built with Spring Boot, providing a robust foundation for the back-end services.
	•	MySQL: The database used for storing player targets and projections.
	•	Thymeleaf: A templating engine used for rendering the front-end views.
	•	Spring Data JPA: For managing database operations and querying the MySQL database.
	•	Spring Security: Used for implementing security features (if applicable in your future updates).
	•	JUnit and Mockito: Used for testing the functionality of services and repositories.

Prerequisites
	•	Java 21 or higher
	•	MySQL 5.7 or higher
	•	Maven 3.6.0 or higher

Database Setup
The application uses MySQL for data storage. The required schema is created automatically with the spring.jpa.hibernate.ddl-auto=update property in application.properties.

Additional Notes
	•	The application logs activity in logs/application.log for debugging purposes, and Spring Boot uses DEBUG level logging for your application's custom packages.
	•	The front-end utilizes Thymeleaf for rendering HTML templates, and CSS styling is provided through the linked stylesheets.

