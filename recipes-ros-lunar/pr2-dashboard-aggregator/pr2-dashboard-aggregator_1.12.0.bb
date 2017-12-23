# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simple script that aggregates all of the topics that a "pr2_dashboard" app mig"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin pr2-msgs rospy std-msgs"
SRC_URI = "https://github.com/ros-gbp/pr2_common-release/archive/release/lunar/pr2_dashboard_aggregator/1.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cf34c2316c4f1083d3404f82db46a9ea"
SRC_URI[sha256sum] = "f537138be876c11a25d4dc3515a6db2a79f663f1bddeda7e0980171142996005"
S = "${WORKDIR}/pr2_common-release-release-lunar-pr2_dashboard_aggregator-1.12.0-0"

inherit catkin
