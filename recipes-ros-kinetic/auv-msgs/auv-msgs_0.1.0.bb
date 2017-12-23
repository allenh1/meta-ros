# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides message types commonly used with Autonomous Underwater Veh"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geographic-msgs geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/oceansystemslab/auv_msgs-release/archive/release/kinetic/auv_msgs/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1cb4a7e840b58c288d3b7bd0600714a9"
SRC_URI[sha256sum] = "2e110447ae64991a7e8488fd076f2ff5bb7d32e426152d233ba77420041fa619"
S = "${WORKDIR}/auv_msgs-release-release-kinetic-auv_msgs-0.1.0-0"

inherit catkin
