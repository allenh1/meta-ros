# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS wrapping of gmplot library"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rospy"
SRC_URI = "https://github.com/robustify/${PN}_ros-release/archive/release/kinetic/${PN}/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "449bd62403ee2033b2df104665fac904"
SRC_URI[sha256sum] = "b73fbb676cee85ef6d2fc2e658ee6bc8928dff8d2b2b14efde44870c752364f6"
S = "${WORKDIR}/${PN}_ros-release-release-kinetic-${PN}-1.0.1-0"

inherit catkin
