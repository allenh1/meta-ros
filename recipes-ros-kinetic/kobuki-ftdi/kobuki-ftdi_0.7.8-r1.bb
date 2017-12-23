# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Utilities for flashing and enabling Kobuki's USB connection. 	    This package c"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-command-line ftdi-eeprom libftdi-dev libusb-dev pkgconfig"
SRC_URI = "https://github.com/yujinrobot-release/kobuki_core-release/archive/release/kinetic/kobuki_ftdi/0.7.8-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2fa2232afe0b0c510ccb0815bfdc44cd"
SRC_URI[sha256sum] = "c9469f2e65acc68339b7b100eba98e364ed334be32c22519c38e55f1cf5ee4ee"
S = "${WORKDIR}/kobuki_core-release-release-kinetic-kobuki_ftdi-0.7.8-1"

inherit catkin
