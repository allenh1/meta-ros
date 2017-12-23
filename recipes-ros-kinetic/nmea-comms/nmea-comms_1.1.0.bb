# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The nmea_comms package provides helper nodes for transmitting and receiving     "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nmea-msgs roscpp roslaunch roslint rostest"
SRC_URI = "https://github.com/ros-drivers-gbp/nmea_comms-release/archive/release/kinetic/nmea_comms/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fad08495bd8529659aaf0709c2b5a10c"
SRC_URI[sha256sum] = "50ef1deacdb9b1bc3f9fa5251264b1a8e7e3fb495828b1e6c47db086a20f5716"
S = "${WORKDIR}/nmea_comms-release-release-kinetic-nmea_comms-1.1.0-0"

inherit catkin
