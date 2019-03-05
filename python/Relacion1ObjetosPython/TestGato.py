# coding=utf8
'''
Created on 17 ene. 2019
Programa que prueba la clase GatoSimple
@author: d18momoa
'''
from Relacion1ObjetosPython import GatoSimple
#main
garfield = GatoSimple.GatoSimple("macho")
print("hola gatito")
garfield.maulla();
print("toma tarta")
garfield.come("tarta selva negra")
print("toma pescado, a ver si esto te gusta")
garfield.come("pescado")
tom =  GatoSimple.GatoSimple("macho")
print("Tom, toma sopita de verduras")
tom.come("sopa de verduras")
lisa =  GatoSimple.GatoSimple("hembra")
print("gatitos, a ver cómo maulláis")
garfield.maulla()
tom.maulla()
lisa.maulla()
garfield.peleaCon(lisa)
lisa.peleaCon(tom)
tom.peleaCon(garfield)