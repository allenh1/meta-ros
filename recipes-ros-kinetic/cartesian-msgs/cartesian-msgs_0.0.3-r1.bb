# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Stream cartesian commands"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/davetcoleman/cartesian_msgs-release/archive/release/kinetic/cartesian_msgs/0.0.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e7dec0e4ce5dac00e1f5317465add10c"
SRC_URI[sha256sum] = "3c805a4b05bde27a645d82fa6e9773c5bb442188928b67b1daa0939497e9d568"
S = "${WORKDIR}/cartesian_msgs-release-release-kinetic-cartesian_msgs-0.0.3-1"

inherit catkin
