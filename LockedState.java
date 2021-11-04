class LockedState extends State 

    // Lorsque vous déverrouillez un lecteur verrouillé, il peut
    // prendre l’un des deux états.
    method clickLock() is
        if (player.playing)
            player.changeState(new PlayingState(player))
        else
            player.changeState(new ReadyState(player))

    method clickPlay() is
        // Verrouillé, ne rien faire.

    method clickNext() is
        // Verrouillé, ne rien faire.

    method clickPrevious() is
        // Verrouillé, ne rien faire.


// Ils peuvent également déclencher les transitions de l’état
// dans le contexte.