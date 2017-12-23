# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generates waypoint yaml file"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs rospy"
SRC_URI = "https://github.com/jihoonl/waypoint-release/archive/release/kinetic/waypoint_generator/0.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aa3d5f084ade2b08de704970b419fbee"
SRC_URI[sha256sum] = "a6910dbbe3a5b557a592dcae66e6c6b239b63e49d69117aff907c8429899d2a4"
S = "${WORKDIR}/waypoint-release-release-kinetic-waypoint_generator-0.0.1-0"

inherit catkin
