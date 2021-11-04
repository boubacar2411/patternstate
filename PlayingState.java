class PlayingState extends State 
    method clickLock() 
        player.changeState(new LockedState(player))

    method clickPlay() 
        player.stopPlayback()
        player.changeState(new ReadyState(player))

    method clickNext() 
        if (event.doubleclick)
            player.nextSong()
        else
            player.fastForward(5)

    method clickPrevious() 
        if (event.doubleclick)
            player.previous()
        else
            player.rewind(5)