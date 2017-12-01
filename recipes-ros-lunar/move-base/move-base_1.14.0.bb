# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The move_base package provides an implementation of an action (see the  package)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "actionlib base-local-planner catkin-native clear-costmap-recovery cmake-modules costmap-2d dynamic-reconfigure geometry-msgs message-generation message-runtime move-base-msgs nav-core nav-msgs navfn pluginlib roscpp rospy rotate-recovery std-msgs std-srvs tf visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/move_base/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "878f9dbf17adba90f8dfe1eb976be01f"
SRC_URI[sha256sum] = "1b8cfbb245b1faaa093b26c9929cfd2fe6f9179f083dabc1b4f91c5b085ff1c2"
S = "${WORKDIR}/navigation-release-release-lunar-move_base-1.14.0-0"

inherit catkin
