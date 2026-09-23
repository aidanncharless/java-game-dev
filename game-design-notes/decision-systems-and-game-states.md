// GAME DESIGN STUDY 02 - DECISION SYSTEMS & GAME STATES

GAME: THE LEGEND OF ZELDA: BREATH OF THE WILD OR TEARS OF THE KINGDOM

1. FIND FIVE EXAMPLES OF CONDITIONAL LOGIC IN THE GAME. THINK ABOUT SITUATIONS WHERE THE GAME EFFECTIVELY ASKS A QUESTION BEFORE DECIDING WHAT HAPPENS. WRITE EACH ONE AS: IF [condition] -> THEN [result] -> ELSE [other-result]

a. climbing & stamina - the game continuously checks if link has enough stamina to continue climbing. if stamina > 0, then link can continue climbing. else, link loses his grip and falls. this creates resource-management decision making. the player has to judge whether link has enough stamina to reach the destination before committing to the climb.
b. environmental temperature - certain areas are dangerously hot or dangerously cold. if link has sufficient temperature resistance, then link remains safe. else, link begins taking environmental damage. resistance to elements and weather can come from things such as the appropriate armor or temporary buffs from food/elixir effects. this integrates the environment itself with the player's gameplay rather than it simply being scenery.
c. weapon durability - weapons have limited durability. if weapon durability > 0, then weapon remains usable. else, weapon breaks. this encourages the players to rotate equipment rather than finding one powerful weapon and using it indefinitely.
d. health and death - the game constantly maintains link's current health.. if hearts > 0, then link remains alive. else, link is defeated.
e. paraglider and stamina - while link is gliding: if stamina remains, then continue gliding. else, link can no longer continue gliding. this creates another traversal constraint. even after obtaining the paraglider, the player doesn't simply gain unlimited flight.

2. FIND AN EXAMPLE REQUIRING MULTIPLE CONDITIONS. FIND SOMETHING THAT CONCEPTUALLY RESEMBLE: IF (conditionA && conditionB), IF (conditionA || conditionB). EXPLAIN WHY THE GAME NEEDS MORE THAN ONE CONDITION TO DECIDE THE OUTCOME.

temperature resistance is a good example of game logic involving several pieces of state. for example, link enters a freezing area. conceptually, the system might need to consider: if environment is dangerously cold AND link does not have enough cold resistance, then apply cold damage. 
in java:
if (isFreezing && !hasEnoughColdResistance) {
    // cold affects link
}

since the environment alone doesn't determine if link is affected, the plauer's current equipment and effects have to be taken into account as well. this is why multiple conditions are useful, the same environment can produce different consequences depending on the player's state.

3. ANALYZE ONE CHANGING GAME STATE. PICK SOMETHING LIKE LINK'S HEALTH, STAMINA, TEMPERATURE/ENVIRONMENTAL STATUS, EQUIPMENT DURABILITY, OR ANOTHER SYSTEM. DRAW HOW THAT STATE CHANGES AND HOW THE GAME REACTS: STATE -> event happens -> state changes -> game checks condition -> consequence

changing game state - stamina. link begins with available stamina -> link starts climbing -> stamina decreases -> does stamina remain? (yes) (no). if (yes), then continue climbing, if (no), then fall. when link stop performing stamina-consuming actions, stamina can recover. stamina can also recover if link consumes an elixir or food with stamina restoring properties.
so the system is constantly changing and checking a value:
current stamina -> player action -> stamina decreases -> check remaining stamina -> determine consequence

4. ANALYZE PLAYER FEEDBACK. WHEN ONE OF THESE CONDITIONS BECOME IMPORTANT, HOW DOES NINTENDO COMMUNICATE IT TO THE PLAYER? LOOK FOR VISUAL CHANGES, HUD ELEMENTS, SOUNDS, ANIMATIONS, WARNINGS, CONTROLLER FEEDBACK, ETC. (THINK: HOW DOES THE PLAYER KNOW WHAT THE SYSTEM DECIDED?)

a programmer could technically make stamina work without showing the player anything. but that would be frustrating because the player wouldn't understand why they suddenly fell. so, in botw/totk, feedback is provided. for stamina, the player sees the circular stamina meter appear near link. as stamina is consumed, the meter visibly empties. health is represented through the heart-baeed HUD. weapons approaching destruction produce warnings and other feedback, so the player can anticipate that their equipment is about to break. environmental danger is communicated through the temperature gauge, link's animations/reactions, environmental visuals, sound, and health loss when protection is insufficient. this creates an important game-design principle: if the game makes an important decision based on hidden information, the player usually need feedback that helps them understand what happened and why. 

5. DESIGN QUESTION - PICK ONE CONDITIONAL SYSTEM FROM THE GAME AND IMAGINE NINTENDO REMOVED IT. EXPLAIN HOW REMOVING THAT DECISION/CHECK WOULD AFFECT DIFFICULTY, STRATEGY, EXPLORATION, PLAYER CHOICE, AND/OR GAME FEEL.

what if stamina didn't limit climbing? it sounds extremely convenient, but it would significantly change exploration. 
route planning would matter less. when climbing a mountian in the game, usually the player would look for ledges, alternate paths, stamina-restoring foods, better weather or another approach. unlimited climbing would remove much of that decision making.
stamina upgrades would become less valuable. shrines create a progression decision between improving hearts and stamina. if climbing required no stamina, increasing stamina would lose some of its usefulness, which would affect another progression system.
the environment would become less meaningful. a huge cliff represents both: scenery + gameplay obstacle. without traversal limitations. cliffs would become less significant as obstacles. 
lastly, player preparation would matter less. food, stamina upgrades, route selection, weather awareness, and equipment can all interact with traversal. removing the stamina limitation would remove some of those relationships



OVERALL:
    conditionals turn game rules into consequences. the game tracks its current state, checks whether certain conditions are true or false, and changes what happens next. multiple conditions allow the same situation to produce different outcomes depending on the player's state. clear feedback then helps the player understand those outcomes.