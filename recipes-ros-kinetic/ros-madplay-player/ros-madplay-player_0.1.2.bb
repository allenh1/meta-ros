# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is a node that can playing mp3 file.     This package is using madp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-Utility-release/archive/release/kinetic/ros_madplay_player/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aeeb7df7ce155abbb726688b21855dc0"
SRC_URI[sha256sum] = "fd17095036d9988e46351c2e2ec131840ac6279e857ac7454df5b1514b702052"
S = "${WORKDIR}/ROBOTIS-Utility-release-release-kinetic-ros_madplay_player-0.1.2-0"

inherit catkin
