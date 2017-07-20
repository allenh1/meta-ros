# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS Python and C++ interfaces for universally unique identifiers."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin roscpp rospy uuid-msgs"
SRC_URI = "https://github.com/ros-geographic-info/unique_identifier-release/archive/release/lunar/unique_id/1.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "18d8f4c2e5c2930f61fa93707e690d7e"
SRC_URI[sha256sum] = "e45fcbeaabf28d27cc227a46aaa801fa1b33d5da775556cfa8e132c080aaf230"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
