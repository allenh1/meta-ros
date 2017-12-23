# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ardrone_autonomy is a ROS driver for Parrot AR-Drone 1.0 and 2.0 quadrocopters. "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "binutils camera-info-manager catkin-native daemontools git gtk2 image-transport libiw-dev libudev-dev libxml2 message-generation message-runtime nav-msgs roscpp roslint sdl sensor-msgs std-srvs tf"
SRC_URI = "https://github.com/AutonomyLab/ardrone_autonomy-release/archive/release/kinetic/ardrone_autonomy/1.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3b8ddc6ca41d1b3597d9dae8e9c3b74d"
SRC_URI[sha256sum] = "cae1ffbcd105769bb2a301bfcada004820db497d361e3c9ca1835a18fdf95cab"
S = "${WORKDIR}/ardrone_autonomy-release-release-kinetic-ardrone_autonomy-1.4.1-0"

inherit catkin
