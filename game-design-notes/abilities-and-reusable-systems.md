// GAME DESIGN STUDY 04 - ABILITIES & REUSABLE SYSTEMS

GAME: THE LEGEND OF ZELDA: BREATH OF THE WILD OR TEARS OF THE KINGDOM

1. choose three reusable abilities or tools from BOTW or TOTK. for each one, explain at least two different situations where the player can use it. for example, think about abilities like ultrahand, recall, ascend, fuse, magnesis, stasis, cryonis, etc. what makes these abilities systems rather than something that works for only one puzzle?

    ultrahand - totk: ultrahand allows the player to pick up, move, rotate, and attach objects together. it can be used to build vehicles for exploration, construct bridges for puzzles, create combat machines, or manipulate objects in the environment. it is a reusable system because the game gives the player consistent rules rather than limiting the ability to predetermined situations.
    recall - totk: recall reverses an object's previous movement. it can be used to ride fallen objects back into the sky, reverse moving puzzle components, or send certain objects/projectiles back toward enemies. the same mechanic works across exploration, puzzles, and combat.
    fuse - totk: fuse allows link to combine weapons, shields, and arrows with other objects. a monster horn can strengthen a weapon, an elemental material can create an elemental arrow, and certain objects can give shields new abilities. instead of develops creating a bunch of new weapons individually for the player to use, fuse creates a reusable system that lets players experiment with combinations between the weapon and the attached object.

2. choose one ability and break it into inputs -> rules -> outputs. for example, if you chose recall, what information does the game need before the ability can work? what conditions or rules determine whether it works? what happens after the ability succeeds? think of it like a java method.

    ability: recall
    input: the player selects a compatible object that has previously moved.
    rules: recall tracks the object's previous movement and reverses it along that path. it only works on compatible objects, and the effect can be canceled. 
    output: the object travels backward through its previous movement. 
    this resembles a java method because input (recall[object]) -> checks rules/ process the objects previous movement -> output (the object travels backwards in time)
    this ability receives information, follows predetermined rules, and produces a result-- similar to how my useHealingPotion() method in my RPG game receives health values, performs calculations and then returns the new health.

3. why is a reusable ability system better for player creativity than designing one specific solution for every puzzle? think about why two players might solve the exact same botw/totk problem differently even though they're using the same underlying abilities.

    reusable abilities allow players to create solutions rather than search for one predetermined solution. instead of designing a problem that has one correct solution, a systemic game can create: a problem for a player that understands the game's systems, thus encouraging the players to experiment with multiple abilities which will result in multiple solutions for this one problem.

    for example, two players are trying to cross the same gap might build a bridge, construct a flying machine, manipulate nearby objects with ultrahand or recall, or find another route entirely. this creates something called emergent gameplay, where interesting solutions and situations arise from players combining consistent game mechanics in ways the developers did not necessarily script individually. 

4. abilities need limitations why? pick one zelda ability and identify a restriction on it-- such as stamina, cooldowns, valid targets, range, resources, positioning, or another limitation. what would happen to the game's challenge if that restriction disappeared completely?

    abilities need limitations because limitations create challenge, decision-making, and balance. for example, ascend allows link to travel upward through compatible surfaces, but it cannot simply transport him upward through every object or from every position. the player has to find appropriate geometry and positioning.
    if ascend worked anywhere without restrictions, many exploration challenges could become meaningless because the player could bypass obstacles immediately. limitations force the player to ask: can i use this ability here, and if not, what other tool or strategy should i use?
    from a programming perspective, this resembles a conditional:
        if (conditionsAreValid) {
            useAbility();
        } else {
            // ability cannot be used
        }
    this proves that restrictions aren't just there to make an ability weaker, they're part of what creates the decision-making surrounding the ability.
    additionally, i would like to add that if there is a mode that gives the player almost god like powers that makes the game completely easy for them without challenges, then the game needs another source of meaningful player engagement. when we think of minecraft, for example, it's a survival sandbox game that's supposed to revolve around the player gathering supplies to progress through different parts of the world while surviving. however, players can also choose to play on peaceful, which is an easier version of the survival game. they also have the option to play without ANY difficulties at all in creative. this proves although adding restrictions enhances gameplay and player style, removing restrictions entirely or lessening them also adds a positive influence to play style. restrictions create meaningful decisions by forcing players to operate within limitations, but removing restrictions can create a different kind of meaningful gameplay by shifting the player's motivation from overcoming challenges toward creativity, experimentation, or self-expression. overall, neither design is inherently more engaging than the other, they're creating different player experiences and either or can be more favorable depending on the player.

5. design your own zelda-style ability. this one is completely yours. give it a name and describe: 
    - what information/input it needs
    - what it does
    - what conditions must be true for it to work
    - what limitations prevents it from being overpowered
    - there should be at least 3 different uses for it across combat, puzzles, or exploration

  reforge: link can magically alter the properties of weapons, shields, or bows by taking them to a blacksmith. reforge acts as an extension of the fuse ability, while fuse creates different weapons when a weapon is combined with a specific material/object, reforge unlocks an additional special property based on that combination. reforging begins at 250 rupees, with the price increasing depending on the rarity and fuse power of the attached material. blacksmiths capable of reforging equipment can be found throughout the villages of hyrule. for example, reforging a sword fused with a lizalfos horn could allow link to use the weapon while swimming, creating combat possibilities that normally aren't available in water.

  input: fused equipment + attached material/object + rupees + blacksmith

  conditions: the equipment needs to be fused first, link needs enough rupees, and he needs access to a blacksmith

  limitations: economic limitation starts at 250 rupees, rarer/more powerful combinations cost more to reforge

    1. combat: lizalfos horn reforge - aquatic combat
        if link reforges a weapon fused with a lizalfos horn, the weapon gains an aquatic property that allows him to attack while swimming. normally, entering deep water limits link's ability to fight and even if he has the full zora armor, its not constant combat. the reforge changes that rule, allowing the olayer to defend themselves against aquatic enemies without having to reach land first. this could also encourage players to deliberately fight around rivers and lakes because water is no longer purely a disadvantage.
        design purpose: changes the conditions under which combat is possible rather than simply increasing damage

    2. exploration: keese wing reforge - controlled gliding
        if a shield is reforged using a keese wing, it could give the shield an aerodynamic property. while airbone, link can hold the shield to briefly slow his descent or glide horizontally without descending or needing the paraglider. this would not replace the paraglider, the effect would last as long as the shield's durability (longer for shields with durability+ attribute) and would consume the shield's durability. this would help link cross small gaps, correct a missed jump, or reach nearby ledges without descending. it could also help to create a descision making situation for players, whether or not they should preserve their shield for combat or sacrifice some of their shield durability to reach the ledge
        design purpose: turns equipment into a traversal tool and creates another method of navigating the environment.

    3. puzzle: electric lizalfos horn reforge - conductive equipment
        reforging equipment fused with an electric lizalfos horn could give it a permanent conductive property. instead of electricity only dealing elemental damage, link could place or position the reforged weapon to complete electrical circuits in environmental puzzles. for example: power source -> conductor -> reforged electric weapon -> conductor -> locked door activates
        the player now has several choices. the shrine could provide a metal object that can complete the circuit normally, but a player who brought an electrically reforged weapon could discover an alterantive solution.
        design purpose: allows an item originally designed for combat to interact with the puzzle system, producing multiple solutions.
