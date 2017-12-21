# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The move_base package provides an implementation of an action (see the  package)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "actionlib base-local-planner catkin-native clear-costmap-recovery cmake-modules costmap-2d dynamic-reconfigure geometry-msgs message-generation message-runtime move-base-msgs nav-core nav-msgs navfn pluginlib roscpp rospy rotate-recovery std-srvs tf visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/move_base/1.15.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f8a7f00a5791ab66c857e84135a73823"
SRC_URI[sha256sum] = "00063d068da3387de0b3ea33d2a1ba2e9dfd9a52f996143d3a422e54601acccc"
S = "${WORKDIR}/navigation-release-release-lunar-move_base-1.15.1-0"

inherit catkin
