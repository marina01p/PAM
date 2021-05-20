# Topic: *Basic layout and UI | Application API layer*
## Author: *Petici Marina*


## Table of contents
* [Introduction](#introduction)
* [Tasks](#tasks)
* [Status](#status)

## Introduction
This is the laboratory work no. 3 for the Mobile Applications Programming course at the Technical University of Moldova.
   
## Tasks

--------------------------------------------------------Laboratory no. 2--------------------------------------------------------

-------------------------------------------------------Basic layout and UI------------------------------------------------------

1. Pick a theme for your app. You will not be allowed to change theme after this lab.
2. Implement design for at least 3 functional screens, this means to create such screen as main home screen, feed or another screen which relates to app business logic.
3. Don't focus on sign in / sign up screen (there is no so much fun in creating that screens), but you are encouraged to add them too.
4. At least 1 screen should present collection of data, in other words list of elements.
List should contain at least 30 elements. For this lab you could hardcode data which you will use in order to populate list, or it could be a dummy data, but it should be human readable.
5. Try to implement list with multiple columns at least 2, also you could try to implement list with multiple directions of scrolling, like list where elements could scroll vertical as usually, and row could scroll horizontally.
6. Create your UI and layout to support portrait and landscape orientations and different screen sizes starting from phone with small screens (4 inch) to tablets with screen size 12 inch. Supporting of different screen sizes and orientation is mandatory.

--------------------------------------------------------Laboratory no. 3--------------------------------------------------------

------------------------------------------------------Application API layer-----------------------------------------------------

1. Pick an API it could be public or private in case you have access to it. You could use your own API or TCP server (in case you a building chat). In case if you use Firebase or another serverless service, please add integration to Firebase but also implement connection to another API by performing standard HTTP requests.
2. Implement at least 2 GET and 2 POST requests. At least 1 of your request should send data to API by request body in JSON format, but not by URL queries.
3. On Android you should use Retrofit(https://square.github.io/retrofit/).
4. Add 2 more screens with implemented design, your app should have at least 5 screen, not just layout, but with implemented design.
5. Add basic navigation component for in app navigation drawer menu (swipeable menu from left to right), or tab bar navigation (bottom bar with tabs) .

--------------------------------------------------------Laboratory no. 4--------------------------------------------------------

--------------------------------------------------- Application Architecture ---------------------------------------------------

1. Perform a research on several mobile app architectures, they are almost the same for both platforms. Most popular architecture are MVC, MVP, MVVM, RIBs https://github.com/uber/RIBs , VIPER mostly for iOS, Hexagonal architecture https://en.wikipedia.org/wiki/Hexagonal_architecture_(software) 
2. Pick up an architecture which fits the best your project [MVP] and refactor your code base to selected architecture. 
3. Your codebase should be refactored to follow idiomatic representation of selected architecture. 
4. Ffollow principles of "Clean Architectures" https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html and "Clean code" https://www.investigatii.md/uploads/resurse/Clean_Code.pdf.

--------------------------------------------------------Laboratory no. 5--------------------------------------------------------

----------------------------------------------- Mobile application Unit testing ------------------------------------------------

Cover at least 3 Business Logic Modules with Unit Tests. Use only build in platform frameworks for tests. For Android it is JUnit.
Select and add at least one test of next categories:

1. Integration tests - Tests which check integration of several modules of your app or platform. In context of mobile app these can be tests where you perform network requests to real or mocked API and check app API layer behavior, these test can include testing of serialization and deserialization, check of requests components, check of returned API response.

2. UI tests (a.k.a Automation Tests) - Tests which perform real user action of interaction with UI elements in automated way. Actually it is a code which press buttons and interact with your app

3. Snapshot tests - Tests which perform screenshot of your app and compare it with previously recorded reference image.

## Status
This project is not finished.

