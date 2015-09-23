from Tkinter import *
import tkMessageBox
import sys
gui=Tk()
gui.title("rajesh kumar sheela")
gui.geometry('450x500+300+300')

#if you set .pack() the .grid will show error

def hello():
    lable1=Label(text="Lable1",fg='pink',bg='black').pack()
    
def text():
    t=ment.get()
    lable=Label(text=t,fg='pink',bg='black').pack()

def mess():
    t=ment.get()
    tkMessageBox.showinfo("Message", t)
# Lables
#lable3=Label(text="Lable3",fg='pink',bg='black').grid(row=0,column=0)
#lable4=Label(text="Lable4",fg='pink',bg='black').grid(row=2,column=0,sticky=W) #W=west N=north
#lable2=Label(text="Lable2",fg='pink',bg='black').place(x=200,y=100)
#lable1=Label(text="Lable1",fg='pink',bg='black').pack()

#l = Label(gui, "Hello World")
#l.pack()
#gui.title("hello")

#canvus
C = Canvas(gui, bg="blue", height=250, width=300)
coord = 10, 50, 240, 210
arc = C.create_arc(coord, start=0, extent=150, fill="red")

#Image in frame
#filename = PhotoImage(file ="v.jpg")
#image = C.create_image(50, 50, anchor=NE, image=filename)
C.pack()

#menu bar
menubar=Menu(gui)
filemenu=Menu(menubar)
filemenu.add_command(label="New")
filemenu.add_command(label="Open")
filemenu.add_command(label="Save")
filemenu.add_command(label="Exit")
menubar.add_cascade(label="File",menu=filemenu)
gui.config(menu=menubar)
#TextBox
ment=StringVar()
textbox=Entry(gui,textvariable=ment).pack()

#button
#button=Button(gui,text="Button",command=hello,fg='red',bg='white').pack()
button=Button(gui,text="Button",command=mess,fg='red',bg='white').pack()

gui.mainloop()  # Standby
