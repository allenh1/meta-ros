# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver for IDS Imaging uEye cameras."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers catkin-native dynamic-reconfigure image-transport nodelet roscpp roslaunch roslib rostest"
SRC_URI = "https://github.com/kmhallen/${PN}-release/archive/release/kinetic/${PN}/0.0.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "338babba15249af630fb2ac1eed39234"
SRC_URI[sha256sum] = "f1c2687559e090ce3a4e5c4fceb484286894f0e33ff114dda6ccb6b831600b52"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.0.10-0"

inherit catkin
