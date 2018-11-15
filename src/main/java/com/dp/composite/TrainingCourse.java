package com.dp.composite;

/* This application is concerned with training courses.
 * A course has a title, a fee and a list of sessions. However,
 * sometimes a course can consist of several modules, each of which is a
 * course. For example, there may be a compound course "Fast track to
 * becoming a web developer" which consists of three modules: a course
 * named "HTML", a course named "FrontPage" and a course named "Flash".
 * It is possible for a module to consist of some other modules.
 * If a course consists of modules, its fee and schedule are totally
 * determined by that of its modules and thus it will not maintain
 * its list of sessions.
 * Point out and remove the code smells in the code */


import java.util.Date;

class Session {
    Date date;
    int startHour;
    int endHour;
    int getDuration() {
        return endHour-startHour;
    }
}

abstract class Course {
    String courseTitle;
    Course(String courseTitle) {
//        ...
    }
    String getTitle() {
        return courseTitle;
    }
    abstract double getFee();
    abstract double getDuration();
}

class SimpleCourse extends Course {
    Session sessions[];
    double fee;
    SimpleCourse(String courseTitle, double fee, Session sessions[]) {
        super(courseTitle);
//        ... some logic here
    }
    double getFee() {
        return fee;
    }
    double getDuration() {
        int duration=0;
        for (int i=0; i<sessions.length; i++) {
            duration += sessions[i].getDuration();
        }
        return duration;
    }
    void setFee(int fee) {
        this.fee = fee;
    }
}

class CompoundCourse extends Course {
	Course modules[];
    CompoundCourse(String courseTitle, Course modules[]) {
        super(courseTitle);
//        ... some logic here
    }
    double getFee() {
        double totalFee = 0;
        for (int i=0; i<modules.length; i++) {
            totalFee += modules[i].getFee();
        }
        return totalFee;
    }
    double getDuration() {
        int duration=0;
        for (int i=0; i<modules.length; i++) {
            duration += modules[i].getDuration();
        }
        return duration;
    }
}
