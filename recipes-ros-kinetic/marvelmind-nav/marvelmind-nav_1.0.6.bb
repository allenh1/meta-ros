# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Marvelmind local navigation system"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native message-generation message-runtime roscpp rospy std-msgs visualization-msgs"
SRC_URI = "https://github.com/MarvelmindRobotics/marvelmind_nav-release/archive/release/kinetic/marvelmind_nav/1.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dbfe5d55a06ea23529ebe3668d8e7d7a"
SRC_URI[sha256sum] = "6440441b5968242bb2f619c3703dfa190115d8eeb4e1d44fd0463153b7a042b4"
S = "${WORKDIR}/marvelmind_nav-release-release-kinetic-marvelmind_nav-1.0.6-0"

inherit catkin
