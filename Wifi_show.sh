#!/bin/bash

loading() {
clear
printf " \e[1;31m[\e[0m\e[1;77m~\e[0m\e[1;31m]\e[0m\e[1;93m Run as super user, e.g.\e[0m\e[1;96m sudo bash filename.sh \e[1;93m or\e[0m \e[0m\e[1;96m./filename.sh\n"
sleep 5 
clear
printf "\e[1;92m"
printf "\n▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒ Loading ...\n"
sleep 0.1
clear
printf "\n▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒ Loading ...\n"
sleep 0.1
clear
printf "\n▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒ Loading ...\n"
sleep 0.1
clear
printf "\n▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒ Loading ...\n"
sleep 0.1
clear
printf "\n▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒ Loading ...\n"
sleep 0.1
clear
printf "\n▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒ Loading ...\n"
sleep 0.1
clear
printf "\n▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒ Loading ...\n"
sleep 0.1
clear
printf "\n▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒ Loading ...\n"
sleep 0.1
clear
printf "\n▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒ Loading ...\n"
sleep 0.1
clear
printf "\n▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒ Loading ...\n"
sleep 0.1
clear
printf "\n▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒ Loading ...\n"
sleep 0.1
clear
printf "\n▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒ Loading ...\n"
sleep 0.1
clear
printf "\n▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒ Loading ...\n"
sleep 0.1
clear
printf "\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒ Loading ...\n"
sleep 0.1
clear
printf "\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Loading ...\n"
sleep 0.1
}
loading
clear
ifconfig
read -p $' \e[1;31m[\e[0m\e[1;77m~\e[0m\e[1;31m]\e[0m\e[1;92m Select an interface: \e[0m\e[1;96m\en' interface
airmon-ng check kill
clear
sleep 0.5
printf "\nStarting monitor mode .\n"
sleep 0.75
clear 
printf "\nStarting monitor mode ..\n"
sleep 0.75
clear 
printf "\nStarting monitor mode ...\n"
sleep 0.75
clear
airmon-ng start $interface
mode="${interface}mon"
sleep 2
airodump-ng $mode
clear
sleep 0.1
printf "\nStoping monitor mode .\n"
sleep 0.75
clear 
printf "\nStoping monitor mode ..\n"
sleep 0.75
clear 
printf "\nStoping monitor mode ...\n"
sleep 0.75
clear
airmon-ng stop $mode
sleep 0.1
clear
sleep 0.1
printf "\nRestarting network manager .\n"
sleep 0.75
clear 
printf "\nRestarting network manager ..\n"
sleep 0.75
clear 
printf "\nRestarting network manager ...\n"
sleep 0.75
clear
service network-manager restart
clear
