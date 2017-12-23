# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is a node that can playing mp3 file.     This package is using mpg3"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-Utility-release/archive/release/kinetic/ros_mpg321_player/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8514872f8e19b88f39843ed5402ac39d"
SRC_URI[sha256sum] = "733f02d73165b24e2afa15730eef7559338bd19a0be36b28ac966946bdb28dce"
S = "${WORKDIR}/ROBOTIS-Utility-release-release-kinetic-ros_mpg321_player-0.1.2-0"

inherit catkin
