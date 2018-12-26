package eu.printingin3d.building;

import eu.printingin3d.javascad.coords.Angles3d;
import eu.printingin3d.javascad.coords.Coords3d;
import eu.printingin3d.javascad.coords.Dims3d;
import eu.printingin3d.javascad.models.Abstract3dModel;
import eu.printingin3d.javascad.models.Cube;
import eu.printingin3d.javascad.models.Cylinder;
import eu.printingin3d.javascad.tranzitions.Difference;
import eu.printingin3d.javascad.tranzitions.Union;

import java.util.ArrayList;
import java.util.List;

class Building extends Union {


    Building() {super(getModels());}

	private static List<Abstract3dModel> getModels() {
		//полная модель
		List<Abstract3dModel> models = new ArrayList<Abstract3dModel>();

		Union first = new Union(
				//здание
				new Cube(new Dims3d(1000, 1800, 550)).move(new Coords3d(0, 100, 180)),
				new Cube(new Dims3d(1000, 650, 700)).move(new Coords3d(0, -1125, 255)),
                                new Cube(new Dims3d(1000, 650, 700)).move(new Coords3d(0, 700, 255)),

                        
                        
				//крыша 1

				new Cube(new Dims3d(1000,500,20)).rotate(new Angles3d(-35,0,0)).move(new Coords3d(0,-975,740)),
				new Cube(new Dims3d(1000,500,20)).rotate(new Angles3d(35,0,0)).move(new Coords3d(0,-1275,740)),
				new Cube(new Dims3d(400,700,20)).rotate(new Angles3d(0,45,0)).move(new Coords3d(370,-1125,740)),
                        
				new Cube(new Dims3d(400,700,20)).rotate(new Angles3d(0,-45,0)).move(new Coords3d(-370,-1125,740)),

                                //крыша 2

        
                                new Cube(new Dims3d(1000,500,20)).rotate(new Angles3d(-35,0,0)).move(new Coords3d(0,850,740)),
				new Cube(new Dims3d(1000,500,20)).rotate(new Angles3d(35,0,0)).move(new Coords3d(0,550,740)),
				new Cube(new Dims3d(400,700,20)).rotate(new Angles3d(0,45,0)).move(new Coords3d(350,700,740)),
                        
				new Cube(new Dims3d(400,700,20)).rotate(new Angles3d(0,-45,0)).move(new Coords3d(-350,700,740)),
                        
				new Cube(new Dims3d(0,0,0)).move(new Coords3d(0,0,0))
		              );
				//обрезание предметов
		                Difference second = new Difference(first,
				//крыша 1
				new Cube(new Dims3d(1050,500,350)).rotate(new Angles3d(35,0,0)).move(new Coords3d(0,-1375,896)),
				new Cube(new Dims3d(400,700,200)).rotate(new Angles3d(0,45,0)).move(new Coords3d(446,-1125,820)),
				new Cube(new Dims3d(1800,500,250)).rotate(new Angles3d(-35,0,0)).move(new Coords3d(300,-900,853)),
                                        
                                new Cube(new Dims3d(1800,500,250)).rotate(new Angles3d(45,0,-90)).move(new Coords3d(-450,-900,853)),
                                 //крыша 2
				new Cube(new Dims3d(1050,500,350)).rotate(new Angles3d(35,0,0)).move(new Coords3d(0,450,896)),
				new Cube(new Dims3d(1000,700,200)).rotate(new Angles3d(0,45,0)).move(new Coords3d(446,650,820)),
				new Cube(new Dims3d(1800,500,250)).rotate(new Angles3d(-35,0,0)).move(new Coords3d(280,925,853)),
                                        
		                new Cube(new Dims3d(1800,500,250)).rotate(new Angles3d(45,0,-90)).move(new Coords3d(-430,925,853)),
		
				//окно 1
				new Cube(new Dims3d(130,150,150)).move(new Coords3d(500,-1110,450)),
				new Cylinder(30,70).rotate(new Angles3d(0,90,0)).move(new Coords3d(500,-1110,500)),
				//окно 2
				new Cube(new Dims3d(130,150,150)).move(new Coords3d(500,700,450)),
				new Cylinder(30,70).rotate(new Angles3d(0,90,0)).move(new Coords3d(500,700,500)),

                                //помещение
			        new Cube(new Dims3d(500, 1450, 250)).move(new Coords3d(205, -90, 140)),//120
				//ВХОД
				new Cube(new Dims3d(100,350,500)).move(new Coords3d(500,-200,-50)),
				new Cylinder(100,178).rotate(new Angles3d(0,90,0)).move(new Coords3d(500,-200,145)),

				new Cube(new Dims3d(300,50,315)).move(new Coords3d(265,975,100)),
				new Cube(new Dims3d(300,50,275)).move(new Coords3d(265,925,120)),
				new Cube(new Dims3d(300,50,230)).move(new Coords3d(265,875,142)),
				new Cube(new Dims3d(300,177,180)).move(new Coords3d(265,763,167)),//265,
				new Cube(new Dims3d(100,50,120)).move(new Coords3d(265,650,140)),
				new Cylinder(100,50).rotate(new Angles3d(90,0,0)).move(new Coords3d(265,650,200))
		);
		models.add(second);
		return models;
	}
}