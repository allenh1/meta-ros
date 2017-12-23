# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Waypoint Meta package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native waypoint-generator waypoint-touring"
SRC_URI = "https://github.com/jihoonl/waypoint-release/archive/release/kinetic/waypoint_meta/0.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "47eed27944ed07be27a80c05ee182e2c"
SRC_URI[sha256sum] = "f2c1cd84eb8e63d6d6403ed1074d7873cb30175ea2003e5a9f874a84ccad138e"
S = "${WORKDIR}/waypoint-release-release-kinetic-waypoint_meta-0.0.1-0"

inherit catkin
