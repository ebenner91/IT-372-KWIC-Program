# IT-372-KWIC-Program
IT 372 assignment - A "KWIC" Program

## Writeup:

_What criteria did you use to decompose the first design?_  
The criteria for decomposing the first design was to split its major components into their own functions.

_What criteria did you use to decompose the second design?_  
The criteria for the second design was to split the major functionality into separate classes which contained multiple 
methods to handle the various aspects of the task.

_Which design is more resilient to change? And why?_
The second design is more resilient to change, as it is more modular. The separate pieces of the design can be re-used 
new designs with little or no adjustment.

_What would have to change in the first design/implementation if the file were changed out for a database?_  
New methods would be required in order to handle the database IO, and changes would need to be made to the existing
methods as the IO functionality is tied in with other key functionality. 

_What would have to change in the second design/implementation if the file were changed out for a database?_  
A new IO class would need to be written to handle database IO as opposed to file IO.

_What would have to change in the first vs second design/implementation if we wanted to use a graphical user interface 
instead of the traditional console UI (System.out)?_  
Both designs would require a new driver that implements GUI controls. Sysout statements would need to be removed from 
both designs.

_Identify another change that may happen in the future, and how does design 1 compare to design 2 when it comes to impact
of the change?_  
A possible future change could be the ability to allow the user to enter their own input file. In the first design, 
hard-coded references to the infile would need to be altered to be replaced by a parameter. In the second design, the 
constant currently beinf used would need to be adjusted into a parameter. Both would require some reworking, however I 
believe reworking the constant would be a bit easier than the card-coded references.

_Which design/implementation is easier to understand?_  
The first design, as the design elements are broken up more simply.

_Which design/implementation is better performing?_  
Version 2 performs better as it handles the requirements more effectively and efficiently.

_How does the principle of information hiding relate to all of this?_  
Information hiding involves separating elements of the software design out so that changes in one element do not
adversely affect other elements of the design. This exercise emphasizes the importance of information hiding by causing 
us to think about how various changes could affect elements of the design if information hiding is not properly carried
out.