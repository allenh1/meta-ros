# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Allows multipoint communication between rosserial      nodes connected to an xbe"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs python-serial rospy rosserial-msgs rosserial-python"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/kinetic/rosserial_xbee/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d02116f83e36eb4f6969d13ca22fbb94"
SRC_URI[sha256sum] = "f69d257d4dc44ea72e9a6eaacadb7b9b836f7cd5d7709d43313a3f2ef9389b4e"
S = "${WORKDIR}/rosserial-release-release-kinetic-rosserial_xbee-0.7.7-0"

inherit catkin
