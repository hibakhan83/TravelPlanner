import java.util.Scanner; 

public class CS_1301 {

	public static void main(String[] args) {
		// Create variables to establish price
		double budget = Budget();
		Destination(budget);
	}

	//Establish Budget	
	public static double Budget() {
	Scanner console = new Scanner(System.in);
	    System.out.print("What is your budget $");
	    double budget = console.nextDouble();
	    return budget;
	}

	//Establish Departure time variable for price multiplier
	public static double  Departure(double flight_base) {
		Scanner console = new Scanner(System.in);
	    System.out.print("In how many days will you depart? ");
	    int depart = console.nextInt();
	    double flight_adapt = 0;
	    if (depart < 30 ) {
	    		flight_adapt = flight_base*1.25;
	    		System.out.println("Your flight price will be: $" + flight_adapt);
	    }
	    else if (depart < 60) {
	    		flight_adapt = flight_base;
	    		System.out.println("Your flight price will be: $" + flight_adapt);
	    }
	    else{
	    		flight_adapt = flight_base*.85;
	    		System.out.println("Your flight price will be: $" + flight_adapt);
	    }
	    return flight_adapt;
	}

	//Calculates Hotel Stay Cost
	public static double Hotel(double hotel_base) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many days will you be staying? ");
		int stay = console.nextInt();
		double hotel_price = hotel_base*stay;
		System.out.println("Your hotel for the stay will cost: $" + hotel_price);
		return hotel_price;
	}

	// Determines if you can afford this
	public static void CostCruncher(double budget, double cost) {
		double remainder = budget-cost;
		if (remainder < 0) { 
			System.out.println("You don't have quite enough saved for this trip yet. Save up a little more or pick a closer destination. You are $" + Math.abs(remainder) + " short");
		} else {
			System.out.println("You can afford this trip! You will have $" + remainder + " to spare once you arrive");
		}
	}

    	//Determine Region of Travel
	public static void Destination(double budget) {
	// Method scoped variable cost
	double cost = 0;
	Scanner console = new Scanner(System.in);
	System.out.println("Which of the following regions would you like to travel to: \nSouth West, West, Mid West, North East, or South East? ");
	String region = console.nextLine();
		//City Selection
		if (region.equalsIgnoreCase("West")) {
			System.out.println("Which of following cities would you like to visit: \nLos Angeles, San Francisco, Vegas, Seattle, or Anchorage?");
			Scanner console1 = new Scanner(System.in);
			String city = console1.nextLine();
		
			if(city.equalsIgnoreCase("Los Angeles")) {
				double flight_base = 363;
				double hotel_base = 204;
				System.out.println("Here are some points of interests you may want to visit in " + city + ":\n"+ " > Universal Studios Hollywood\n" + "https://www.universalstudioshollywood.com/ \n" + " > The Getty Center\n" + 
				"http://www.getty.edu/visit/center/ \n");
				cost += Departure(flight_base);
				cost += Hotel(hotel_base);	
				CostCruncher(budget, cost);
			}
			else if(city.equalsIgnoreCase("San F rancisco")) {
				double flight_base = 315;
				double hotel_base = 162;
				System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" +" > Alcatraz Island\n" + "https://www.nps.gov/alca/index.htm \n" + " > Golden Gate Bridge  \n" + 
				"http://www.goldengatebridge.org/ \n");
				cost += Departure(flight_base);
				cost += Hotel(hotel_base);	
				CostCruncher(budget, cost);
			}
			else if(city.equalsIgnoreCase("Vegas")) {
				double flight_base = 362; 
				double hotel_base = 106;
				System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Red Rock Canyon National Conservation Area\n" + "http://www.redrockcanyonlv.org/ \n" + 
				" > Conservatory and Botanical Gardens at Bellagio\n" + "https://www.bellagio.com/en/entertainment/conservatory-botanical-garden.html \n");
				cost += Departure(flight_base);
				cost += Hotel(hotel_base);	
				CostCruncher(budget, cost);	
			}
			else if(city.equalsIgnoreCase("Seattle")) {
				double flight_base = 439;
				double hotel_base = 152;
				System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Chihuly Garden and Glass\n" + 
				"https://www.chihulygardenandglass.com/ \n" + " > The Museum of Flight\n" + "http://www.museumofflight.org/ \n");
				cost += Departure(flight_base);
				cost += Hotel(hotel_base);	
				CostCruncher(budget, cost);	
			}
			else if(city.equalsIgnoreCase("Anchorage")) {
				double flight_base = 995;
				double hotel_base = 74;
				System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Alaskan Railroad\n" + "https://www.alaskarailroad.com/ \n" + 
				" > Cook Inlet\n" + "https://www.britannica.com/place/Cook-Inlet\n");
				cost += Departure(flight_base);
				cost += Hotel(hotel_base);	
				CostCruncher(budget, cost);	
			}
			
		}//ends west block
		//Next Region
		else if (region.equalsIgnoreCase("Mid West")) {
			System.out.println("Which of following cities would you like to visit: \nChicago, Cincinnati, Indianapolis, St. Louis, or Detroit?");
			Scanner console2 = new Scanner(System.in);
			String city = console2.nextLine();
			
				if (city.equalsIgnoreCase("Chicago")) {
					double flight_base = 190;
					double hotel_base = 133;
					System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > The Art Institute of Chicago\n" + "http://www.artic.edu/ \n" + 
					" > Millennium Park\n" + "https://www.cityofchicago.org/city/en/depts/dca/supp_info/millennium_park.html \n");
					cost += Departure(flight_base);
					cost += Hotel(hotel_base);	
					CostCruncher(budget, cost);
					}
				else if(city.equalsIgnoreCase("Cincinnati")) {
					double flight_base = 274; 
					double hotel_base = 106;
					System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Cincinnati Zoo & Botanical Garden\n" + 
					"http://cincinnatizoo.org/ \n" + " > Great American Ball Park\n" + "http://cincinnati.reds.mlb.com/cin/ballpark/ \n");
					cost += Departure(flight_base);
					cost += Hotel(hotel_base);	
					CostCruncher(budget, cost);
				}
				else if(city.equalsIgnoreCase("Indianapolis")) {
					double flight_base = 201;
					double hotel_base = 94;
					System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Children’s Museum of Indianapolis\n" + 
					"https://www.childrensmuseum.org/ \n" + " > Indianapolis Motor Speedway Museum\n" + "http://www.indyracingmuseum.org/ \n");
					cost += Departure(flight_base);
					cost += Hotel(hotel_base);	
					CostCruncher(budget, cost);	
				}
				else if(city.equalsIgnoreCase("St. Louis")) {
					double flight_base = 170;
					double hotel_base = 133;
					System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > St. Louis Zoo\n" + 
					"https://www.stlzoo.org/ \n" + " > City Museum \n" + "https://www.citymuseum.org/ \n");
					cost += Departure(flight_base);
					cost += Hotel(hotel_base);	
					CostCruncher(budget, cost);
				}
				else if(city.equalsIgnoreCase("Detroit")) {
					double flight_base = 160;
					double hotel_base = 218;
					System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Detroit Institute of Arts\n" + "https://www.dia.org/about \n" + 
					" > Comerica Park\n" + "http://tigers.mlb.com/det/ballpark/ \n");
					cost += Departure(flight_base);
					cost += Hotel(hotel_base);	
					CostCruncher(budget, cost);
				}
		}//ends midwest
		//Next Region 
		else if (region.equalsIgnoreCase("North East")) {
					System.out.println("Which of following cities would you like to visit: \nNew York City, Boston, Pittsburgh, or Newark?");
					Scanner console3 = new Scanner(System.in);
					String city = console3.nextLine();
					
						if (city.equalsIgnoreCase("New York City")) {
							double flight_base = 170;
							double hotel_base = 402;
							System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Empire state building\n" + 
							"http://www.esbnyc.com/\n" + " > The national 9/11 memorial & museum\n" + "https://www.911memorial.org/\n");
							cost += Departure(flight_base);
							cost += Hotel(hotel_base);	
							CostCruncher(budget, cost);							}
						else if(city.equalsIgnoreCase("Boston")) {
							double flight_base = 140;
							double hotel_base = 177;
							System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Museum of fine arts boston\n" + 
							"http://www.mfa.org/\n" + " > The paul revere house\n" + "https://www.paulreverehouse.org/\n");
							cost += Departure(flight_base);
							cost += Hotel(hotel_base);	
							CostCruncher(budget, cost);
						}
						else if(city.equalsIgnoreCase("Pittsburgh")) {
							double flight_base = 209;
							double hotel_base = 144;
							System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Carnegie museum of natural history\n" + 
							"https://carnegiemnh.org/\n" + " > Phipps Conservatory\n" + "https://www.phipps.conservatory.org/\n");
							cost += Departure(flight_base);
							cost += Hotel(hotel_base);	
							CostCruncher(budget, cost);
						}
						else if(city.equalsIgnoreCase("Newark")) {
							double flight_base = 167;
							double hotel_base = 84;
							System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Cathedral Basilica of the Sacred Heart\n" + 
							"http://www.cathedralbasilica.org/\n" + " > New Jersey Performing Arts Center\n" + "http://www.njpac.org/\n");
							cost += Departure(flight_base);
							cost += Hotel(hotel_base);	
							CostCruncher(budget, cost);	
						}
						
			}//ends NE Region
			
		else if (region.equalsIgnoreCase("South East")) {
			System.out.println("Which of following cities would you like to visit: \nMiami, New Orleans, D.C., Nashville, or Orlando?");
			Scanner console4 = new Scanner(System.in);
			String city = console4.nextLine();
			
				if (city.equalsIgnoreCase("Miami")) {
					double flight_base = 217; 
					double hotel_base = 152;
					System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Wynwood Walls\n" + 
					"http://www.thewynwoodwalls.com/\n" + " > Vizcaya Museum and Gardens\n" + "http://vizcaya.org/\n");
					cost += Departure(flight_base);
					cost += Hotel(hotel_base);	
					CostCruncher(budget, cost);
				}
				else if(city.equalsIgnoreCase("New Orleans")) {
					double flight_base = 151;
					double hotel_base = 101;
					System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > The National WWII Museum\n" + 
					"https://www.nationalww2museum.org/\n" + " > French Quarter\n" + "http://www.frenchquarter.com/\n");
					cost += Departure(flight_base);
					cost += Hotel(hotel_base);	
					CostCruncher(budget, cost);	
				}
				else if(city.equalsIgnoreCase("D.C.")) {
					double flight_base = 147; 
					double hotel_base = 218;
					System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Lincoln Memorial\n" + 
					"https://www.nps.gov/linc/index.htm\n" + " > Smithsonian\n" + "https://www.si.edu/museums\n");
					cost += Departure(flight_base);
					cost += Hotel(hotel_base);	
					CostCruncher(budget, cost);	
				}
				else if(city.equalsIgnoreCase("Nashville")) {
					double flight_base = 277; 
					double hotel_base = 116;
					System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Country Music Hall of Fame and Museum\n" + 
					"http://countrymusichalloffame.org/\n" + " > Centennial Park\n" + "https://www.nashville.gov/Parks-and-Recreation/Parks/Centennial-Park.aspx\n");
					cost += Departure(flight_base);
					cost += Hotel(hotel_base);	
					CostCruncher(budget, cost);	
				}
				else if(city.equalsIgnoreCase("Orlando")) {
					double flight_base = 140;
					double hotel_base = 183;
					System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Universal Studios \n" + 
					"https://www.universalorlando.com/web/en/us/index.html\n" + " > Disney World\n" + "https://disneyworld.disney.go.com/?CMP=OKC_wdw_gmap_421\n");
					cost += Departure(flight_base);
					cost += Hotel(hotel_base);	
					CostCruncher(budget, cost);	
				}
				
			}//ends SE Region	
		
		else if (region.equalsIgnoreCase("South West")) {
			System.out.println("Which of following cities would you like to visit: \nHouston, Phoenix, Dallas, San Antonio, or Honolulu?");
			Scanner console5 = new Scanner(System.in);
			String city = console5.nextLine();
			
				if (city.equalsIgnoreCase("Houston")) {
					double flight_base = 137;
					double hotel_base = 91;
					System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > The Houston Museum of Natural Science\n" + 
					"http://www.hmns.org/\n" + " > Museum of Fine Arts\n" + "https://www.mfah.org/\n");
					cost += Departure(flight_base);
					cost += Hotel(hotel_base);	
					CostCruncher(budget, cost);	
				}
				else if(city.equalsIgnoreCase("Phoenix")) {
					double flight_base = 279; 
					double hotel_base = 177;
					System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Musical Instrument Museum\n" + 
					"https://mim.org/\n" + " > Desert Botanical Garden\n" + "https://www.dbg.org/\n");
					cost += Departure(flight_base);
					cost += Hotel(hotel_base);	
					CostCruncher(budget, cost);	
				}
				else if(city.equalsIgnoreCase("Dallas")) {
					double flight_base = 157;
					double hotel_base = 202;
					System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > Dallas Arboretum & Botanical Gardens\n" + 
					"http://www.dallasarboretum.org/\n" + " > The George W. Bush Presidential Library and Museum\n" + "https://www.georgewbushlibrary.smu.edu/\n");
					cost += Departure(flight_base);
					cost += Hotel(hotel_base);	
					CostCruncher(budget, cost);	
				}
				else if(city.equalsIgnoreCase("San Antonio")) {
					double flight_base = 211; 
					double hotel_base = 137;
					System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > The Alamo\n" + 
					"http://www.thealamo.org/\n" + " > San Antonio Missions National Historical Park\n" + "https://www.nps.gov/saan/index.htm\n");
					cost += Departure(flight_base);
					cost += Hotel(hotel_base);	
					CostCruncher(budget, cost);	
				}
				else if(city.equalsIgnoreCase("Honolulu")) {
					double flight_base = 731; 
					double hotel_base = 283;
					System.out.println("Here are some points of interests you may want to visit in " + city + ":\n" + " > USS Arizona Memorial\n" + 
					"http://www.pearlharborhistoricsites.org/pearl-harbor/arizona-memorial\n" + " > Diamond Head State Monument \n" + 
					"http://dlnr.hawaii.gov/dsp/parks/oahu/diamond-head-state-monument/\n");
					cost += Departure(flight_base);
					cost += Hotel(hotel_base);	
					CostCruncher(budget, cost);	
				}
				//ends SW region
		}	

	}
}

