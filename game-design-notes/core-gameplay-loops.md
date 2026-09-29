// GAME DESIGN STUDY 03 - CORE GAMEPLAY LOOPS

GAME: THE LEGEND OF ZELDA: BREATH OF THE WILD OR TEARS OF THE KINGDOM


1. IDENTIFY THE CORE GAMEPLAY LOOP. FOR BOTW OR TOTK, WHAT DO YOU THINK THE MAIN REPEATING GAMEPLAY CYCLE IS? IDENTIFY ABOUT 4-6 STAGES AND EXPLAIN BRIEFLY WHAT HAPPENS DURING EACH.

    a good way to represent botw/totk's main gameplay loop is: explore -> discover -> overcome challenge -> gain rewards -> grow stronger -> explore further
    explore: the player travels through Hyrule looking for new locations, landmarks, enemies, resources, quests, and secrets.
    discover: exploration reveals shrines, caves, enemy camps, towns, puzzles, quests, materials, or other points of interest.
    overcome challenge: the player fights enemies, solves environmental puzzles, completes shrines, or uses abilities creatively to overcome obstacles. 
    gain rewards: completing challenges provides things such as weapons, armor, materials, rupees, light of blessing/spirit orbs, or other useful resources.
    grow stronger: rewards allow the player to increase health/stamina, improve armor, obtain better equipment, cook stronger meals, and expand their available options.
    explore further: increased strength and resources make it easier to tackle more dangerous area and challenges, which begins the cycle again.

    the important design idea is that progression feeds back into exploration. the reward from one adventure gelps prepare the player for the next one.

2. FIND THREE SMALLER GAMEPLAY LOOPS. BIG GAMES USUALLY CONTAIN LOOPS INSIDE THE MAIN LOOP, FIND 3 EXAMPLES OF THIS. THEN EXPLAIN WHAT MOTIVATES THE PLAYER TO REPEAT IT.

    combat loop - encounter enemy -> observe/prepare -> attack/defend -> enemy responds -> adapt -> defeat enemy -> collect rewards -> next encounter 
    the player repeats combat because enemies provide materials, weapons, treasure, access to locations, and sometimes progression toward quests. the loop stays interesting because different enemies require different approaches. players can change weapons, use the environment, sneak, dodge, parry, use abilities, or simply avoid combat.

    shrine loop - discover shrine -> enter -> analyze challenge -> experiment -> solve -> receive reward -> find another shrine
    shrines encourage repetition because solving them contributes to character progression. they also offer new puzzles rather than asking the player to solve the exact same challenge repeatedly. the player knows roughly what kind of reward awaits them, but doesn't know what challenge will be inside, which creates curiosity. 

    resource/cooking loop - explore -> gather ingredients -> discover/choose recipe -> cook -> gain meal/effect -> consume during adventure -> gather more ingredients
    players repeat this loop because food supports other gameplay systems. meals can restore health or provide effects such as increased defense, attack power, stamina, temperature resistance, or movement-related benefits. this means gathering and cooking aren't completely isolated activities--the rewards help the player explore and survive elsewhere.

    overall design takeaway: botw/totk contains loops inside loops. cooking, combat, shrines, exploration, and progression all feed into the larger adventure loop.

3. ANALYZE THE COMBAT LOOP. BREAK ZELDA COMBAT INTO A SIMPLIFIED SEQUENCE. WRITE 2-3 WAYS ZELDA'S COMBAT LOOP IS MORE COMPLEX THAN THE ONE YOU'VE PROGRAMMED SO FAR.

    a simplified zelda combat loop could look like: encounter enemy -> assess situation -> choose action -> attack/defend/dodge -> enemy responds -> player adapts -> repeat until combat ends -> collect rewards
    which is much more complicated and advance than my current combat system in my java program. 

    difference #1 - player choice
    right now, my player automatically performs: player attacks -> enemy survives? -> enemy attacks -> repeat
    zelda allows the player to choose between many possible actions: melee attacks, bows, shields, dodging, parrying, healing, changing equipment, using abilities, manipulating objects, retreating, etc. so, zelda's loop contains decision-making during each iteration.

    difference #2 - more game states affect combat
    your player currently mainly depends on: playerHealth, enemyHealth, attack, enemyDmg, isAlive
    zelda combat can depend on many interacting states: health, stamina, weapon durability, equipment, enemy type, positioning, environmental hazards, status effects, terrain, and more. that means the outcome isn't determined by health and attack damage alone.

    difference #3 - the environment participates in combat
    the environment itself can become part of the player's strategy. for example, the player may use elevation, explosive objects, physics, elemental interactions, or nearby structures instead of simply exchanging attacks with an enemy. this creates emergent gameplay: relatively simple systems interact in ways that allow players to discover solutions the designer didn't have to explicitly script as one fixed sequence.


4. WHY DOESN'T REPETITION BECOME BORING? IDENTIFY AT LEAST 3 THINGS THAT CREATE VARIATION WITHIN THOSE REPEATED LOOPS. ALSO EXPLAIN WHY VARIATION MATTERS.

    the key is that the overall structure repeats, but the circumstances change. 
    1. different enemies: enemies have different attacks, behaviors, strengths, weaknesses, and positioning. so, fight -> win -> reward, may remain the same underlying loop, while how the player wins changes.
    2. player choice: players have multiple ways to approach problems. two players might encounter the same enemy camp and choose completely different solutions. one could fight directly, another could sneak around, and another could exploit the environment. this gives the player agency inside the loop instead of making repetition completely automatic.
    3. environment and systems: terrain, weather, physics, abilities, weapons, elemental effects, and other systems can interact. the same basic activity can therefore create different situations depending on where and how it happens.
    4. different rewards and discoveries: the player doesn't always know what is ahead. exploration might reveal a shrine, weapon, quest, cave, enemy armor piece, resource, or interesting location. that uncertainty creates curiosity, which helps motivate another cycle of exploration.
    overall: botw/totk demonstrates that repetition itself isn't necessarily the problem in game design. most games are built around repeated actions. the problem is repetition without meaningful variation, decisions, or progression. a strong gameplay loop can repeat the same general structure: action -> challenge -> feedback -> reward -> progression -> repeat, while changing the decisions and circumstances inside that structure.

5. DESIGN YOUR OWN GAMEPLAY LOOP. IMAGINE YOU'RE DESIGNING AN ADVENTYRE RPG, CREATE ITS BASIC CORE LOOP USING 
                _____ → _____ → _____ → _____ → _____
                ↑                                  ↓
                └──────────────────────────────────┘
WHAT MAKES THE PLAYER WANT TO START THE LOOP AGAIN?

exploration -> dungeon/puzzle -> boss/combat -> reward -> level up/progression/increase in difficulty -> repeat