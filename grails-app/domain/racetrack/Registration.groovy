package racetrack

class Registration {

	static belongsTo = [race:Race, runner:Runner]
	
	Boolean paid
	Date dateCreated // special name
	
    static constraints = {
		race()
		runner()
		paid()
		dateCreated()
    }
}
