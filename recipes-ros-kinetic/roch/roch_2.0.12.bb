# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roch Project"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roch-follower roch-navigation roch-rapps roch-teleop"
SRC_URI = "https://github.com/SawYerRobotics-release/${PN}-release/archive/release/kinetic/${PN}/2.0.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c3ccf0615d9dc5d29397db079d825be4"
SRC_URI[sha256sum] = "27b0efbd9bc4f8accc384f653974f4a5b9b401be1fc3b087967c0079023b15de"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-2.0.12-0"

inherit catkin
