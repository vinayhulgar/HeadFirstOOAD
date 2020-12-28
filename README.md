# OOAD


:closed_book:An Object-Oriented Analysis and Design Process </br>
Object-oriented analysis (OOA), design (OOD), and programming (OOP) are related but distinct. OOA is concerned with developing an object model of the application domain. </br>
So, for example, you take the problem statement, generate a set of features and (possibly) use cases,[2] tease out the objects and some of the methods within those objects</br>
 that you’ll need to satisfy the use case, and you put together an architecture of how the solution will hang together. That’s object-oriented analysis.</br>

OOD is concerned with developing an object-oriented system model to satisfy requirements. You take the objects generated from your OOA, figure out whether to use inheritance, </br>
aggregation, composition, abstract classes, interfaces, and so on, in order to create a coherent and efficient model, draw the class diagrams, flesh out the details of what </br>
each attribute is and what each method does, and describe the interfaces. That’s the design.</br>

Some people like object-oriented analysis, design, and programming[3] and some people don’t.[4]</br>

OOA allows you to take a problem model and re-cast it in terms of objects and classes, and OOD allows you to take your analyzed requirements and connect the dots between </br>
the objects you’ve proposed and fill in the details with respect to object attributes and methods. But how do you really do all this?</br>

Well, here is a proposed process from that starts to fill in some of the details.[5] We’ll figure out the rest as we go along:</br>

Write (or receive) the problem statement: Use this to generate an initial set of features.</br>

Create the feature list: The feature list is the set of program features that you derive from the problem statement; it contains your initial set of requirements. The feature</br>
 list may be a set of user stories. To help generate the feature list, you can put together a set of scenarios, narrative descriptions of how the user will walk through using</br>
  the program to accomplish a task. A scenario should be technology agnostic and should be explicitly from the user’s perspective. It’s not how the program works; it’s about </br>
  what the user wants to accomplish and how the user gets the task done. It can also talk about what the user knows. User stories are very brief and high level. Scenarios are </br>
  longer and provide more detail. A user story might generate several scenarios.</br>

Write up use cases[6]: This helps refine the features, dig out new requirements, and expose problems with the features you just created. Use cases are more specific descriptions</br>
 of how a user accomplishes a task using the program; they describe how the user interacts with the system. Use cases “. . . capture the goal of an action, the trigger event </br>
 that starts a process, and then describe each step of the process including inputs, outputs, errors and exceptions. Use cases are often written in the form of an actor or user</br>
  performing an action followed by the expected system response and alternative outcomes.[7]” Each scenario or user story might create several use cases.</br>

Break the problem into subsystems or modules or whatever you want to call them as long as they’re smaller, self-contained bits usually related to functionality.</br>

Map your features, subsystems, and use cases to domain objects; create abstractions.</br>

Identify the program’s objects, methods, and algorithms.</br>

Implement this iteration.</br>

Test the iteration.</br>

If you’ve not finished the feature list and you still have time and/or money left, go back to step 4 and do another iteration, otherwise . . .</br>

Do final acceptance testing and release.</br>

Note that this process leaves out a lot of details, like the length of an iteration. How many features end up in an iteration? How and when do we add new features to the </br>
feature list? How exactly do we identify objects and operations? How do we abstract objects into classes? Where do we fix bugs that are found in testing? Do we do reviews of </br>
code and other project work products?</br>

Leaving out steps here is okay. We’re mostly concerned with the analysis and design elements of the process. We’ll discuss ideas on the rest of the process in this chapter,</br>
 and some of the answers are also in Chapter 3 on project management.</br>

How do the preceding process steps fit into the software development life cycle? Well, I’m glad you asked. Recall that the basic development life cycle has four steps:</br>

Requirements gathering and analysis</br>

Design</br>

Implementation and testing</br>

Release, maintenance, and evolution</br>

We can easily assign the previous ten steps into four buckets, as follows:</br>

Requirements Gathering and Analysis</br>
Problem statement</br>

Feature list creation</br>

Use case generation</br>

Design</br>
Break up the problem.</br>

Map features and use cases to domain objects.</br>

Identify objects, methods, and algorithms.</br>

Implementation and Testing</br>
Implement this iteration.</br>

Test the iteration.</br>

If you’ve not finished with the feature list or out of time, go back to step 4, otherwise . . .</br>

Release/Maintenance/Evolution</br>
Do final acceptance testing and release.</br>

Once again we can ignore the details of each process step for now. These details really depend on the process methodology you choose for your development project. </br>
The description of the process just given uses an iterative methodology and can easily be fitted into an agile process or a more traditional staged release process.</br>


:closed_book: Requirements </br>
    :pushpin: Requirements are things your system must do to work correctly.</br>
    :pushpin: Your initial requirements usually comes from customer.</br>
    :pushpin: To make sure you have a good set of requirements, you should develop use cases  for your system.</br>
    :pushpin: Use cases detail exactly what your system should do.</br>
    :pushpin: A Use case has a sibgle goal, but can have multiple paths to reach that goal.</br>
    :pushpin: A good use case has starting & stopping condition, an external initiator & clear value to the user. </br>
    :pushpin: A use case is a simply a story about how your system works.</br>
    :pushpin: You will have at least one use case for each goalthat your system must accomplish.</br>
    :pushpin: After your use cases are complete, you can refine & add to your requirements.</br>
    :pushpin: A requirements list that makes all your use cases possible is a good set of requirements. </br>
    :pushpin: Your system must work in the real world, not just when everything goes as you expect it to.</br>
    :pushpin: When things go wrong, your system must have alternate paths to reach the system's goals.</br>
    
