package racetrack

class FooterTagLib {
	def thisYear = {
		out << new Date().format("yyyy")
	}
}
