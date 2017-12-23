# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This planner attempts to find a legal place to put a carrot for the robot to fol"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "base-local-planner catkin-native costmap-2d eigen nav-core pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/carrot_planner/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "665385456edcdcfa695ec48231ded723"
SRC_URI[sha256sum] = "0a4d6c8def6f16b487bd37289b4273535c175d33de69ce1072ae2c52fb9bd2d4"
S = "${WORKDIR}/navigation-release-release-kinetic-carrot_planner-1.14.2-0"

inherit catkin
