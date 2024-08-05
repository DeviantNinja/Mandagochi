# My Devlog of this project
I thought it might be a good idea to put down my thought and problems im facing as i try and code this, so i can look back on it one days and see why i gave up, or how far ive come who knows :) 

My insperation for the project is my boss who while a nice person is an awful boss with obvioulsy undiagnosed issues such as ADHD, they can be hyper focused, gives you jobs to do with incositance information often wrong or just not sufficent to complete the tasks in any sort of effiecnt manner, you often have to clarify points with people whses supposed to have spoken to or take a wild guess as to what they want. so this i my form of stress relief mocking them in a way that helps me progress into a future. I should thank them as they gave me the push i needed to actually start looking at changing my carer into software development that i was deralied from in my younger years. 

I have started Uni, because i had to drop out of uni due to being to imature and having a number of family issues at the time and am starting a boot camp in the upcoming month, this is just a littel side project i figured i could do for fun. 

#### The Project

The project is a twist on a virtual pet, but instead of just looking after a little pet you have an evil boss that will but unlike just making sure the pet stays alive, its a constant battle between you and your bosses stress levels, as they continuesly give you a mountin of work that cant possible be done thier frustration grows at you not completing it, and your frustration grows with the never ending insanse workload. your job as the player is balance your stress level and theirs so that they dont fire you, and you dont kill them. 

The main mechanic of the game will be a task list that you have to try and manage, tasks will take varying amount of time to complete based on complexity and task clarity and completing tasks will lower thier frustration and yours, you will also have a few skills that can cheer up your boss to slow down the amount of tasks they are giving out and lower thier frustration and a number of actions you can employee to manage your own stress level. Originally it was just going to be a number of tools you can have to torture your boss, such as poisioning, setting on fire etc. I think these will still be there but i figures that cant be all there is. 


### Week 1 - 29th July 2024

came up with a number of ideas for the project as discussed in the project idea above many which i think will be added in future weeks as they may be a little ambitious given how little i know, but i expect i just need to break it down so i laid out a road map as shown below. 

- Stage 1 - super simple pet functionalty (console)
- Stage 2 - basic gui not pretty but functional
- Stage 3 - add in Task Management
- Stage 4 - add in data percistance database/text file save?
- Stage 5 - add in player status and frustration level mechanic
- Stage 6 - improve gui design and animiations
- Stage 7 - Polish Polish Polish

working on stage 1 at the moment and i've had a number of issues most of them in regards on how excuse a loop function that update the stats of the tomogochi every few minutes so that it gets hungrier or tired etc. I orignally set up a while loop in the tomogochi class but it seems that the while loop starts running, and as it never ends blocks the exceution of anything else even if its running in a differnt class. My guess is that the application runned linearly and not concurrently using differnt threads like i throught it might. I'll have to look into that. 

If this is true i exepct the same issue will happen with a console menu waiting for entry will block the check of the current time vs the last updated time. I have no idea how i could get around this. Based on the limted stuff i have read and watched on yourtube, this seems to be handled much better when using a GUI due to action listeners. not sure how i can progress from here :| oh well im going to take a break and will be back. Guess i will need to look at another solution :) 

okay took a break and did some research and it seems that timer and timer task does what i need it too, not sure this is the best way to do it, but it works. 

```
        TimerTask gameTask = new TimerTask() {

            @Override
            public void run() {
                passtime();
            }
            
        };

        Timer gameLoop = new Timer();

        gameLoop.scheduleAtFixedRate(gameTask, 0, 1000 * 10);
```

while the its not fully tested, and defintily not fun to play figuring out some of the stuff was fun. Given that its intended final form is never going to be console based theres not much point in continuing the console version. got alot of the basic elemetns working so im happy enough with the progress i made coding it over the last couple of days. still a few things i dont really understand well and im sure there will be many more.

onto stage 2 tomorrow. 

##### stage 2 - basic gui

I think the basic gui is going to be a phone screen style Jframe say 400x800, a large display window that would display the pet when i eventaully get to the point with 3 or 4 buttons across the bottom which will control the various actions and some visable way to see the pets stats so you know what it needs. 

May put a placeholder textbox as the the image, so i can update the pet state, Playing, Eating, Sleeping etc. 


###### 04/08/204

Playing with GUI's in java is a learing curve to be sure, but im starting to get the hang of it, not sure what the best way to do things are but i've got a basic layout. Its definitly not pretty but it works :) 

Next Event Listeners so when i click a button an action is preformed, and then linking it to the basic model from stage 1.

okay so the event listeners were easier than i expected, so was the gui  i expanded the stage 2 steps to work on this week by the end of this stage i would like a fully fucntioning super basic pet.

im not 100% sure what i want the basic pet to do currently mapped some thoughts below.

- Stage 2 - basic gui not pretty but functional
    - Create a basic Gui
        - pet screen
        - buttons to interact with pet
        - stats screen
    - Add Event Listeners
        - Play
        - Clean
        - Feed
    - write a fully functional basic pet class 
        - Methods
            - Play
            - Clean
            - feed
            - gameTick 
            - getHappiness
            - getTiredness
            - getCleanness
            - getHungriness
            
    - create a simple game loop to adjust stats periodicly
    - create timers for the buttons so that they cant be used to frequently
    - create a state manager to say how the pet is feeling, update temp images, happy, sad, dirty, sleepy etc. 

###### 05/08/2024

Not much time today but i didnt want to do nothing so i added the game loop which seems to work along with the other action listeners. Also started looking for some game spirtes so i can put some simple animations in place for the actions which sould make it a little less boring to look at while im working on other stuff. Also started to wonder how i could make the task list tasks not sure im going to be able to make it all pretty like id want, but id be happy just making something that functions how i imagine it. and so far so good but lots to go :)

I've got most of stage 2 completed, need to add in some timers to prevetn the buttons being spammed and a basic state manager. and maybe look at doing some animated sprites to show the mood. I think task management will be next weekend. 