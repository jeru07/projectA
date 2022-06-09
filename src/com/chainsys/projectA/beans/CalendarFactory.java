package com.chainsys.projectA.beans;
//multiple factory methods in one class
public class CalendarFactory 
{
    public Calendar createCalendar()
    {
    	//calendar constructor is default so can be called here
    	return new Calendar();
    }
    public Appointments createAppointment()
    {
    	return new Appointments();
    }
}
