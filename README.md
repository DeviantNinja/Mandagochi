# Mandagochi
A twist on a Tamagotchi where you keep a horrible boss

This is just me learning Java in a less boring way than tutorails in my free time, please dont take anyting seen here seriously i have no idea what im doing :)
using this to put ideas as im thinking about them in work lol, probs not what a readme is for but whatever works for me :) so guess its the desing doc

# Project Stages

I'm getting overwelmed by all the ideas im coming up with so this is a bsic idea of project stages, will eventually move this into a project board just planning out ideas. 

### Stage 1 - super simple pet functionalty
Simple pet class with simple game loop functionality
- eat
- clean
- pet
- get current mood
- pass time increase/decrease statuses
- game loop
  
### Stage 2 - basic gui not pretty but functional
add simple gui with basic non animated images
- Buttons for actions
- simple text or images for pet state based on actions and pet mood 
- some sort of status display to show happiness levels 

### Stage 3 - add in Task Management
- Task 
- Task Manager 

### Stage 4 - add in data percistance database/text file save?


### Stage 5 - add in player status and frustration level mechanic


### Stage 6 - improve gui design and animiations 

### Stage 7 - Polish Polish Polish 

### Notes on game design

### Game Loop
- Update player and Boss tasks every 5 min?
- Save State - would this be better to use a db although i have no experiance fun times

  
### Player Class


### Boss Class

### Task Manager Class
Hold the task lists and manages thier state
- Add task
- Remove task
- Update task
- Outstanding Tasks
- Completed task
  
### Task Class
fields required?
- unique id field?
- String Name
- DateTime creation
- DateTime started
- DateTime dueDate //for tasks that are urgent and have a time requirement.
- int difficulty
- int clarity
- int timeRequiredtoComplete
- boolean isCompleted
- boolean isUrgent
