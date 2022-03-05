
public class notes {

	/*
	 * 
	 * <body>
  <h1>
    Hello and welcome to Teacher Lottery
  </h1>
  
  <p>
    The purpose of Teacher Lottery is to create a lottery for teachers. The name is subject to change, but the general idea is that teachers should get paid more. 
  </p>
  
  <ul>
    <strong>Initial Ideas:</strong><br>
    <li>A percentage of all donations goes to a Jackpot. The remainder is held to fund the project. IE: "Winnings total 70% / 80% / 90% of donations."</li>
    <li>There should be an entry for every currently employed teacher.</li>
    <li>The entries should be separated by each of the 50 states.</li>
    <li>Initially, this means public school teachers, but could be expanded to include private school teachers, college professors, etc.</li>
    <li>Substitute teachers should be included.</li>
    <li>Every teacher that is included starts with one entry in the data structure.</li>
    <li>For every donation of a set dollar amount, a teacher can gain an additional entry in the data structure. This could also be achieved by creating a weighted system to allot a 
    weight to each teacher entry.</li>
    <li>Like any lottery, a teacher is selected at random and awarded the jackpot.</li>
    <li>People can donate any dollar amount, but only a certain dollar amount secures an additional entry count for a desired teacher.</li>    
  </ul>
  
  <ul>
    <strong>User Stories / Required Aspects</strong>
    <li>Random Number generated within a range. - Done</li>
    <li>Data Structure created to contain every required entry for each teacher.</li>
    <li>50 Data Structures created to represent each of the 50 states. (Each state may require different circumstances for this project)</li>
    <li>Business license / gambling license for this project.</li>
    <li>Potentially different business / gambling licenses for all 50 states.</li>
    
  
  <p>
    Click the button to display a random number.
  </p>
  
  <button onclick="ranFunction()">
    Random Number
  </button>
  
  <p id="ranNumDisplay">
    0.0
  </p>
  <p>
    Click the button to display a random number between within a range. This is inclusive of the upper and lower limit numbers.
  </p>
  
  <button onclick="ranFunctionRange(0,100)">
    Random Number Within a Range
  </button>
  
  <p id="ranNumDisplayRange">
    0.0
  </p>
  
  <p>
    Fill out the following form to enter a new Person entry into our records.
  </p>
  
  <form>
    
  </form>
  
</body>
	 */
	
	/*
	 *function ranFunction() {
  document.getElementById("ranNumDisplay").innerHTML = Math.random(); //0.11372350888696858
}

function ranFunctionRange(lower, upper) {
  //document.getElementById("ranNumDisplayRange").innerHTML = Math.floor(Math.random() * (upper - lower)) + lower;
  document.getElementById("ranNumDisplayRange").innerHTML = Math.floor(Math.random() * (upper - lower + 1)) + lower; //<- Returns a random number, within the desired range, that's 
  //inclusive of the upper limit. IE, if you want a number between 0 and 100, you can get any number between 0 and 100 that includes both 0 and 100.
}

function newTeacher() {
  //Constructor for a new Teacher object.
  //Should create and add a Teacher object to a data structure
} 

_______________________________________________________________________________________________________________________________________________

Major Responsibilities

Develop and deliver assigned development projects/tasks within agreed schedule, quality and scope expectations
Participate in all stages of the SDLC within an agile Scrum environment
Provide operational support of key applications
Provide off hours production support
Performs other duties as assigned

Skills/Knowledge Required

Development experience with Angular, SpringBoot, RESTful Web Services and Tomcat
Working experience with source control systems (Bitbucket, Git), and CI/CD tools (Jenkins, Bamboo, other)
Hands on familiarity with JUnit Framework
Good knowledge of Object Oriented Programming concepts and Design patterns
Working knowledge of RDBMS and SQL
Experience with multiple operating systems: Linux/Unix/Windows
Ability to communicate with both IT and non-IT partners
Detail oriented
Good communication skills
Ability to deliver results in a fast paced environment
Must be self motivated with ability to work independently and as part of a team
Education and Experience

Bachelor’s degree in relevant discipline (e.g. MIS, Engineering, Computer Science or related technical degree) required
At least 2 years of experience in Information Technology
At least 1 years of experience working with Angular
At least 1 years of experience working with Java and/or SpringBoot

Scrum:
	A set of practices used in agile project management that emphasize daily communication and the flexible reassessment 
	of plans that are carried out in short, iterative phases of work

Angular:
	Angular is a TypeScript-based free and open-source web application framework led by the Angular Team at Google and 
	by a community of individuals and corporations. Angular is a complete rewrite from the same team that built AngularJS
	
API:
	Application Programming Interface. Think Libraries 

SpringBoot:
	Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
	We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. 
	Most Spring Boot applications need minimal Spring configuration.
	If you’re looking for information about a specific version, or instructions about how to upgrade from an earlier release, 
	check out the project release notes section on our wiki.
	https://github.com/spring-projects/spring-boot/wiki#release-notes
	
	Spring Boot takes an opinionated view of building production-ready Spring applications. Favors convention over configuration
	and is designed to get you up and running as quickly as possible.

	See spring.io/projects/spring-boot for details.
	
RESTful Web Services:
	Representational state transfer (REST) is a software architectural style that was created to guide the design and development 
	of the architecture for the World Wide Web. REST defines a set of constraints for how the architecture of an Internet-scale 
	distributed hypermedia system, such as the Web, should behave. The REST architectural style emphasises the scalability of 
	interactions between components, uniform interfaces, independent deployment of components, and the creation of a layered 
	architecture to facilitate caching components to reduce user-perceived latency, enforce security, and encapsulate legacy 
	systems.

	RESTful web services are platform-independent.
	It can be written in any programming language and can be executed on any platform.
	It provides different data format like JSON, text, HTML, and XML.
	It is fast in comparison to SOAP because there is no strict specification like SOAP.
	These are reusable.
	They are language neutral.

HTTP:
	Hyper Text Transfer Protocol
	
HTTPS:
	"" Secure (Encrypted)
	
IP:
	Internet Protocol (Internet Rules / Standards)
	192.168.19.0
	2001:0db8:0000:0042:0000:8a2e:0370:7334 - 2^128 or 3.4 * 1038 or 3.40282367E38 or 340,282,366,920,938,463,463,374,607,431,768,211,456
	
TCP:
	Transmission Control Protocol - 3 way handshake connection - client requests connection, server accepts and acknowledges connection, client acknowledges connection

UDP:
	User Datagram Protocol - Fire hose data transmission - VoIP (Voice Over IP) - Streaming 
	
Port Numbers:
	Addresses within the computer for services. 
	https://packetlife.net/media/library/23/common_ports.pdf
	20-21 FTP
	22 - SSH Secure Shell - Encrypted terminal to access a computer remotely
	53 - DNS
	23 - Telnet
	80 - HTTP
	443 - HTTPS
	Ephemeral Ports - High numbered (often randomized)

Network Layers:
	Physical (e.g. cable, RJ45)
	Data Link (e.g. MAC, switches)
	Network (e.g. IP, routers)
	Transport (e.g. TCP, UDP, port numbers)
	Session (e.g. Syn/Ack)
	Presentation (e.g. encryption, ASCII, PNG, MIDI)
	Application (e.g. SNMP, HTTP, FTP)

Tomcat
	https://tomcat.apache.org/
	The Apache Tomcat® software is an open source implementation of the Jakarta Servlet, Jakarta Server Pages, Jakarta Expression Language, Jakarta WebSocket, Jakarta 
	Annotations and Jakarta Authentication specifications. These specifications are part of the Jakarta EE platform.
	The Jakarta EE platform is the evolution of the Java EE platform. Tomcat 10 and later implement specifications developed as part of Jakarta EE. Tomcat 9 and earlier 
	implement specifications developed as part of Java EE.
	The Apache Tomcat software is developed in an open and participatory environment and released under the Apache License version 2. The Apache Tomcat project is 
	intended to be a collaboration of the best-of-breed developers from around the world. We invite you to participate in this open development project. To learn more 
	about getting involved, click here.
	Apache Tomcat software powers numerous large-scale, mission-critical web applications across a diverse range of industries and organizations. Some of these users 
	and their stories are listed on the PoweredBy wiki page.
	Apache Tomcat, Tomcat, Apache, the Apache feather, and the Apache Tomcat project logo are trademarks of the Apache Software Foundation.

Jakarta Servlet
	The life cycle begins as soon as it is called by the Web sever to load into the container. Grossly, it has a three-phase life: instantiation and initialization, 
	service, and destruction. Figure 2: The life cycle...

Servlet
	A Java servlet is a Java software component that extends the capabilities of a server. Although servlets can respond to many types of requests, they most commonly
	implement web containers for hosting web applications on web servers and thus qualify as a server-side servlet web API. Such web servlets are the Java counterpart 
	to other dynamic web content technologies such as PHP and ASP.NET.

Working knowledge of RDBMS and SQL

	Relational Database Management Systems
	
	Structured Query Language

Employees
FirstName LastName PhoneNumber EmpID ParkingSpot HireDate
Jane 	  Doe      111-222-3333 1    Yes        1-1-22


ProjectGroups
FirstName LastName ProjectTeamName ProjectTeamID EmpID 
Jane 	  Doe      WMS             5             1

Products
ProductName ProductID Brand ValueTier StockQuantity


SELECT * FROM Employees WHERE HireDate = 1-1-22;

Bitbucket
	Bitbucket is a Git-based source code repository hosting service owned by Atlassian. Bitbucket offers both commercial plans and free accounts with an unlimited 
	number of private repositories.
	
CI / CD
	In software engineering, CI/CD or CICD is the combined practices of continuous integration and either continuous delivery or continuous deployment. CI/CD bridges 
	the gaps between development and operation activities and teams by enforcing automation in building, testing and deployment of applications. CI/CD services compile 
	the incremental code changes made by developers, then link and package them into software deliverables. Automated tests verify the software functionality, and 
	automated deployment services deliver them to end users. The aim is to increase early defect discovery, increase productivity, and provide faster release cycles. 
	The process contrasts with traditional methods where a collection of software updates were integrated into one large batch before deploying the newer version. 
	Modern-day DevOps practices involve continuous development, continuous testing, continuous integration, continuous deployment and continuous monitoring of software 
	applications throughout its development life cycle. The CI/CD practice, or CI/CD pipeline, forms the backbone of modern day DevOps operations.

Bamboo
	What is Bamboo CI Server? Bamboo is a continuous integration server that is used to automate the testing of any software program or application for a quicker release 
	creating a continuous delivery pipeline. 

Jenkins
	Jenkins is an open source automation server. It helps automate the parts of software development related to building, testing, and deploying, facilitating continuous 
	integration and continuous delivery. It is a server-based system that runs in servlet containers such as Apache Tomcat. It supports version control tools, including 
	AccuRev, CVS, Subversion, Git, Mercurial, Perforce, ClearCase and RTC, and can execute Apache Ant, Apache Maven and sbt based projects as well as arbitrary shell 
	scripts and Windows batch commands.

JUnit
	JUnit is a unit testing framework for the Java programming language. JUnit has been important in the development of test-driven development, and is one of a family 
	of unit testing frameworks which is collectively known as xUnit that originated with SUnit.
	
	
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
