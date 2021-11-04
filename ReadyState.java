class ReadyState extends State 
    method clickLock() 
        player.changeState(new LockedState(player))

    method clickPlay() 
        player.startPlayback()
        player.changeState(new PlayingState(player))

    method clickNext() 
        player.nextSong()

    method clickPrevious() 
        player.previousSong()
