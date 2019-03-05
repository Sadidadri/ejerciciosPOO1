# coding=utf8
'''
Created on 16 ene. 2019

@author: d18momoa
'''
class GatoSimple:
    #Constructor
    def __init__(self,sexo): 
        self.s = sexo
    #Setters y Getters
    def setColor(self,color):
        self.__c = color
    def setRaza(self,raza):
        self.__r = raza
    def setEdad(self,edad):
        self.__e = edad
    def setPeso(self,peso):
        self.__p = peso
    def getSexo(self):
        return self.__s
    #Funciones
    """Hace que el gato maulle"""
    def maulla(self):
        print("Miauuuu")
    """Hace que el gato ronronee"""
    def ronronea(self):
        print("mrrrrrr")
    """
    Hace que el gato coma
    A los gatos les gusta el pescado, si le damos otra comida
    la rechazar�.
    param: comida la comida que se le ofrece al gato
    """
    def come(self,comida):
        if(comida=="pescado"):
            print("Hmmmm, gracias")
        else:
            print("Lo siento, yo solo como pescado")
    """
    Pone a pelear dos gatos.
    Solo se van a pelear dos machos entre sí.
    param: contrincante es el gato contra el que pelear
    """
    def peleaCon(self,contrincante):
        if(self.s == "hembra"):
            print("No me gusta pelear")
        else:
            if(contrincante.s =="hembra"):
                print("No peleo contra gatitas")
            else:
                print("Ven aqui que te vas a enterar")
