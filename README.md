# Topic: *App basic setup*
## Author: *Petici Marina*


## Table of contents
* [Introduction](#introduction)
* [Tasks](#taasks)
* [Implementation](#implementation)
* [Results](#results)
* [Status](#status)

## Introduction
This is the laboratory work no. 1 for the Mobile Applications Programming course at the Technical University of Moldova.
   
## Tasks

1. Init mobile application on selected platform
2. Create at least 2 screens which transfer data from one screen to another
3. Perform some data changes to data you received in screen No. 2 and pass it back to screen No. 1
4. Add at least one active element on the screen, ex. button, text field and handle its action. Some not trivial action handling are welcome :)
5. Change Icon of the app to custom one

## Implementation

1. For this univrsity course I chose to work with Kotlin and Adroid Studio.
2. After initializing a new project, I created a new activity (*SecondActivity.kt* along with *activity_second.xml*) and a spinner * button into the main screen, in order to pass data to the second one. The data was passed with the help of Intent, which provided runtime binding between the activities.

```
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("cityName", txtArea.text.toString());
```

3. The data from MainActivity.kt is transmitted into a text area created in the second activity, and the user is able to performe some changes to it and then pass it to the main screen, where it will be displayed.
4. Lastly, I changed the icon of my app into a new customized one.

## Results
![alt text](https://github.com/marina01p/PAM/tree/lab1/Results)

## Status
This project is finished.

