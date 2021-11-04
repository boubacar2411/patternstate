// La classe de base état déclare des méthodes que tous les
// états concrets doivent obligatoirement implémenter et fournit
// aussi une référence arrière vers l’objet du contexte associé
// à l’état. Les états peuvent utiliser cette référence arrière
// pour permuter l’état du contexte.
abstract class State is
    protected field player: AudioPlayer

    // Le contexte s’envoie lui-même au constructeur de l’état,
    // permettant de donner un coup de pouce à l'état pour
    // récupérer des données contextuelles si nécessaire.
    constructor State(player) is
        this.player = player

    abstract method clickLock()
    abstract method clickPlay()
    abstract method clickNext()
    abstract method clickPrevious()
