# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The collision monitor uses the planning scene monitor to read the state of the r"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "catkin-native cob-moveit-config moveit-ros-move-group moveit-ros-planning pluginlib std-msgs tf"
SRC_URI = "https://github.com/ipa320/cob_manipulation-release/archive/release/kinetic/cob_collision_monitor/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4e1fc91c82d4e9b4e98735f17ba28522"
SRC_URI[sha256sum] = "86c57782d1b199f5b2400c27b60a9dc05c13eea798688a014b9d8040af71f7de"
S = "${WORKDIR}/cob_manipulation-release-release-kinetic-cob_collision_monitor-0.7.0-0"

inherit catkin
