import speech_recognition as sr
import pyttsx3
import datetime
import pywhatkit
import wikipedia

listener = sr.Recognizer()
hey = pyttsx3.init()
voice = hey.getProperty("voice")
hey.setProperty("voice", voice[1].id)


def talk(text):
    hey.say(text)
    hey.runAndWait()


def take_command():
    try:
        with sr.Microphone() as source:
            print("listening.....")
            voice = listener.listen(source)
            command = listener.recognize_google(voice)
            command = command.lower()
            if "hey" in command:
                command = command.replace("hey", "")

    except:
        pass
    return command


def run_hey():
    command = take_command()
    if "time" in command:
        time = datetime.datetime.now().strftime("%I:%M %p")
        print(time)
        talk("Now it is " + time)
    elif "play" in command:
        song = command.replace("play", "")
        talk("playing" + song)
        pywhatkit.playonyt(song)
    elif "tell me about" in command:
        look_for = command.replace("tell me about", "")
        info = wikipedia.summary(look_for, 1)
        print(info)
        talk(info)
    else:
        talk("I did not get it but I am going to search it for you")
        pywhatkit.search(command)


while True:
    run_hey()
