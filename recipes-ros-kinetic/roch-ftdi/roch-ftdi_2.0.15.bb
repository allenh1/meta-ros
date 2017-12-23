# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Utilities for flashing and enabling roch's USB connection. 	    This package con"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-command-line ftdi-eeprom libftdi-dev libusb-dev"
SRC_URI = "https://github.com/SawYerRobotics-release/roch_robot-release/archive/release/kinetic/roch_ftdi/2.0.15-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1aa3fff31004caece1c5b6fcd662371c"
SRC_URI[sha256sum] = "e2bd52557ad5e8645672365013360606387554f12bdc6d8fd73efb3337d0fd64"
S = "${WORKDIR}/roch_robot-release-release-kinetic-roch_ftdi-2.0.15-0"

inherit catkin
