# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The move_base package provides an implementation of an action (see the  package)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "actionlib base-local-planner catkin-native clear-costmap-recovery cmake-modules costmap-2d dynamic-reconfigure geometry-msgs message-generation message-runtime move-base-msgs nav-core nav-msgs navfn pluginlib roscpp rospy rotate-recovery std-srvs tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/move_base/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "52a77c7ca9df0b360274cc2c425b130f"
SRC_URI[sha256sum] = "c768c60913da1102499855e0b2bb6b0db241a67506654e34d631057836b4dc50"
S = "${WORKDIR}/navigation-release-release-kinetic-move_base-1.14.2-0"

inherit catkin
