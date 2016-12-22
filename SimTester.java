// Created by Matthew Bierman
import java.util.*;
public class SimTester 
{	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Boolean replay = true;
		System.out.println("2015 Soccer League Simulator *Created by: Matthew Bierman, last updated on May 26th, 2015*");
		
		while (replay == true)
		{
			System.out.println("\n"
						 + "Type the number to select a league:\n"
						 + "Hyundai A-League                    (Australia)    --> 1\n"
						 + "K League Classic                    (South Korea)  --> 2\n"
						 + "Abdul Latif Jameel League           (Saudi Arabia) --> 3\n"
						 + "Austria Bundesliga                  (Austria)      --> 4\n"
						 + "Belgium Pro League                  (Belgium)      --> 5\n"
						 + "Superliga                           (Denmark)      --> 6\n"
						 + "Barclays Premier League             (England)      --> 7\n"
						 + "Football League Championship        (England)      --> 8\n"
						 + "Football League 1                   (England)      --> 9\n"
						 + "Football League 2                   (England)      --> 10\n"
						 + "Ligue 1                             (France)       --> 11\n"
						 + "Ligue 2                             (France)       --> 12\n"
						 + "Bundesliga                          (Germany)      --> 13\n"
						 + "2. Bundesliga                       (Germany)      --> 14\n"
						 + "Serie A                             (Italy)        --> 15\n"
						 + "Serie B                             (Italy)        --> 16\n"
						 + "Eredivise                           (Netherlands)  --> 17\n"
						 + "Tippeligaen                         (Norway)       --> 18\n"
						 + "T-Mobile Ekstraklasa                (Poland)       --> 19\n"
						 + "Primeira Liga                       (Portugal)     --> 20\n"
						 + "SSE Airtricity League               (Ireland)      --> 21\n"
						 + "Sogaz Russian Football Championship (Russia)       --> 22\n"
						 + "Scottish Premiership                (Scotland)     --> 23\n"
						 + "Liga BBVA                           (Spain)        --> 24\n"
						 + "Liga Adelante                       (Spain)        --> 25\n"
						 + "Allsvenskan                         (Sweden)       --> 26\n"
						 + "Raiffeisen Super League             (Switzerland)  --> 27\n"
						 + "Süper Lig                           (Turkey)       --> 28\n"
						 + "Liga Bancomer MX                    (Mexico)       --> 29\n"
						 + "Major League Soccer                 (USA)          --> 30\n"
						 + "Primera División                    (Argentina)    --> 31\n"
						 + "Campeonato Nacional Scotiabank      (Chile)        --> 32\n"
						 + "Liga Postobón                       (Colombia)     --> 33\n"
						 + "(Or 0 to select a random league)");
			int num = keyboard.nextInt();
		
			System.out.println("How many weeks to simulate? (Type 0 to play a full season, up to 99)");
			int numWeeks = keyboard.nextInt();
			
			while (numWeeks > 99 || numWeeks < 0)
			{
				System.out.println("Number of weeks must be positive and less than 100.\nHow many weeks to simulate? (Type 0 to play a full season, up to 99)");
				numWeeks = keyboard.nextInt();
			}
			
			System.out.println("Which weeks to display summaries for? (In the format of \"#-#\", type 0 to display none, or type 'all' for to display every week)");
			String dS = keyboard.next();
			
			
			if ( num == 0 )
			{
				Random ran = new Random();
				num = ran.nextInt(33) + 1;
			}

			Team l1t1  = new Team("Adelaide United   ", 65, 62, 59);
			Team l1t2  = new Team("Brisbane Roar     ", 63, 65, 64);
			Team l1t3  = new Team("Central Coast     ", 61, 62, 62);
			Team l1t4  = new Team("Melbourne Victory ", 66, 63, 62);
			Team l1t5  = new Team("Melbourne City    ", 70, 63, 57);
			Team l1t6  = new Team("Newcastle Jets    ", 62, 61, 61);
			Team l1t7  = new Team("Perth Glory       ", 60, 62, 62);
			Team l1t8  = new Team("Sydney FC         ", 66, 61, 61);
			Team l1t9  = new Team("Wellington Phoenix", 63, 61, 60);
			Team l1t10 = new Team("WS Wanderers      ", 61, 62, 62);
			
			Team l2t1  = new Team("Busan I'Park   ", 62, 61, 62);
			Team l2t2  = new Team("FC Seoul       ", 67, 63, 67);
			Team l2t3  = new Team("GyeongNam FC   ", 62, 61, 61);
			Team l2t4  = new Team("Incheon United ", 64, 63, 61);
			Team l2t5  = new Team("Jeju United FC ", 63, 64, 60);
			Team l2t6  = new Team("Jeonbuk FC     ", 68, 67, 64);
			Team l2t7  = new Team("Jeonnam Dragons", 67, 61, 62);
			Team l2t8  = new Team("Pohang Steelers", 65, 63, 65);
			Team l2t9  = new Team("Sangju Sangmu  ", 63, 63, 62);
			Team l2t10 = new Team("Seongnam FC    ", 64, 62, 62);
			Team l2t11 = new Team("Suwon Bluewings", 68, 65, 64);
			Team l2t12 = new Team("Ulsan Hyundai  ", 68, 61, 61);
			
			Team l3t1  = new Team("Al-Ahli     ", 68, 66, 62);
			Team l3t2  = new Team("Al-Faisaly  ", 65, 56, 58);
			Team l3t3  = new Team("Al-Fateh    ", 65, 61, 60);
			Team l3t4  = new Team("Al-Hilal    ", 71, 71, 69);
			Team l3t5  = new Team("Al-Ittihad  ", 74, 68, 62);
			Team l3t6  = new Team("Al-Khaleej  ", 56, 57, 54);
			Team l3t7  = new Team("Al-Nassr    ", 70, 69, 66);
			Team l3t8  = new Team("Al-Orubah FC", 63, 59, 56);
			Team l3t9  = new Team("Al-Raed     ", 63, 56, 58);
			Team l3t10 = new Team("Al-Shabab   ", 67, 68, 65);
			Team l3t11 = new Team("Alshoulla   ", 54, 59, 56);
			Team l3t12 = new Team("Al-Taawoun  ", 64, 58, 60);
			Team l3t13 = new Team("Hajer       ", 59, 56, 54);
			Team l3t14 = new Team("Najran      ", 58, 57, 56);
			
			Team l4t1  = new Team("Admira            ", 63, 57, 57);
			Team l4t2  = new Team("FK Austria        ", 66, 67, 65);
			Team l4t3  = new Team("Red Bulls Salzburg", 75, 70, 69);
			Team l4t4  = new Team("SCR Altach        ", 59, 58, 61);
			Team l4t5  = new Team("SK Rapid Wien     ", 68, 65, 62);
			Team l4t6  = new Team("SK Sturm Graz     ", 65, 63, 63);
			Team l4t7  = new Team("SV Grodig         ", 63, 60, 60);
			Team l4t8  = new Team("SV Ried           ", 59, 60, 62);
			Team l4t9  = new Team("Wiener Neustadt   ", 57, 60, 60);
			Team l4t10 = new Team("Wolfsberger AC    ", 63, 63, 63);
			
			Team l5t1  = new Team("Cercle Brugge     ", 63, 64, 64);
			Team l5t2  = new Team("Club Brugge       ", 72, 71, 71);
			Team l5t3  = new Team("KAA Gent          ", 68, 67, 66);
			Team l5t4  = new Team("KRC Genk          ", 73, 69, 71);
			Team l5t5  = new Team("KV Kortrijk       ", 68, 66, 64);
			Team l5t6  = new Team("KV Mechelen       ", 65, 64, 66);
			Team l5t7  = new Team("KV Oostende       ", 65, 67, 64);
			Team l5t8  = new Team("KVC Westerlo      ", 64, 64, 64);
			Team l5t9  = new Team("Lierse SK         ", 66, 63, 64);
			Team l5t10 = new Team("Royal Mouscron    ", 63, 64, 62);
			Team l5t11 = new Team("RSC Anderlecht    ", 73, 71, 70);
			Team l5t12 = new Team("Sporting Charleroi", 64, 64, 65);
			Team l5t13 = new Team("Sporting Lokeren  ", 70, 70, 69);
			Team l5t14 = new Team("Standard Liege    ", 72, 71, 70);
			Team l5t15 = new Team("Waasland-Beveren  ", 66, 66, 64);
			Team l5t16 = new Team("Zulte-Waregem     ", 69, 66, 65);
			
			Team l6t1  = new Team("Aalborg BK     ", 67, 65, 66);
			Team l6t2  = new Team("Brøndby IF     ", 67, 68, 68);
			Team l6t3  = new Team("Esbjerg fB     ", 66, 65, 62);
			Team l6t4  = new Team("FC København   ", 66, 68, 70);
			Team l6t5  = new Team("FC Midtjylland ", 62, 65, 62);
			Team l6t6  = new Team("FC Nordsjælland", 64, 62, 59);
			Team l6t7  = new Team("FC Vestsjælland", 62, 62, 61);
			Team l6t8  = new Team("Hobro IK       ", 64, 59, 60);
			Team l6t9  = new Team("Odense Boldklub", 61, 64, 59);
			Team l6t10 = new Team("Randers FC     ", 64, 63, 65);
			Team l6t11 = new Team("Silkeborg IF   ", 61, 57, 60);
			Team l6t12 = new Team("SønderjyskE    ", 64, 62, 61);
			
			Team l7t1  = new Team("Arsenal FC               ", 81, 81, 78);
			Team l7t2  = new Team("Aston Villa FC           ", 76, 74, 74);
			Team l7t3  = new Team("Burnley FC               ", 69, 69, 70);
			Team l7t4  = new Team("Chelsea FC               ", 84, 82, 82);
			Team l7t5  = new Team("Crystal Palace FC        ", 72, 72, 72);
			Team l7t6  = new Team("Everton FC               ", 78, 78, 77);
			Team l7t7  = new Team("Hull City AFC            ", 72, 73, 74);
			Team l7t8  = new Team("Leicester City FC        ", 72, 70, 71);
			Team l7t9  = new Team("Liverpool FC             ", 82, 78, 77);
			Team l7t10 = new Team("Manchester City FC       ", 83, 83, 81);
			Team l7t11 = new Team("Manchester United FC     ", 87, 80, 75);
			Team l7t12 = new Team("Newcastle United FC      ", 73, 74, 73);
			Team l7t13 = new Team("Queens Park Rangers FC   ", 75, 74, 72);
			Team l7t14 = new Team("Southampton FC           ", 79, 75, 75);
			Team l7t15 = new Team("Stoke City FC            ", 80, 79, 76);
			Team l7t16 = new Team("Sunderland AFC           ", 77, 76, 74);
			Team l7t17 = new Team("Swansea City AFC         ", 74, 75, 72);
			Team l7t18 = new Team("Tottenham Hotspur FC     ", 78, 74, 75);
			Team l7t19 = new Team("West Bromwich Albion FC  ", 76, 72, 71);
			Team l7t20 = new Team("West Ham United FC       ", 74, 75, 72);
			
			Team l8t1  = new Team("Birmingham City       ", 65, 65, 65);
			Team l8t2  = new Team("Blackburn Rovers      ", 69, 67, 65);
			Team l8t3  = new Team("Blackpool             ", 66, 65, 64);
			Team l8t4  = new Team("Bolton Wanderers      ", 67, 69, 67);				
			Team l8t5  = new Team("Bournemouth           ", 66, 68, 66);
			Team l8t6  = new Team("Brentford             ", 61, 63, 62);
			Team l8t7  = new Team("Brighton & Hove Albion", 69, 67, 67);
			Team l8t8  = new Team("Cardiff City          ", 71, 70, 71);
			Team l8t9  = new Team("Charlton Athletic     ", 67, 65, 64);
			Team l8t10 = new Team("Derby County          ", 69, 69, 68);
			Team l8t11 = new Team("Fulham                ", 73, 66, 67);
			Team l8t12 = new Team("Huddersfield          ", 66, 66, 66);
			Team l8t13 = new Team("Ipswich Town          ", 67, 65, 67);
			Team l8t14 = new Team("Leeds United          ", 68, 66, 68);
			Team l8t15 = new Team("Middlesbrough         ", 72, 67, 69);
			Team l8t16 = new Team("Millwall              ", 68, 66, 66);
			Team l8t17 = new Team("Norwich City          ", 71, 73, 72);
			Team l8t18 = new Team("Nottingham Forest     ", 69, 68, 68);
			Team l8t19 = new Team("Reading               ", 70, 68, 68);
			Team l8t20 = new Team("Rotherham United      ", 67, 64, 64);
			Team l8t21 = new Team("Sheffield Wednesday   ", 67, 65, 66);
			Team l8t22 = new Team("Watford               ", 70, 68, 68);
			Team l8t23 = new Team("Wigan Athletic        ", 69, 69, 68);
			Team l8t24 = new Team("Wolverhampton Wolves  ", 67, 66, 68);
			
			Team l9t1  = new Team("Barnsley              ", 62, 61, 62);
			Team l9t2  = new Team("Bradford City AFC     ", 64, 62, 62);
			Team l9t3  = new Team("Bristol City FC       ", 65, 63, 64);
			Team l9t4  = new Team("Chesterfield          ", 62, 62, 62);
			Team l9t5  = new Team("Colchester United     ", 62, 61, 60);
			Team l9t6  = new Team("Coventry City         ", 65, 63, 63);
			Team l9t7  = new Team("Crawley Town          ", 61, 61, 60);
			Team l9t8  = new Team("Crewe Alexandra       ", 59, 58, 58);
			Team l9t9  = new Team("Doncaster Rovers      ", 62, 61, 61);
			Team l9t10 = new Team("Fleetwood Town        ", 62, 60, 61);
			Team l9t11 = new Team("Gillingham FC         ", 60, 61, 59);
			Team l9t12 = new Team("Leyton Orient         ", 66, 64, 64);
			Team l9t13 = new Team("Milton Keynes Dons    ", 63, 61, 63);
			Team l9t14 = new Team("Notts County          ", 62, 61, 56);
			Team l9t15 = new Team("Oldham Athletic       ", 61, 60, 63);
			Team l9t16 = new Team("Peterborough United FC", 62, 60, 61);
			Team l9t17 = new Team("Port Vale FC          ", 62, 61, 61);
			Team l9t18 = new Team("Preston North End     ", 64, 61, 63);
			Team l9t19 = new Team("Rochdale              ", 60, 58, 59);
			Team l9t20 = new Team("Scunthorpe United     ", 62, 59, 61);
			Team l9t21 = new Team("Sheffield United      ", 62, 63, 60);
			Team l9t22 = new Team("Swindon Town          ", 62, 60, 58);
			Team l9t23 = new Team("Walsall               ", 62, 59, 63);
			Team l9t24 = new Team("Yeovil Town           ", 60, 62, 62);
			
			Team l10t1  = new Team("Accrington Stanley  ", 55, 55, 56);
			Team l10t2  = new Team("AFC Wimbledon       ", 63, 59, 58);
			Team l10t3  = new Team("Burton Albion       ", 59, 58, 59);
			Team l10t4  = new Team("Bury                ", 61, 60, 58);
			Team l10t5  = new Team("Cambridge United    ", 59, 57, 59);
			Team l10t6  = new Team("Carlisle United     ", 65, 58, 52);
			Team l10t7  = new Team("Cheltenham Town     ", 60, 54, 59);
			Team l10t8  = new Team("Dagenham & Redbridge", 62, 60, 56);
			Team l10t9  = new Team("Exeter City         ", 59, 57, 57);
			Team l10t10 = new Team("Hartlepool United   ", 59, 60, 59);
			Team l10t11 = new Team("Luton Town          ", 59, 58, 57);
			Team l10t12 = new Team("Mansfield Town      ", 58, 59, 57);
			Team l10t13 = new Team("Morecambe           ", 57, 56, 57);
			Team l10t14 = new Team("Newport County      ", 59, 58, 58);
			Team l10t15 = new Team("Northampton Town    ", 60, 58, 60);
			Team l10t16 = new Team("Oxford United       ", 64, 59, 61);
			Team l10t17 = new Team("Plymouth Argyle     ", 60, 56, 59);
			Team l10t18 = new Team("Portsmouth          ", 61, 62, 60);
			Team l10t19 = new Team("Shrewbury Town      ", 62, 61, 60);
			Team l10t20 = new Team("Southend United     ", 59, 58, 59);
			Team l10t21 = new Team("Stevenage           ", 58, 56, 57);
			Team l10t22 = new Team("Tranmere Rovers     ", 58, 58, 59);
			Team l10t23 = new Team("Wycombe Wanderers   ", 59, 59, 58);
			Team l10t24 = new Team("York City           ", 59, 59, 58);
			
			Team l11t1  = new Team("SC Bastia               ", 70, 68, 70);
			Team l11t2  = new Team("FC Girondins de Bordeaux", 75, 73, 72);
			Team l11t3  = new Team("Stade Malherbe Caen     ", 67, 68, 66);
			Team l11t4  = new Team("Evian Thonon Gaillard FC", 68, 71, 66);
			Team l11t5  = new Team("En Avant de Guingamp    ", 67, 73, 71);
			Team l11t6  = new Team("RC Lens                 ", 69, 67, 67);
			Team l11t7  = new Team("Lille OSC               ", 73, 75, 76);
			Team l11t8  = new Team("FC Lorient              ", 72, 70, 69);
			Team l11t9  = new Team("Olympique Lyonnais      ", 74, 74, 73);
			Team l11t10 = new Team("Olympique de Marseille  ", 77, 77, 75);
			Team l11t11 = new Team("FC Metz                 ", 68, 67, 66);
			Team l11t12 = new Team("AS Monaco FC            ", 78, 77, 74);
			Team l11t13 = new Team("Montpellier HSC         ", 70, 73, 71);
			Team l11t14 = new Team("FC Nantes               ", 69, 70, 73);
			Team l11t15 = new Team("OGC Nice                ", 75, 69, 66);
			Team l11t16 = new Team("Paris Saint-Germain FC  ", 82, 81, 80);
			Team l11t17 = new Team("Stade Rennais FC        ", 74, 72, 75);
			Team l11t18 = new Team("Stade de Reims          ", 70, 72, 72);
			Team l11t19 = new Team("AS Saint-Étienne        ", 74, 75, 74);
			Team l11t20 = new Team("Toulouse FC             ", 75, 69, 70);
			
			Team l12t1  = new Team("AC Ajaccio            ", 64, 66, 65);
			Team l12t2  = new Team("AC Arles-Avignon      ", 64, 60, 64);
			Team l12t3  = new Team("AJ Auxerre            ", 65, 63, 64);
			Team l12t4  = new Team("Angers SCO            ", 64, 65, 64);
			Team l12t5  = new Team("AS Nancy              ", 67, 62, 64);
			Team l12t6  = new Team("Chamois Niortais FC   ", 65, 64, 64);
			Team l12t7  = new Team("LB Châteauroux        ", 61, 63, 64);
			Team l12t8  = new Team("Clermont Foot         ", 65, 62, 63);
			Team l12t9  = new Team("Dijon FCO             ", 65, 61, 64);
			Team l12t10 = new Team("ES Troyes AC          ", 66, 66, 66);
			Team l12t11 = new Team("FC Sochaux-Montbéliard", 64, 65, 67);
			Team l12t12 = new Team("Gazélec Ajaccio       ", 66, 60, 62);
			Team l12t13 = new Team("Le Havre AC           ", 63, 64, 62);
			Team l12t14 = new Team("Nîmes Olympique       ", 66, 59, 63);
			Team l12t15 = new Team("Stade Brestois 29     ", 65, 65, 64);
			Team l12t16 = new Team("Stade Lavallois       ", 64, 64, 62);
			Team l12t17 = new Team("Tours FC              ", 64, 63, 61);
			Team l12t18 = new Team("US Créteil-Lusitanos  ", 64, 65, 64);
			Team l12t19 = new Team("US Orléans            ", 62, 61, 61);
			Team l12t20 = new Team("Valenciennes FC       ", 68, 65, 64);
			
			Team l13t1  = new Team("Bayer Leverkusen        ", 80, 78, 74);
			Team l13t2  = new Team("Bayern Munich           ", 87, 86, 80);
			Team l13t3  = new Team("Borussia Dortmund       ", 79, 81, 83);
			Team l13t4  = new Team("Borussia Mönchengladbach", 79, 76, 74);
			Team l13t5  = new Team("FC Augsburg             ", 71, 71, 71);
			Team l13t6  = new Team("Eintracht Frankfurt     ", 74, 73, 74);
			Team l13t7  = new Team("SC Freiburg             ", 65, 72, 69);
			Team l13t8  = new Team("Hamburger SV            ", 75, 73, 72);
			Team l13t9  = new Team("Hannover 96             ", 74, 76, 72);
			Team l13t10 = new Team("Hertha BSC              ", 77, 73, 72);
			Team l13t11 = new Team("TSG 1899 Hoffenheim     ", 76, 76, 73);
			Team l13t12 = new Team("1. FC Köln              ", 75, 71, 71);
			Team l13t13 = new Team("1. FSV Mainz 05         ", 80, 74, 73);
			Team l13t14 = new Team("SC Paderborn 07         ", 69, 68, 68);
			Team l13t15 = new Team("Schalke 04              ", 84, 76, 73);
			Team l13t16 = new Team("VfB Stuttgart           ", 75, 72, 70);
			Team l13t17 = new Team("Werder Bremen           ", 70, 73, 73);
			Team l13t18 = new Team("VfL Wolfsburg           ", 78, 76, 78);
			
			Team l14t1  = new Team("1. FC Union Berlin    ", 68, 64, 65);
			Team l14t2  = new Team("FC St. Pauli          ", 68, 65, 67);
			Team l14t3  = new Team("SV Sandhausen         ", 66, 64, 65);
			Team l14t4  = new Team("RB Leipzig            ", 66, 64, 64);
			Team l14t5  = new Team("1. FC Nüremberg       ", 69, 67, 68);
			Team l14t6  = new Team("1860 Munich           ", 68, 67, 67);
			Team l14t7  = new Team("Karlsruher SC         ", 66, 65, 65);
			Team l14t8  = new Team("1. FC Kaiserslautern  ", 69, 69, 66);
			Team l14t9  = new Team("FC Ingolstadt 04      ", 68, 67, 66);
			Team l14t10 = new Team("1. FC Heidenheim      ", 64, 63, 63);
			Team l14t11 = new Team("SpVgg Greuther Fürth  ", 68, 67, 67);
			Team l14t12 = new Team("FSV Frankfurt         ", 67, 64, 67);
			Team l14t13 = new Team("Fortuna Düsseldorf    ", 70, 68, 68);
			Team l14t14 = new Team("FC Erzgebirge Aue     ", 64, 64, 64);
			Team l14t15 = new Team("Eintracht Braunschweig", 68, 68, 66);
			Team l14t16 = new Team("SV Darmstadt 98       ", 65, 65, 64);
			Team l14t17 = new Team("VfL Bochum            ", 68, 67, 67);
			Team l14t18 = new Team("VfR Aalen             ", 63, 64, 64);
			
			Team l15t1  = new Team("Atalanta BC             ", 73, 73, 73);
			Team l15t2  = new Team("Cagliari Calcio         ", 74, 71, 69);
			Team l15t3  = new Team("AC Cesena               ", 68, 67, 64);
			Team l15t4  = new Team("AC Chievo Verona        ", 75, 73, 70);
			Team l15t5  = new Team("Empoli FC               ", 70, 67, 67);
			Team l15t6  = new Team("ACF Fiorentina          ", 78, 78, 74);
			Team l15t7  = new Team("Genoa CFC               ", 73, 72, 72);
			Team l15t8  = new Team("Hellas Verona FC        ", 73, 72, 70);
			Team l15t9  = new Team("FC Internazionale Milano", 80, 78, 78);
			Team l15t10 = new Team("Juventus FC             ", 84, 81, 80);
			Team l15t11 = new Team("SS Lazio                ", 79, 78, 75);
			Team l15t12 = new Team("AC Milan                ", 80, 78, 76);
			Team l15t13 = new Team("SSC Napoli              ", 80, 77, 74);
			Team l15t14 = new Team("US Città di Palermo     ", 68, 65, 67);
			Team l15t15 = new Team("Parma FC                ", 72, 70, 69);
			Team l15t16 = new Team("AS Roma                 ", 78, 81, 78);
			Team l15t17 = new Team("UC Sampdoria            ", 74, 72, 71);
			Team l15t18 = new Team("Sassuolo Salerno        ", 71, 66, 69);
			Team l15t19 = new Team("Torino FC               ", 71, 69, 73);
			Team l15t20 = new Team("Udinese Calcio          ", 74, 70, 73);
			
			Team l16t1  = new Team("Avellino       ", 63, 64, 65);
			Team l16t2  = new Team("Bari           ", 68, 69, 65);
			Team l16t3  = new Team("Bologna        ", 68, 68, 67);
			Team l16t4  = new Team("Brescia        ", 68, 64, 64);
			Team l16t5  = new Team("Carpi          ", 69, 64, 63);
			Team l16t6  = new Team("Catania        ", 72, 69, 69);
			Team l16t7  = new Team("Cittadella     ", 65, 60, 59);
			Team l16t8  = new Team("Crotone        ", 61, 62, 60);
			Team l16t9  = new Team("Frosinone      ", 65, 60, 61);
			Team l16t10 = new Team("Latina         ", 64, 65, 63);
			Team l16t11 = new Team("Livorno        ", 68, 64, 65);
			Team l16t12 = new Team("Modena         ", 65, 63, 66);
			Team l16t13 = new Team("Perugia        ", 65, 59, 64);
			Team l16t14 = new Team("Pescara        ", 68, 65, 65);
			Team l16t15 = new Team("Pro Vercelli   ", 62, 60, 62);
			Team l16t16 = new Team("La Spezia      ", 67, 63, 62);
			Team l16t17 = new Team("Terni          ", 66, 65, 63);
			Team l16t18 = new Team("Trapani        ", 65, 64, 62);
			Team l16t19 = new Team("Varese         ", 65, 64, 61);
			Team l16t20 = new Team("Chiavari       ", 63, 63, 63);
			Team l16t21 = new Team("Borgocalcio    ", 60, 63, 61);
			Team l16t22 = new Team("Virtus Lanciano", 61, 62, 65);
			
			Team l17t1  = new Team("ADO Den Haag   ", 66, 66, 66);
			Team l17t2  = new Team("Ajax           ", 73, 74, 72);
			Team l17t3  = new Team("AZ             ", 69, 71, 67);
			Team l17t4  = new Team("Excelsior      ", 65, 63, 62);
			Team l17t5  = new Team("FC Dordrecht   ", 64, 65, 63);
			Team l17t6  = new Team("FC Groningen   ", 66, 68, 67);
			Team l17t7  = new Team("FC Twente      ", 70, 72, 71);
			Team l17t8  = new Team("FC Utrecht     ", 66, 70, 67);
			Team l17t9  = new Team("Feyenoord      ", 71, 74, 72);
			Team l17t10 = new Team("Go Ahead Eagles", 65, 66, 63);
			Team l17t11 = new Team("Heracles Almelo", 67, 66, 65);
			Team l17t12 = new Team("NAC Breda      ", 66, 65, 64);
			Team l17t13 = new Team("PEC Zwolle     ", 75, 66, 65);
			Team l17t14 = new Team("PSV            ", 75, 73, 72);
			Team l17t15 = new Team("SC Cambuur     ", 64, 64, 64);
			Team l17t16 = new Team("SC Heerenveen  ", 66, 66, 65);
			Team l17t17 = new Team("Vitesse        ", 71, 70, 69);
			Team l17t18 = new Team("Willem II      ", 67, 64, 64);
			
			Team l18t1  = new Team("Aalesunds FK   ", 66, 66, 63);
			Team l18t2  = new Team("FK Bodø/Glimt  ", 64, 60, 61);
			Team l18t3  = new Team("FK Haugesund   ", 64, 63, 62);
			Team l18t4  = new Team("Lillestrøm SK  ", 60, 63, 62);
			Team l18t5  = new Team("Sandnes Ulf    ", 58, 59, 59);
			Team l18t6  = new Team("Molde FK       ", 66, 65, 68);
			Team l18t7  = new Team("ODD            ", 64, 65, 60);
			Team l18t8  = new Team("Rosenborg BK   ", 67, 71, 65);
			Team l18t9  = new Team("SK Brann       ", 65, 63, 63);
			Team l18t10 = new Team("Sarpsborg 08   ", 63, 63, 63);
			Team l18t11 = new Team("Stabæk Fotball ", 64, 64, 61);
			Team l18t12 = new Team("Start          ", 64, 63, 61);
			Team l18t13 = new Team("Strømsgodset IF", 65, 66, 66);
			Team l18t14 = new Team("Sogndal        ", 62, 59, 57);
			Team l18t15 = new Team("Viking FK      ", 65, 66, 64);
			Team l18t16 = new Team("Vålerenga      ", 66, 62, 62);
			
			Team l19t1  = new Team("Cracovia                  ", 61, 63, 61);
			Team l19t2  = new Team("GKS Bełchatów             ", 62, 60, 61);
			Team l19t3  = new Team("Górnik Zabrze             ", 64, 61, 65);
			Team l19t4  = new Team("Górnik Łęczna             ", 61, 60, 60);
			Team l19t5  = new Team("Jagiellonia Białystok     ", 60, 63, 62);
			Team l19t6  = new Team("Korona Kielce             ", 59, 62, 61);
			Team l19t7  = new Team("Lech Poznań               ", 65, 68, 65);
			Team l19t8  = new Team("Lechia Gdańsk             ", 64, 64, 64);
			Team l19t9  = new Team("Legia Warszawa            ", 70, 66, 66);
			Team l19t10 = new Team("Piast Gliwice             ", 65, 64, 62);
			Team l19t11 = new Team("Podbeskidzie Bielsko-Biała", 64, 61, 62);
			Team l19t12 = new Team("Pogoń Szczecin            ", 64, 63, 63);
			Team l19t13 = new Team("Ruch Chorzów              ", 63, 62, 62);
			Team l19t14 = new Team("Wisła Kraków              ", 64, 63, 65);
			Team l19t15 = new Team("Zawisza Bydgoszcz         ", 65, 66, 62);
			Team l19t16 = new Team("Śląsk Wrocław             ", 69, 63, 63);
			
			Team l20t1  = new Team("Académica           ", 66, 67, 66);
			Team l20t2  = new Team("FC Arouca           ", 68, 70, 66);
			Team l20t3  = new Team("Belenenses          ", 67, 68, 65);
			Team l20t4  = new Team("SL Benfica          ", 74, 77, 77);
			Team l20t5  = new Team("Boavista            ", 67, 65, 64);
			Team l20t6  = new Team("SC Braga            ", 74, 73, 71);
			Team l20t7  = new Team("Estoril-Praia       ", 68, 69, 69);
			Team l20t8  = new Team("Gil Vicente         ", 67, 67, 67);
			Team l20t9  = new Team("CS Marítimo         ", 67, 68, 67);
			Team l20t10 = new Team("Moreirense FC       ", 69, 67, 66);
			Team l20t11 = new Team("CD Nacional         ", 68, 68, 69);
			Team l20t12 = new Team("Paços de Ferreira   ", 68, 68, 64);
			Team l20t13 = new Team("Penafiel            ", 65, 66, 63);
			Team l20t14 = new Team("FC Porto            ", 78, 73, 76);
			Team l20t15 = new Team("Rio Ave FC          ", 68, 70, 68);
			Team l20t16 = new Team("Sporting CP         ", 76, 77, 72);
			Team l20t17 = new Team("Vitória de Guimarães", 67, 68, 65);
			Team l20t18 = new Team("Vitória de Setúbal  ", 66, 65, 66);
			
			Team l21t1  = new Team("Bohemians FC          ", 55, 54, 54);
			Team l21t2  = new Team("Bray Wanderers        ", 53, 53, 52);
			Team l21t3  = new Team("Cork City             ", 57, 58, 57);
			Team l21t4  = new Team("Derry City            ", 57, 54, 55);
			Team l21t5  = new Team("Drogheda United       ", 55, 53, 53);
			Team l21t6  = new Team("Dundalk               ", 58, 58, 57);
			Team l21t7  = new Team("Athlone Town          ", 52, 53, 52);
			Team l21t8  = new Team("Limerick              ", 56, 55, 54);
			Team l21t9  = new Team("Longford Town         ", 52, 54, 53);
			Team l21t10 = new Team("Shamrock Rovers       ", 57, 59, 57);
			Team l21t11 = new Team("Sligo Rovers          ", 59, 56, 57);
			Team l21t12 = new Team("St. Patrick's Athletic", 58, 59, 57);
			
			Team l22t1  = new Team("Amkar Perm            ", 64, 62, 65);
			Team l22t2  = new Team("Arsenal Tula          ", 62, 60, 62);
			Team l22t3  = new Team("CSKA Moskva           ", 82, 76, 74);
			Team l22t4  = new Team("Dinamo Moskva         ", 77, 77, 73);
			Team l22t5  = new Team("FC Krasnodar          ", 75, 69, 70);
			Team l22t6  = new Team("Kuban Krasnodar       ", 71, 72, 69);
			Team l22t7  = new Team("Lokomotiv Moskva      ", 79, 75, 74);
			Team l22t8  = new Team("Mordovia Saransk      ", 65, 62, 64);
			Team l22t9  = new Team("FC Rostov             ", 69, 67, 66);
			Team l22t10 = new Team("Rubin Kazan           ", 70, 71, 68);
			Team l22t11 = new Team("Spartak Moskva        ", 78, 75, 73);
			Team l22t12 = new Team("Terek Grozny          ", 68, 70, 66);
			Team l22t13 = new Team("Torpedo Moskva        ", 69, 62, 61);
			Team l22t14 = new Team("FC Ufa                ", 61, 63, 60);
			Team l22t15 = new Team("Ural Sverdlovsk Oblast", 67, 66, 65);
			Team l22t16 = new Team("Zenit St. Petersburg  ", 77, 78, 77);
			
			Team l23t1  = new Team("Aberdeen                    ", 66, 65, 64);
			Team l23t2  = new Team("Celtic                      ", 70, 71, 72);
			Team l23t3  = new Team("Dundee FC                   ", 61, 60, 58);
			Team l23t4  = new Team("Dundee United               ", 65, 65, 60);
			Team l23t5  = new Team("Hamilton Academical         ", 63, 58, 58);
			Team l23t6  = new Team("Inverness Caledonian Thistle", 71, 63, 64);
			Team l23t7  = new Team("Kilmarnock                  ", 63, 63, 60);
			Team l23t8  = new Team("Motherwell                  ", 65, 66, 62);
			Team l23t9  = new Team("Partick Thistle             ", 61, 61, 60);
			Team l23t10 = new Team("Ross County                 ", 63, 62, 59);
			Team l23t11 = new Team("St. Johnstone               ", 63, 63, 64);
			Team l23t12 = new Team("St. Mirren                  ", 64, 61, 58);
			
			Team l24t1  = new Team("UD Almería            ", 73, 71, 70);
			Team l24t2  = new Team("Atlético Bilbao       ", 77, 78, 78);
			Team l24t3  = new Team("Atlético Madrid       ", 78, 80, 80);
			Team l24t4  = new Team("FC Barcelona          ", 88, 84, 82);
			Team l24t5  = new Team("Real Celta de Vigo    ", 77, 74, 72);
			Team l24t6  = new Team("Córdoba CF            ", 71, 73, 68);
			Team l24t7  = new Team("Deportivo de La Coruña", 75, 72, 72);
			Team l24t8  = new Team("SD Eibar              ", 73, 71, 70);
			Team l24t9  = new Team("Elche CF              ", 74, 70, 72);
			Team l24t10 = new Team("RCD Espanyol          ", 73, 70, 71);
			Team l24t11 = new Team("Getafe CF             ", 71, 71, 71);
			Team l24t12 = new Team("Granada CF            ", 71, 72, 70);
			Team l24t13 = new Team("Levante UD            ", 73, 73, 73);
			Team l24t14 = new Team("Málaga CF             ", 76, 74, 74);
			Team l24t15 = new Team("Rayo Vallecano        ", 72, 74, 74);
			Team l24t16 = new Team("Real Madrid CF        ", 85, 85, 81);
			Team l24t17 = new Team("Real Sociedad         ", 79, 75, 75);
			Team l24t18 = new Team("Sevilla FC            ", 79, 76, 77);
			Team l24t19 = new Team("Valencia CF           ", 80, 77, 76);
			Team l24t20 = new Team("Villarreal CF         ", 77, 75, 75);
			
			Team l25t1  = new Team("Deportivo Alavés ", 64, 65, 66);
			Team l25t2  = new Team("Albacete         ", 64, 64, 61);
			Team l25t3  = new Team("AD Alcorcón      ", 66, 66, 65);
			Team l25t4  = new Team("FC Barcelona B   ", 65, 64, 64);
			Team l25t5  = new Team("Real Betis       ", 71, 71, 70);
			Team l25t6  = new Team("Girona CF        ", 65, 66, 66);
			Team l25t7  = new Team("UD Las Palmas    ", 70, 68, 67);
			Team l25t8  = new Team("CD Leganés       ", 63, 61, 61);
			Team l25t9  = new Team("UE Llagostera    ", 62, 63, 61);
			Team l25t10 = new Team("CD Lugo          ", 67, 67, 66);
			Team l25t11 = new Team("RCD Mallorca     ", 67, 66, 67);
			Team l25t12 = new Team("CD Mirandés      ", 65, 62, 63);
			Team l25t13 = new Team("CD Numancia      ", 65, 66, 64);
			Team l25t14 = new Team("CA Osasuna       ", 68, 70, 70);
			Team l25t15 = new Team("SD Ponferradina  ", 64, 66, 66);
			Team l25t16 = new Team("Racing Santander ", 62, 62, 62);
			Team l25t17 = new Team("RC Recreativo    ", 64, 66, 64);
			Team l25t18 = new Team("Sabadell FC      ", 64, 66, 65);
			Team l25t19 = new Team("Sporting de Gijón", 63, 65, 66);
			Team l25t20 = new Team("CD Tenerife      ", 67, 65, 65);
			Team l25t21 = new Team("Real Valladolid  ", 68, 72, 71);
			Team l25t22 = new Team("Real Zaragoza    ", 68, 67, 67);
			
			Team l26t1  = new Team("AIK Fotboll    ", 66, 65, 67);
			Team l26t2  = new Team("BK Häcken      ", 64, 67, 62);
			Team l26t3  = new Team("Djurgårdens IF ", 63, 62, 63);
			Team l26t4  = new Team("Falkenbergs FF ", 61, 59, 61);
			Team l26t5  = new Team("Gefle IF       ", 63, 57, 60);
			Team l26t6  = new Team("Brommapojkarna ", 61, 60, 58);
			Team l26t7  = new Team("Halmstads BK   ", 59, 61, 60);
			Team l26t8  = new Team("Mjällby AIF    ", 62, 60, 60);
			Team l26t9  = new Team("Helsingborgs IF", 60, 64, 62);
			Team l26t10 = new Team("IF Elfsborg    ", 63, 66, 62);
			Team l26t11 = new Team("IFK Göteborg   ", 66, 67, 63);
			Team l26t12 = new Team("IFK Norrköping ", 62, 61, 59);
			Team l26t13 = new Team("Kalmar FF      ", 65, 62, 63);
			Team l26t14 = new Team("Malmö FF       ", 67, 66, 66);
			Team l26t15 = new Team("Åtvidabergs FF ", 61, 64, 61);
			Team l26t16 = new Team("Örebro SK      ", 59, 62, 61);
			
			Team l27t1  = new Team("FC Aarau      ", 63, 62, 58);
			Team l27t2  = new Team("FC Basel      ", 71, 68, 72);
			Team l27t3  = new Team("Grasshopper   ", 67, 66, 64);
			Team l27t4  = new Team("FC Luzern     ", 69, 67, 63);
			Team l27t5  = new Team("FC Sion       ", 68, 65, 64);
			Team l27t6  = new Team("FC St. Gallen ", 62, 62, 57);
			Team l27t7  = new Team("FC Thun       ", 62, 63, 59);
			Team l27t8  = new Team("FC Vaduz      ", 59, 59, 58);
			Team l27t9  = new Team("BSC Young Boys", 67, 65, 67);
			Team l27t10 = new Team("FC Zürich     ", 70, 66, 61);
			
			Team l28t1  = new Team("Akhisar Belediyespor", 70, 66, 65);
			Team l28t2  = new Team("Balıkesirspor       ", 66, 62, 61);
			Team l28t3  = new Team("Beşiktaş JK         ", 76, 77, 75);
			Team l28t4  = new Team("Bursaspor           ", 75, 71, 70);
			Team l28t5  = new Team("Eskişehirspor       ", 67, 67, 62);
			Team l28t6  = new Team("Fenerbahçe SK       ", 78, 76, 77);
			Team l28t7  = new Team("Galatasaray SK      ", 75, 78, 75);
			Team l28t8  = new Team("Gaziantepspor       ", 67, 62, 62);
			Team l28t9  = new Team("Gençlerbirliği      ", 65, 65, 64);
			Team l28t10 = new Team("İstanbul Başakşehir ", 69, 60, 67);
			Team l28t11 = new Team("Karabükspor         ", 69, 67, 68);
			Team l28t12 = new Team("Kasımpaşa SK        ", 71, 70, 68);
			Team l28t13 = new Team("Kayseri Erciyesspor ", 68, 65, 63);
			Team l28t14 = new Team("Mersin İdman Yurdu  ", 67, 66, 67);
			Team l28t15 = new Team("Sivasspor           ", 69, 69, 72);
			Team l28t16 = new Team("Torku Konyaspor     ", 70, 68, 64);
			Team l28t17 = new Team("Trabzonspor         ", 76, 67, 70);
			Team l28t18 = new Team("Çaykur Rizespor     ", 71, 68, 68);
			
			Team l29t1  = new Team("América      ", 71, 69, 70);
			Team l29t2  = new Team("Atlas        ", 65, 60, 67);
			Team l29t3  = new Team("Chiapas      ", 68, 66, 66);
			Team l29t4  = new Team("Cruz Azul    ", 68, 68, 69);
			Team l29t5  = new Team("Guadalajara  ", 68, 68, 65);
			Team l29t6  = new Team("Club León    ", 68, 69, 69);
			Team l29t7  = new Team("Monterrey    ", 71, 68, 68);
			Team l29t8  = new Team("Leones Negros", 62, 62, 63);
			Team l29t9  = new Team("Pachuca      ", 69, 68, 68);
			Team l29t10 = new Team("Puebla       ", 66, 65, 66);
			Team l29t11 = new Team("Querétaro    ", 70, 68, 63);
			Team l29t12 = new Team("Santos Laguna", 68, 68, 67);
			Team l29t13 = new Team("Tijuana      ", 68, 69, 66);
			Team l29t14 = new Team("Toluca       ", 68, 69, 65);
			Team l29t15 = new Team("Monarcas     ", 68, 67, 67);
			Team l29t16 = new Team("Tigres       ", 67, 68, 70);
			Team l29t17 = new Team("UNAM         ", 65, 66, 66);
			Team l29t18 = new Team("Veracruz     ", 68, 65, 63);
			
			Team l30et1  = new Team("Chicago Fire          ", 65, 62, 64);
			Team l30et2  = new Team("Columbus Crew         ", 59, 66, 63);
			Team l30et3  = new Team("DC United             ", 68, 65, 63);
			Team l30et4  = new Team("Montreal Impact       ", 70, 71, 60);
			Team l30et5  = new Team("New England Revolution", 65, 67, 64);
			Team l30et6  = new Team("New York Red Bulls    ", 73, 67, 63);
			Team l30et7  = new Team("Philadelphia Union    ", 64, 66, 64);
			Team l30et8  = new Team("Sporting Kansas City  ", 67, 69, 67);
			Team l30et9  = new Team("Toronto FC            ", 71, 66, 63);
			Team l30et10 = new Team("Vancouver Whitecaps FC", 65, 66, 60);
			
			Team l30wt1 = new Team("Colorado Rapids       ", 66, 65, 63);
			Team l30wt2 = new Team("FC Dallas             ", 71, 66, 63);
			Team l30wt3 = new Team("Houston Dynamo        ", 64, 65, 61);
			Team l30wt4 = new Team("LA Galaxy             ", 68, 71, 66);
			Team l30wt5 = new Team("Chivas USA            ", 66, 62, 60);
			Team l30wt6 = new Team("Portland Timbers      ", 65, 69, 63);
			Team l30wt7 = new Team("Real Salt Lake        ", 67, 68, 63);
			Team l30wt8 = new Team("San Jose Earthquakes  ", 64, 66, 64);
			Team l30wt9 = new Team("Seattle Sounders FC   ", 73, 69, 64);
			
			Team l31t1  = new Team("Arsenal                    ", 66, 66, 67);
			Team l31t2  = new Team("Atlético de Rafaela        ", 66, 65, 64);
			Team l31t3  = new Team("Banfield                   ", 68, 67, 67);
			Team l31t4  = new Team("Belgrano                   ", 70, 65, 65);
			Team l31t5  = new Team("Boca Juniors               ", 73, 72, 72);
			Team l31t6  = new Team("Defensa y Justicia         ", 65, 63, 63);
			Team l31t7  = new Team("Estudiantes de La Plata    ", 72, 69, 68);
			Team l31t8  = new Team("Gimnasia y Esgrima La Plata", 65, 65, 64);
			Team l31t9  = new Team("Godoy Cruz                 ", 68, 65, 64);
			Team l31t10 = new Team("Independiente              ", 69, 69, 68);
			Team l31t11 = new Team("Lanús                      ", 71, 70, 68);
			Team l31t12 = new Team("Newell's Old Boys          ", 71, 70, 73);
			Team l31t13 = new Team("Olimpo                     ", 66, 66, 64);
			Team l31t14 = new Team("Quilmes                    ", 63, 65, 63);
			Team l31t15 = new Team("Racing Club                ", 72, 71, 68);
			Team l31t16 = new Team("River Plate                ", 74, 71, 71);
			Team l31t17 = new Team("Rosario Central            ", 67, 67, 67);
			Team l31t18 = new Team("San Lorenzo                ", 72, 72, 71);
			Team l31t19 = new Team("Tigre                      ", 69, 69, 65);
			Team l31t20 = new Team("Vélez Sarsfield            ", 71, 68, 69);
			
			Team l32t1  = new Team("CD Antofagasta           ", 65, 60, 62);
			Team l32t2  = new Team("Audax Italiano           ", 66, 62, 65);
			Team l32t3  = new Team("AC Barnechea             ", 63, 60, 58);
			Team l32t4  = new Team("CD Cobreloa              ", 66, 64, 63);
			Team l32t5  = new Team("CD Cobresal              ", 61, 60, 60);
			Team l32t6  = new Team("Colo-Colo                ", 70, 71, 70);
			Team l32t7  = new Team("CD Huachipato            ", 63, 64, 65);
			Team l32t8  = new Team("Deportivo Iquique        ", 66, 62, 62);
			Team l32t9  = new Team("CD O'Higgins             ", 67, 69, 68);
			Team l32t10 = new Team("CD Palestino             ", 62, 62, 65);
			Team l32t11 = new Team("San Marcos               ", 64, 63, 64);
			Team l32t12 = new Team("Santiago Wanderers       ", 69, 63, 65);
			Team l32t13 = new Team("Universidad Católica     ", 65, 69, 68);
			Team l32t14 = new Team("Universidad de Chile     ", 71, 70, 70);
			Team l32t15 = new Team("Universidad de Concepción", 65, 63, 62);
			Team l32t16 = new Team("Unión Española           ", 67, 68, 66);
			Team l32t17 = new Team("Unión La Calera          ", 71, 62, 63);
			Team l32t18 = new Team("Ñublense                 ", 64, 65, 60);
			
			Team l33t1  = new Team("Águilas Pereira       ", 67, 67, 66);
			Team l33t2  = new Team("Alianze Petrolera     ", 63, 63, 60);
			Team l33t3  = new Team("Atlético Huila        ", 62, 62, 63);
			Team l33t4  = new Team("Atlético Nacional     ", 72, 72, 68);
			Team l33t5  = new Team("Boyacá Chicó          ", 61, 63, 61);
			Team l33t6  = new Team("Fortaleza FC          ", 63, 64, 63);
			Team l33t7  = new Team("Deportes Tolima       ", 66, 67, 65);
			Team l33t8  = new Team("Deportivo Cali        ", 67, 69, 67);
			Team l33t9  = new Team("Deportivo Pasto       ", 66, 65, 64);
			Team l33t10 = new Team("Envigado              ", 62, 62, 62);
			Team l33t11 = new Team("Independiente Medellín", 70, 66, 67);
			Team l33t12 = new Team("Junior FC             ", 68, 69, 69);
			Team l33t13 = new Team("La Equidad            ", 67, 65, 64);
			Team l33t14 = new Team("Millonarios FC        ", 67, 70, 67);
			Team l33t15 = new Team("Once Caldas           ", 66, 67, 66);
			Team l33t16 = new Team("Patriotas FC          ", 63, 62, 61);
			Team l33t17 = new Team("Santa Fe              ", 68, 69, 67);
			Team l33t18 = new Team("Uniautónoma FC        ", 65, 62, 62);
			
			if ( num == 1 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l1t1, l1t2, l1t3, l1t4, l1t5, l1t6, l1t7, l1t8, l1t9, l1t10}, "#    Team	         MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Hyundai A-League (Australia)\n" + sim);
			}
			
			else if ( num == 2 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l2t1, l2t2, l2t3, l2t4, l2t5, l2t6, l2t7, l2t8, l2t9, l2t10, l2t11, l2t12}, "#    Team	      MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("K League Classic (South Korea)\n" + sim);
			}
			
			else if ( num == 3 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l3t1, l3t2, l3t3, l3t4, l3t5, l3t6, l3t7, l3t8, l3t9, l3t10, l3t11, l3t12, l3t13, l3t14}, "#    Team	   MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Abdul Latif Jameel League (Saudi Arabia)\n" + sim);
			}
			
			else if ( num == 4 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l4t1, l4t2, l4t3, l4t4, l4t5, l4t6, l4t7, l4t8, l4t9, l4t10}, "#    Team	      MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Austria Bundesliga (Austria)\n" + sim);
			}
			
			else if ( num == 5 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l5t1, l5t2, l5t3, l5t4, l5t5, l5t6, l5t7, l5t8, l5t9, l5t10, l5t11, l5t12, l5t13, l5t14, l5t15, l5t16}, "#    Team	         MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Belgium Pro League (Belgium)\n" + sim);
			}

			else if ( num == 6 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l6t1, l6t2, l6t3, l6t4, l6t5, l6t6, l6t7, l6t8, l6t9, l6t10, l6t11, l6t12}, "#    Team	      MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Superliga (Denmark)\n" + sim);
			}
			
			else if ( num == 7 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l7t1, l7t2, l7t3, l7t4, l7t5, l7t6, l7t7, l7t8, l7t9, l7t10, l7t11, l7t12, l7t13, l7t14, l7t15, l7t16, l7t17, l7t18, l7t19, l7t20}, "#    Team	                MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Barclays Premier League (England)\n" + sim);
			}	
			
			else if ( num == 8 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l8t1, l8t2, l8t3, l8t4, l8t5, l8t6, l8t7, l8t8, l8t9, l8t10, l8t11, l8t12, l8t13, l8t14, l8t15, l8t16, l8t17, l8t18, l8t19, l8t20, l8t21, l8t22, l8t23, l8t24}, "#    Team	             MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Football League Championship (England)\n" + sim);
			}	
			
			else if ( num == 9 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l9t1, l9t2, l9t3, l9t4, l9t5, l9t6, l9t7, l9t8, l9t9, l9t10, l9t11, l9t12, l9t13, l9t14, l9t15, l9t16, l9t17, l9t18, l9t19, l9t20, l9t21, l9t22, l9t23, l9t24}, "#    Team                    MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Football League One (England)\n" + sim);
			}	
			
			else if ( num == 10 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l10t1, l10t2, l10t3, l10t4, l10t5, l10t6, l10t7, l10t8, l10t9, l10t10, l10t11, l10t12, l10t13, l10t14, l10t15, l10t16, l10t17, l10t18, l10t19, l10t20, l10t21, l10t22, l10t23, l10t24}, "#    Team                  MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Football League Two (England)\n" + sim);
			}
			
			else if ( num == 11 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l11t1, l11t2, l11t3, l11t4, l11t5, l11t6, l11t7, l11t8, l11t9, l11t10, l11t11, l11t12, l11t13, l11t14, l11t15, l11t16, l11t17, l11t18, l11t19, l11t20}, "#    Team	               MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Ligue 1 (France)\n" + sim);
			}	
			
			else if ( num == 12 )
			{	
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l12t1, l12t2, l12t3, l12t4, l12t5, l12t6, l12t7, l12t8, l12t9, l12t10, l12t11, l12t12, l12t13, l12t14, l12t15, l12t16, l12t17, l12t18, l12t19, l12t20}, "#    Team                    MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Ligue 2 (France)\n" + sim);
			}

			else if ( num == 13 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l13t1, l13t2, l13t3, l13t4, l13t5, l13t6, l13t7, l13t8, l13t9, l13t10, l13t11, l13t12, l13t13, l13t14, l13t15, l13t16, l13t17, l13t18}, "#    Team	               MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Bundesliga (Germany)\n" + sim);
			}

			else if ( num == 14 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l14t1, l14t2, l14t3, l14t4, l14t5, l14t6, l14t7, l14t8, l14t9, l14t10, l14t11, l14t12, l14t13, l14t14, l14t15, l14t16, l14t17, l14t18}, "#    Team	               MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("2. Bundesliga (Germany)\n" + sim);
			}
			
			else if ( num == 15 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l15t1, l15t2, l15t3, l15t4, l15t5, l15t6, l15t7, l15t8, l15t9, l15t10, l15t11, l15t12, l15t13, l15t14, l15t15, l15t16, l15t17, l15t18, l15t19, l15t20}, "#    Team	               MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Serie A (Italy)\n" + sim);
			}	
			
			else if ( num == 16 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l16t1, l16t2, l16t3, l16t4, l16t5, l16t6, l16t7, l16t8, l16t9, l16t10, l16t11, l16t12, l16t13, l16t14, l16t15, l16t16, l16t17, l16t18, l16t19, l16t20, l16t21, l16t22},  "#    Team             MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Serie B (Italy)\n" + sim);
			}	
			
			else if ( num == 17 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l17t1, l17t2, l17t3, l17t4, l17t5, l17t6, l17t7, l17t8, l17t9, l17t10, l17t11, l17t12, l17t13, l17t14, l17t15, l17t16, l17t17, l17t18}, "#    Team             MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Eredivise (Netherlands)\n" + sim);
			}	
			
			else if ( num == 18 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l18t1, l18t2, l18t3, l18t4, l18t5, l18t6, l18t7, l18t8, l18t9, l18t10, l18t11, l18t12, l18t13, l18t14, l18t15, l18t16}, "#    Team          MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Tippeligaen (Norway)\n" + sim);
			}	
			
			else if ( num == 19 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l19t1, l19t2, l19t3, l19t4, l19t5, l19t6, l19t7, l19t8, l19t9, l19t10, l19t11, l19t12, l19t13, l19t14, l19t15, l19t16}, "#    Team                        MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("T-Mobile Ekstraklasa (Poland)\n" + sim);
			}
			
			else if ( num == 20 )
			{	
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l20t1, l20t2, l20t3, l20t4, l20t5, l20t6, l20t7, l20t8, l20t9, l20t10, l20t11, l20t12, l20t13, l20t14, l20t15, l20t16, l20t17, l20t18}, "#    Team                  MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Primeira Liga (Portugal)\n" + sim);
			}
			
			else if ( num == 21 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l21t1, l21t2, l21t3, l21t4, l21t5, l21t6, l21t7, l21t8, l21t9, l21t10, l21t11, l21t12}, "#    Team                    MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("SSE Airtricity League (Ireland)\n" + sim);
			}
			
			else if ( num == 22 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l22t1, l22t2, l22t3, l22t4, l22t5, l22t6, l22t7, l22t8, l22t9, l22t10, l22t11, l22t12, l22t13, l22t14, l22t15, l22t16}, "#    Team                    MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Sogaz Russian Football Championship (Russia)\n" + sim);
			}
			
			else if ( num == 23 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l23t1, l23t2, l23t3, l23t4, l23t5, l23t6, l23t7, l23t8, l23t9, l23t10, l23t11, l23t12}, "#    Team                          MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Scottish Premiership (Scotland)\n" + sim);
			}
			
			else if ( num == 24 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l24t1, l24t2, l24t3, l24t4, l24t5, l24t6, l24t7, l24t8, l24t9, l24t10, l24t11, l24t12, l24t13, l24t14, l24t15, l24t16, l24t17, l24t18, l24t19, l24t20}, "#    Team	             MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Liga BBVA (Spain)\n" + sim);
			}
			
			else if ( num == 25 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l25t1, l25t2, l25t3, l25t4, l25t5, l25t6, l25t7, l25t8, l25t9, l25t10, l25t11, l25t12, l25t13, l25t14, l25t15, l25t16, l25t17, l25t18, l25t19, l25t20, l25t21, l25t22}, "#    Team               MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Liga Adelante (Spain)\n" + sim);
			}
			
			else if ( num == 26 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l26t1, l26t2, l26t3, l26t4, l26t5, l26t6, l26t7, l26t8, l26t9, l26t10, l26t11, l26t12, l26t13, l26t14, l26t15, l26t16}, "#    Team             MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Allsvenskan (Sweden)\n" + sim);
			}
			
			else if ( num == 27 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l27t1, l27t2, l27t3, l27t4, l27t5, l27t6, l27t7, l27t8, l27t9, l27t10}, "#    Team         MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Raiffeisen Super League (Switzerland)\n" + sim);
			
			}
			
			else if ( num == 28 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l28t1, l28t2, l28t3, l28t4, l28t5, l28t6, l28t7, l28t8, l28t9, l28t10, l28t11, l28t12, l28t13, l28t14, l28t15, l28t16, l28t17, l28t18}, "#    Team                  MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Süper Lig (Turkey)\n" + sim);
			}
			
			else if ( num == 29 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l29t1, l29t2, l29t3, l29t4, l29t5, l29t6, l29t7, l29t8, l29t9, l29t10, l29t11, l29t12, l29t13, l29t14, l29t15, l29t16, l29t17, l29t18}, "#    Team           MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Liga Bancomer MX (Mexico)\n" + sim);
			}
			
			else if ( num == 30 )
			{
				// Eastern Conference
				LeagueTableSimulator simEastern = new LeagueTableSimulator(numWeeks, new Team[] {l30et1, l30et2, l30et3, l30et4, l30et5, l30et6, l30et7, l30et8, l30et9, l30et10}, "#    Team                    MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Major League Soccer (USA)\nEastern Conference\n" + simEastern);
				
				// Western Conference
				LeagueTableSimulator simWestern = new LeagueTableSimulator(numWeeks, new Team[] {l30wt1, l30wt2, l30wt3, l30wt4, l30wt5, l30wt6, l30wt7, l30wt8, l30wt9}, "#    Team                    MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Western Conference\n" + simWestern);
			}
			
			else if ( num == 31 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l31t1, l31t2, l31t3, l31t4, l31t5, l31t6, l31t7, l31t8, l31t9, l31t10, l31t11, l31t12, l31t13, l31t14, l31t15, l31t16, l31t17, l31t18, l31t19, l31t20}, "#    Team                         MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Primera División (Argentina)\n" + sim);
			}
			
			else if ( num == 32 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l32t1, l32t2, l32t3, l32t4, l32t5, l32t6, l32t7, l32t8, l32t9, l32t10, l32t11, l32t12, l32t13, l32t14, l32t15, l32t16, l32t17, l32t18}, "#    Team                       MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Campeonato Nacional Scotiabank (Chile)\n" + sim);
			}
			 
			else if ( num == 33 )
			{
				LeagueTableSimulator sim = new LeagueTableSimulator(numWeeks, new Team[] {l33t1, l33t2, l33t3, l33t4, l33t5, l33t6, l33t7, l33t8, l33t9, l33t10, l33t11, l33t12, l33t13, l33t14, l33t15, l33t16, l33t17, l33t18}, "#    Team                    MP  Win  Draw  Loss  For  Against  Difference  Points", dS);
				System.out.println("Liga Postobón (Colombia)\n" + sim);
			}
			
			System.out.println("Play again?   1 = Yes   2 = No");
			int playAgain = keyboard.nextInt();
		
			if (playAgain == 2)
				replay = false;
		}
	keyboard.close();
	}
}